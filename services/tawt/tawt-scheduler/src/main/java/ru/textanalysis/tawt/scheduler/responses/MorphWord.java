package ru.textanalysis.tawt.scheduler.responses;

import java.util.List;

public class MorphWord {
    private List<TransportFormItem> refOmoForms;

    public MorphWord() {
    }

    public MorphWord(List<TransportFormItem> omoForms) {
        this.refOmoForms = omoForms;
    }

    public List<TransportFormItem> getOmoForms() {
        return refOmoForms;
    }

    public void setOmoForms(List<TransportFormItem> refOmoForms) {
        this.refOmoForms = refOmoForms;
    }
}
