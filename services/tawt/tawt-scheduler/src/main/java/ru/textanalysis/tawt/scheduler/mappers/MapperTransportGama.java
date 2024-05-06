package ru.textanalysis.tawt.scheduler.mappers;

import ru.textanalysis.tawt.ms.model.gama.BearingPhrase;
import ru.textanalysis.tawt.ms.model.gama.Paragraph;
import ru.textanalysis.tawt.ms.model.gama.Sentence;
import ru.textanalysis.tawt.ms.model.gama.Word;
import ru.textanalysis.tawt.ms.model.jmorfsdk.Form;
import ru.textanalysis.tawt.ms.model.jmorfsdk.TypeForms;
import ru.textanalysis.tawt.scheduler.responses.*;

import java.util.List;
import java.util.stream.Collectors;

public class MapperTransportGama {

    public MapperTransportGama() {
    }

    public TransportFormItem buildForm(Form form) {
        TransportFormItem item = new TransportFormItem();

        item.setInitialFormKey(form.getInitialFormKey());
        item.setMorfCharacteristics(form.getMorphCharacteristics());
        item.setTypeOfSpeech(form.getTypeOfSpeech());
        item.setInitialFormString(form.getInitialFormString());
        item.setFormKeyInBD(form.getMyFormKey());
        item.setTypeFormId(form.getTypeForm().getId());
        item.setInitialForm(form.isInitialForm());
        item.setTypeForm(form.getTypeForm());
        item.setOrder(form.getOrder());
        item.setOrderInitialForm((form.getInitialForm()).getOrder());
        if (form.getTypeForm() == TypeForms.NUMBER) {
            item.setMyString(form.getInitialFormString());
        } else {
            item.setMyString(form.getMyString());
        }
        return item;
    }

    public List<TransportFormItem> buildWord(Word word) {
        return word
                .stream()
                .parallel()
                .map(this::buildForm)
                .collect(Collectors.toList());
    }

    public List<MorphWord> buildMorphBearingPhrase(BearingPhrase bearingPhrase) {
        return bearingPhrase
                .getWords()
                .parallelStream()
                .map(this::buildWord)
                .map(MorphWord::new)
                .collect(Collectors.toList());
    }

    public List<MorphBearingPhrase> buildMorphSentence(Sentence sentence) {
        return sentence
                .getBearingPhrases()
                .parallelStream()
                .map(this::buildMorphBearingPhrase)
                .map(MorphBearingPhrase::new)
                .collect(Collectors.toList());

    }

    public List<MorphSentence> buildMorphParagraph(Paragraph paragraph) {
        return paragraph
                .parallelStream()
                .map(this::buildMorphSentence)
                .map(MorphSentence::new)
                .collect(Collectors.toList());
    }

    public List<MorphParagraph> buildMorphText(List<Paragraph> paragraphList) {
        return paragraphList
                .parallelStream()
                .map(this::buildMorphParagraph)
                .map(MorphParagraph::new)
                .collect(Collectors.toList());
    }
}
