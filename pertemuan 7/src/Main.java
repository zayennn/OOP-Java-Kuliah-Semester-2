import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pertemuan ke 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("button 1"));

        frame.add(panel);
        frame.setVisible(true);
    }
}