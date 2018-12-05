package pl.infoshare.lastLesson.view.scrollPane;
import pl.infoshare.lastLesson.view.component.tabbedPane.MainTabbedPane;

import javax.swing.*;

public class TabsScrollPane extends BaseScrollPane {

    private MainTabbedPane mainTabbedPane;

    @Override
    public void configureComponent() {
    }

    @Override
    void addComponents() {
        add(mainTabbedPane);
    }

    @Override
    void initComponents() {
        mainTabbedPane = new MainTabbedPane();
    }
}