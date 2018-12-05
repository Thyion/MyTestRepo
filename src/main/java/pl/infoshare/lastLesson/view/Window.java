package pl.infoshare.lastLesson.view;



import pl.infoshare.lastLesson.view.component.tabbedPane.MainTabbedPane;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final String TITLE = "Moja apka";
    private static final Dimension SIZE = new Dimension(500, 500);

    public Window() throws HeadlessException {
        super(TITLE);
        configureWindow();
        addComponents();
    }

    private void addComponents(){
        add(new MainTabbedPane());
    }

    private void configureWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SIZE);
        setVisible(true);
    }
}