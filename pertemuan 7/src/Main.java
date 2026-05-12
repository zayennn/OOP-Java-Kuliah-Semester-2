import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("aplikasi pertama");
        JButton button = new JButton("click aku");

        button.setBounds(100, 100, 100, 50);

        frame.add(button);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}