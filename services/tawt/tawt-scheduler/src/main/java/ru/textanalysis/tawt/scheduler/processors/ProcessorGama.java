package ru.textanalysis.tawt.scheduler.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.gama.Gama;
import ru.textanalysis.tawt.gama.parser.GamaParser;
import ru.textanalysis.tawt.scheduler.entities.TextRequest;

public class ProcessorGama implements Processor {
    private final Gama gama;

    private final ObjectMapper mapper;

    public ProcessorGama(Gama parser, ObjectMapper mapper) {
        this.gama = parser;
        this.mapper = mapper;
    }

    /**
     * Автоматический морфологический анализ текста.
     * @param json - JSON с входной строкой в ключе text.
     * @return - JSON-представление результата выполнения морфологического анализа.
     */
    public String processTask(String json) throws Exception {
        TextRequest req = mapper.readValue(json, TextRequest.class);
        var parserResult = gama.getMorphBearingPhrase(req.text);

        return mapper.writeValueAsString(parserResult);
    }
}
