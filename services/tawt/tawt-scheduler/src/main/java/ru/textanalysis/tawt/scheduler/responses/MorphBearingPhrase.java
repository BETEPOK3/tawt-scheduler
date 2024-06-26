package ru.textanalysis.tawt.scheduler.responses;

import java.util.List;

public class MorphBearingPhrase {
    private List<MorphWord> morphWordList;

    public MorphBearingPhrase() {
    }

    public MorphBearingPhrase(List<MorphWord> morphWordList) {
        this.morphWordList = morphWordList;
    }

    public List<MorphWord> getMorphWordList() {
        return morphWordList;
    }

    public void setMorphWordList(List<MorphWord> morphWordList) {
        this.morphWordList = morphWordList;
    }
}
