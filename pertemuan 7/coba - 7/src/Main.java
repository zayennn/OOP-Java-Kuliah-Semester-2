import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("flexbox: flex direction");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(
                new BoxLayout(panel, BoxLayout.Y_AXIS)
        );

        panel.add(new JLabel("masukan nama anda : "));
        panel.add(new JTextField(15));
        panel.add(new JButton("check nama kamu"));

        frame.add(panel);
    }
}