package pl.infoshare.lesson5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise3 extends JFrame {

    public static void main(String[] args){
        new Exercise3().setVisible(true);
    }

    public Exercise3() {
        this.setTitle("Exercise 3");
        this.setBounds(300, 300, 300, 300);
        initComponents();


        this.setDefaultCloseOperation(3);
    }

    public void initComponents(){
        panel.add(addUser);
        panel.add(readUsers);
        panel2.add(cos);
        panel3.setBackground(Color.GRAY);


        panel3.setLayout(new BorderLayout());
        textArea.setBackground(Color.GRAY);
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        panel3.add(textArea, BorderLayout.SOUTH);
        panel3.add(textField, BorderLayout.NORTH);
        panel3.add(passwordField, BorderLayout.CENTER);
        this.getContentPane().add(panel, BorderLayout.SOUTH);
        this.getContentPane().add(panel2, BorderLayout.NORTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        addUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User user = new User(textField.getText(), passwordField.getText());
            }
        });
        readUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("dfghj");
            }
        });
    }


    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JButton addUser = new JButton("Add user");
    JButton readUsers = new JButton("Read users");
    JLabel cos = new JLabel("Stworz nowego uzytkownika :)");
    JTextField textField = new JTextField(1);
    JPasswordField passwordField = new JPasswordField(1);
    JTextArea textArea = new JTextArea(1,10);
    User user;
}
