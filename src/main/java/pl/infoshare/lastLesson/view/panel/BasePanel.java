package pl.infoshare.lastLesson.view.panel;

import javax.swing.*;
import java.awt.*;

public abstract class BasePanel extends JPanel {

    public BasePanel() {
        initComponents();
        addComponents();
        configureComponent();
    }

    protected abstract void configureComponent();
    protected abstract void addComponents();
    protected abstract void initComponents();
}