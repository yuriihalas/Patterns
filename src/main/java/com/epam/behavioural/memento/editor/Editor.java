package com.epam.behavioural.memento.editor;

import java.util.LinkedList;
import java.util.List;

public class Editor {
    private String text;
    private List<MementoText> previousText;

    public Editor(String text) {
        this.text = text;
        this.previousText = new LinkedList<>();
    }

    public void addText(String text) {
        previousText.add(new MementoText());
        this.text += text;
    }

    public String getText() {
        return text;
    }

    public void clearAllText() {
        previousText.add(new MementoText());
        this.text = "";
    }

    public void undoChanges() {
        if (!previousText.isEmpty()) {
            final int indexLastChanges = previousText.size() - 1;
            this.text = previousText.get(indexLastChanges).getMementoText();
            previousText.remove(indexLastChanges);
        }
    }

    private class MementoText {
        private String mementoText;

        public MementoText() {
            this.mementoText = text;
        }

        public String getMementoText() {
            return mementoText;
        }
    }
}
