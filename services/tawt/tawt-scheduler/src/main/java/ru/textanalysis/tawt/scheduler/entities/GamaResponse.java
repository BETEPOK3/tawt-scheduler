package ru.textanalysis.tawt.scheduler.entities;

import ru.textanalysis.tawt.ms.model.gama.BearingPhrase;
import ru.textanalysis.tawt.ms.model.gama.Word;
import ru.textanalysis.tawt.ms.model.jmorfsdk.Form;

import java.util.List;

public class GamaResponse {
    private final List<GamaResponseWord> words;


    public GamaResponse(BearingPhrase phrase) {
        words = phrase.getWords().stream().map(GamaResponseWord::new).toList();
    }

    public List<GamaResponseWord> getWords() {
        return words;
    }

    public static class GamaResponseWord {


        public GamaResponseWord(Word word) {

        }

        public static class GamaResponseForm {
            public GamaResponseForm(Form form) {

            }
        }
    }
}
