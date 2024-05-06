package ru.textanalysis.tawt.scheduler.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.scheduler.requests.TextRequest;
import ru.textanalysis.tawt.sp.api.ISyntaxParser;

public class ProcessorSyntax implements Processor {
    private final ISyntaxParser syntax;

    private final ObjectMapper mapper;

    public ProcessorSyntax(ISyntaxParser syntax, ObjectMapper mapper) {
        this.syntax = syntax;
        this.mapper = mapper;
    }

    /**
     * Автоматический морфологический анализ текста.
     * @param json - JSON с входной строкой в ключе text.
     * @return - JSON-представление результата выполнения морфологического анализа.
     */
    public String processTask(String json) throws Exception {
        TextRequest req = mapper.readValue(json, TextRequest.class);
        var parserResult = syntax.getTreeSentence(req.text);

        return mapper.writeValueAsString(parserResult);
    }
}
