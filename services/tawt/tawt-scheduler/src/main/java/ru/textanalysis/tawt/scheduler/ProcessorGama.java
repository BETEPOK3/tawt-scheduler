package ru.textanalysis.tawt.scheduler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.textanalysis.tawt.gama.GamaImpl;
import ru.textanalysis.tawt.scheduler.entities.TextRequest;

public class ProcessorGama {
    private final GamaImpl gama;

    private final ObjectMapper mapper;

    public ProcessorGama() {
        gama = new GamaImpl();
        gama.init();

        mapper = new ObjectMapper();
    }

    /**
     * Проводит графематический + морфологический анализ над текстом.
     *
     * @param json - строка в формате JSON.
     * @return - результат работы gama в формате JSON.
     */
    public String ParseText(String json) throws JsonProcessingException {
        TextRequest text = mapper.readValue(json, TextRequest.class);

        var result = gama.getMorphBearingPhrase(text.text);

        return result.toString();
    }
}
