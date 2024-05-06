package ru.textanalysis.tawt.scheduler.responses;

import java.util.LinkedList;
import java.util.List;

public class TransportOmoFormSPItem {
    private TransportFormItem currencyOmoForm;
    private CursorToFormInWordItem mainCursors;
    private List<CursorToFormInWordItem> dependentCursors = new LinkedList<>();

    public CursorToFormInWordItem getMainCursors() {
        return mainCursors;
    }

    public void setMainCursors(CursorToFormInWordItem mainCursors) {
        this.mainCursors = mainCursors;
    }

    public List<CursorToFormInWordItem> getDependentCursors() {
        return dependentCursors;
    }

    public void setDependentCursors(List<CursorToFormInWordItem> dependentCursors) {
        this.dependentCursors = dependentCursors;
    }

    public TransportFormItem getCurrencyOmoForm() {
        return currencyOmoForm;
    }

    public void setCurrencyOmoForm(TransportFormItem currencyOmoForm) {
        this.currencyOmoForm = currencyOmoForm;
    }


}
