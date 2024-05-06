package ru.textanalysis.tawt.scheduler.responses;

import java.io.Serializable;
import java.util.List;

public class TransportBearingPhraseSPItem implements Serializable {
    private List<TransportOmoFormSPItem> mainOmoForms;
    private List<TransportWordSpItem> words;

    public List<TransportWordSpItem> getWords() {
        return words;
    }

    public void setWords(List<TransportWordSpItem> words) {
        this.words = words;
    }

    public List<TransportOmoFormSPItem> getMainOmoForms() {
        return mainOmoForms;
    }

    public void setMainOmoForms(List<TransportOmoFormSPItem> mainOmoForms) {
        this.mainOmoForms = mainOmoForms;
    }
}
