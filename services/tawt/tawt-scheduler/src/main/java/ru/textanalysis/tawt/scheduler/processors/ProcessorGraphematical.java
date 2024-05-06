package ru.textanalysis.tawt.scheduler.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.graphematic.parser.text.GraphematicParser;
import ru.textanalysis.tawt.scheduler.requests.TextRequest;

public class ProcessorGraphematical implements Processor {
    private final GraphematicParser parser;

    private final ObjectMapper mapper;

    public ProcessorGraphematical(GraphematicParser parser, ObjectMapper mapper) {
        this.parser = parser;
        this.mapper = mapper;
    }

    /**
     * Автоматический графематический анализ текста.
     * @param json - JSON с входной строкой в ключе text.
     * @return - JSON-представление результата выполнения графематического анализа.
     */
    public String processTask(String json) throws Exception {
        TextRequest req = mapper.readValue(json, TextRequest.class);
        var parserResult = parser.parserText(req.text);

        return mapper.writeValueAsString(parserResult);
    }
}
