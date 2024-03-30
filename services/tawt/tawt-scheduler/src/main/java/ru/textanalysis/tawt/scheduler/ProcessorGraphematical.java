package ru.textanalysis.tawt.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import ru.textanalysis.tawt.graphematic.parser.text.GParserImpl;
import ru.textanalysis.tawt.scheduler.entities.TextRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProcessorGraphematical {
    private final GParserImpl parser;

    private final ObjectMapper mapper;

    public ProcessorGraphematical() {
        parser = new GParserImpl();
        mapper = new ObjectMapper();
    }

    /**
     * Проводит графематический анализ над текстом.
     *
     * @param json - строка в формате JSON.
     * @return - распаршенный текст в формате JSON.
     */
    public String ParseText(String json) throws JsonProcessingException {
        TextRequest text = mapper.readValue(json, TextRequest.class);

        var parserResult = parser.parserText(text.text);

        return mapper.writeValueAsString(parserResult);
    }
}
