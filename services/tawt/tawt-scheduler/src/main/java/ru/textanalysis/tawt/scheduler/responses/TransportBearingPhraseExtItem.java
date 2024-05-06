package ru.textanalysis.tawt.scheduler.responses;

import java.io.Serializable;
import java.util.List;

public class TransportBearingPhraseExtItem implements Serializable {
    private List<TransportOmoFormExtItem> mainOmoForms;

    public List<TransportOmoFormExtItem> getMainOmoForms() {
        return mainOmoForms;
    }

    public void setMainOmoForms(List<TransportOmoFormExtItem> mainOmoForms) {
        this.mainOmoForms = mainOmoForms;
    }
}
