package ru.textanalysis.tawt.scheduler.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.gama.Gama;
import ru.textanalysis.tawt.scheduler.mappers.MapperTransportGama;
import ru.textanalysis.tawt.scheduler.requests.TextRequest;

public class ProcessorDisambiguation implements Processor {
    private final Gama gama;
    private final ObjectMapper objectMapper;
    private final MapperTransportGama mapperTransportGama;

    public ProcessorDisambiguation(Gama gama, ObjectMapper objectMapper, MapperTransportGama mapperTransportGama) {
        this.gama = gama;
        this.objectMapper = objectMapper;
        this.mapperTransportGama = mapperTransportGama;
    }

    /**
     * Автоматический графематический + морфологический анализ текста с устранением неоднозначности.
     * @param json - JSON с входной строкой в ключе text.
     * @return - JSON-представление результата выполнения морфологического анализа.
     */
    public String processTask(String json) throws Exception {
        TextRequest req = objectMapper.readValue(json, TextRequest.class);
        var sentence = gama.getMorphSentence(req.text);

        sentence.getBearingPhrases().replaceAll(gama::disambiguation);

        var result = mapperTransportGama.buildMorphSentence(sentence);

        return objectMapper.writeValueAsString(result);
    }
}
