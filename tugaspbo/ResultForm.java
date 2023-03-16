package tugaspbo;

import javax.swing.*;
import java.awt.*;

public class ResultForm extends JFrame {
    private JLabel namaLabel;
    private JLabel nimLabel;
    private JButton backButton;

    public ResultForm() {
        super("Result Form");

        namaLabel = new JLabel();
        namaLabel.setHorizontalAlignment(JLabel.CENTER);
        nimLabel = new JLabel();
        nimLabel.setHorizontalAlignment(JLabel.CENTER);

        backButton = new JButton("Kembali");

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(namaLabel);
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

    public void addData(String nama, String nim) {
        namaLabel.setText("Nama: " + nama);
        nimLabel.setText("NIM: " + nim);
    }
}
