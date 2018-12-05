package pl.infoshare.lastLesson.view;

import pl.infoshare.lastLesson.view.panel.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static final String TITLE = "Moja apka";
    private static final Dimension SIZE = new Dimension(500, 500);

    public Window() throws HeadlessException {
        super(TITLE);
        addComponents();
        configureWindow();
    }

    private void addComponents(){
        add(new MainPanel(), BorderLayout.CENTER);
    }

    private void configureWindow(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SIZE);
        setVisible(true);
    }
}
