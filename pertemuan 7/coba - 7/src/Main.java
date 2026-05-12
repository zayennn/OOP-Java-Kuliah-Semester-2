import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("flexbox: flex direction");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(
                new BoxLayout(panel, BoxLayout.Y_AXIS)
        );

        JTextField textFieldName  = new JTextField();
        textFieldName.setMaximumSize(new Dimension(300, 30));
        textFieldName.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button = new JButton("check nama kamu");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText().trim();
                if (name.equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "nama tidak boleh kosong");
                } else {
                    JOptionPane.showMessageDialog(null, String.format("halo %s", name));
                }
            }
        });

        panel.add(new JLabel("masukan nama anda : "));
        panel.add(textFieldName);
        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);
    }
}