package pl.infoshare.lastLesson.view.scrollPane;

import javax.swing.*;

public abstract class BaseScrollPane extends JScrollPane {

    public BaseScrollPane() {
        addComponents();
        configureComponent();
    }

    abstract void configureComponent();
    abstract void addComponents();
}