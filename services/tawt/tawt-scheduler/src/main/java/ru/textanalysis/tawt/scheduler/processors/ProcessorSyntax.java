package ru.textanalysis.tawt.scheduler.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.ms.model.sp.Sentence;
import ru.textanalysis.tawt.scheduler.mappers.MapperTransportGama;
import ru.textanalysis.tawt.scheduler.mappers.MapperTransportSP;
import ru.textanalysis.tawt.scheduler.requests.TextRequest;
import ru.textanalysis.tawt.scheduler.responses.TransportBearingPhraseSPItem;
import ru.textanalysis.tawt.sp.api.ISyntaxParser;

import java.util.LinkedList;

public class ProcessorSyntax implements Processor {
    private final ISyntaxParser syntax;
    private final ObjectMapper objectMapper;
    private final MapperTransportSP mapperTransportSP;

    public ProcessorSyntax(ISyntaxParser syntax, ObjectMapper objectMapper, MapperTransportSP mapperTransportSP) {
        this.syntax = syntax;
        this.objectMapper = objectMapper;
        this.mapperTransportSP = mapperTransportSP;
    }

    /**
     * Автоматический морфологический анализ текста.
     * @param json - JSON с входной строкой в ключе text.
     * @return - JSON-представление результата выполнения морфологического анализа.
     */
    public String processTask(String json) throws Exception {
        TextRequest req = objectMapper.readValue(json, TextRequest.class);
        Sentence sentence = syntax.getTreeSentence(req.text);

        LinkedList<TransportBearingPhraseSPItem> result = new LinkedList<>();

        for (var bearingPhrase : sentence.getBearingPhrases()) {
            result.add(mapperTransportSP.build(bearingPhrase));
        }

        return objectMapper.writeValueAsString(result);
    }
}
