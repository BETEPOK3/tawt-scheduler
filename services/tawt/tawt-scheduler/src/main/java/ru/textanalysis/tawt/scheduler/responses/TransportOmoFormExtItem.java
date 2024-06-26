package ru.textanalysis.tawt.scheduler.responses;

import java.io.Serializable;
import java.util.List;

public class TransportOmoFormExtItem implements Serializable {
    private TransportFormItem currencyOmoForm;
    private Integer mainWord;
    private List<Integer> dependentWords;

    public TransportFormItem getCurrencyOmoForm() {
        return currencyOmoForm;
    }

    public void setCurrencyOmoForm(TransportFormItem currencyOmoForm) {
        this.currencyOmoForm = currencyOmoForm;
    }

    public Integer getMainWord() {
        return mainWord;
    }

    public void setMainWord(Integer mainWord) {
        this.mainWord = mainWord;
    }

    public List<Integer> getDependentWords() {
        return dependentWords;
    }

    public void setDependentWords(List<Integer> dependentWords) {
        this.dependentWords = dependentWords;
    }
}
