package ru.textanalysis.tawt.scheduler.responses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TransportWordSpItem {
    private List<TransportOmoFormSPItem> omoForms = new LinkedList<>();
    private Integer omoFormSPListHashcode;

    public List<TransportOmoFormSPItem> getOmoForms() {
        return omoForms;
    }

    public void setOmoForms(List<TransportOmoFormSPItem> omoForms) {
        this.omoForms = omoForms;
    }

    public Integer getOmoFormSPListHashcode() {
        return omoFormSPListHashcode;
    }

    public void setOmoFormSPListHashcode(Integer omoFormSPListHashcode) {
        this.omoFormSPListHashcode = omoFormSPListHashcode;
    }
}
