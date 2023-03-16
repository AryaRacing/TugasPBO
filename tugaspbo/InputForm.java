package tugaspbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputForm extends JFrame {

    private JLabel nameLabel, nimLabel, menu;
    private JTextField nameField, nimField;
    private JButton submitButton, logoutButton;
    private ResultForm resultForm;

    public InputForm() {
        super("Input Form");

        setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Name:");
        nimLabel = new JLabel("NIM:");
        nameField = new JTextField();
        nimField = new JTextField();
        submitButton = new JButton("Submit");
        logoutButton = new JButton("Logout");
        
        add(nameLabel);
        add(nameField);
        add(nimLabel);
        add(nimField);
        add(logoutButton, "North");
        add(submitButton);
        
        setLocation(100,100);
        setDefaultCloseOperation(3);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String nim = nimField.getText();

                resultForm.addData(name, nim);

                nameField.setText("");
                nimField.setText("");

                resultForm.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(InputForm.this,
                        "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    setVisible(false);
                    new LoginForm().setVisible(true);
                }
            }
        });

  
        resultForm = new ResultForm();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new InputForm();
    }
}

