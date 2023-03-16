package tugaspbo;

import javax.swing.*;
import java.awt.*;

public class ResultForm extends JFrame {
    private JLabel nameLabel;
    private JLabel nimLabel;
    private JButton backButton;

    public ResultForm() {
        super("Result Form");

        nameLabel = new JLabel();
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nimLabel = new JLabel();
        nimLabel.setHorizontalAlignment(JLabel.CENTER);

        backButton = new JButton("Kembali");

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(nameLabel);
        panel.add(nimLabel);
        panel.add(backButton);

        add(panel);

        backButton.addActionListener(e -> {
            setVisible(false);
            new InputForm().setVisible(true);
        });

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        setSize(300, 200);
        setLocationRelativeTo(null);
    }

    public void addData(String name, String nim) {
        nameLabel.setText("Name: " + name);
        nimLabel.setText("NIM: " + nim);
    }
}
