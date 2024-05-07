package ru.textanalysis.tawt.scheduler.mappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.textanalysis.tawt.ms.model.sp.BearingPhrase;
import ru.textanalysis.tawt.ms.model.sp.Word;
import ru.textanalysis.tawt.scheduler.responses.CursorToFormInWordItem;
import ru.textanalysis.tawt.scheduler.responses.TransportBearingPhraseSPItem;
import ru.textanalysis.tawt.scheduler.responses.TransportFormItem;
import ru.textanalysis.tawt.scheduler.responses.TransportOmoFormSPItem;
import ru.textanalysis.tawt.scheduler.responses.TransportWordSpItem;

import java.util.LinkedList;
import java.util.List;

public class MapperTransportSP {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private final MapperTransportGama mapperTransportGama;

    public MapperTransportSP(MapperTransportGama mapperTransportGama) {
        this.mapperTransportGama = mapperTransportGama;
    }

    public TransportBearingPhraseSPItem build(BearingPhrase bearingPhraseSP) {
        TransportBearingPhraseSPItem spItem = new TransportBearingPhraseSPItem();

        List<TransportOmoFormSPItem> transportOmoFormSPItems = new LinkedList<>();
        Word mainWord = bearingPhraseSP.getMainWord();

        mainWord.getForms().forEach(mainForm -> {
            TransportFormItem item = mapperTransportGama.buildForm(mainForm);

            List<CursorToFormInWordItem> cursorToFormInWordItems = new LinkedList<>();
            mainWord.getDependents().forEach(dependentWord -> {
                dependentWord.getForms().forEach(cursorToFormInWord -> {
                    CursorToFormInWordItem cursorToFormInWordItem1 = new CursorToFormInWordItem();
                    cursorToFormInWordItem1.setMainCursorsHashcode(cursorToFormInWord.hashCode());
                    cursorToFormInWordItem1.setMainCursorsWordSPHashcode(dependentWord.hashCode());
                    cursorToFormInWordItems.add(cursorToFormInWordItem1);
                });
            });

            TransportOmoFormSPItem transportOmoFormSPItem = new TransportOmoFormSPItem();
            transportOmoFormSPItem.setCurrencyOmoForm(item);
            transportOmoFormSPItem.setDependentCursors(cursorToFormInWordItems);
            transportOmoFormSPItems.add(transportOmoFormSPItem);
        });

        List<TransportWordSpItem> words = new LinkedList<>();
        bearingPhraseSP.getWords().forEach(wordSP -> {
            TransportWordSpItem word = new TransportWordSpItem();
            List<TransportOmoFormSPItem> omoForms = new LinkedList<>();
            wordSP.getForms().forEach(form -> {
                TransportOmoFormSPItem omoFormSPItem = new TransportOmoFormSPItem();
                TransportFormItem item = mapperTransportGama.buildForm(form);
                Integer mainCursorsHashcode;
                Integer mainCursorsWordSPHashcode;
                if (wordSP.getMains() != null) {
                    mainCursorsHashcode = form.hashCode();
                    mainCursorsWordSPHashcode = wordSP.hashCode();
                } else {
                    mainCursorsHashcode = null;
                    mainCursorsWordSPHashcode = null;
                }
                omoFormSPItem.setCurrencyOmoForm(item);
                CursorToFormInWordItem cursorToFormInWordItem = new CursorToFormInWordItem();
                cursorToFormInWordItem.setMainCursorsHashcode(mainCursorsHashcode);
                cursorToFormInWordItem.setMainCursorsWordSPHashcode(mainCursorsWordSPHashcode);
                omoFormSPItem.setMainCursors(cursorToFormInWordItem);

                List<CursorToFormInWordItem> cursorToFormInWordItems = new LinkedList<>();
                wordSP.getDependents().forEach(dependentWord -> {
                    dependentWord.getForms().forEach(dependentForm -> {
                        CursorToFormInWordItem cursorToFormInWordItem1 = new CursorToFormInWordItem();
                        cursorToFormInWordItem1.setMainCursorsHashcode(dependentForm.hashCode());
                        cursorToFormInWordItem1.setMainCursorsWordSPHashcode(wordSP.hashCode());
                        cursorToFormInWordItems.add(cursorToFormInWordItem1);
                    });
                });

                omoFormSPItem.setDependentCursors(cursorToFormInWordItems);
                omoForms.add(omoFormSPItem);
            });
            word.setOmoForms(omoForms);
            word.setOmoFormSPListHashcode(wordSP.hashCode());
            words.add(word);
        });
        spItem.setMainOmoForms(transportOmoFormSPItems);
        spItem.setWords(words);

        return spItem;
    }
}
