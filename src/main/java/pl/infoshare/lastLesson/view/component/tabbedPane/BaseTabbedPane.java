package pl.infoshare.lastLesson.view.component.tabbedPane;

import javax.swing.*;

public abstract class BaseTabbedPane extends JTabbedPane {

    public BaseTabbedPane() {
        initComponents();
        addComponents();
        configureComponent();
        setVisible(true);
    }

    abstract void configureComponent();
    abstract void addComponents();
    abstract void initComponents();
}