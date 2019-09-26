package com.epam.behavioural.memento;

import com.epam.behavioural.memento.editor.Editor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerMemento {
    private static final Logger LOG = LogManager.getLogger(RunnerMemento.class);

    public static void main(String[] args) {
        LOG.info("I added List of memento in class editor, so we can do more than only undo last change after " +
            "something, we can undo to start state of object, i think this is better..");
        Editor editor = new Editor("");
        LOG.info(String.format("Text of editor after empty initialization: \"%s\"", editor.getText()));
        editor.addText("Hello my name is Yurii..");
        LOG.info(String.format("Text of editor after add some string: \"%s\"", editor.getText()));
        editor.addText("....I'm 19 y.olddd");
        LOG.info(String.format("Text of editor after add some string: \"%s\"", editor.getText()));
        editor.undoChanges();
        LOG.info(String.format("Text of editor after undo previous changes: \"%s\"", editor.getText()));
        editor.undoChanges();
        LOG.info(String.format("Text of editor after undo previous changes: \"%s\"", editor.getText()));
        editor.clearAllText();
    }
}
