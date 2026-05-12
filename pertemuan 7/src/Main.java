import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("aplikasi pertama");
        frame.setLayout(null);

        JLabel label1 = new JLabel("masukan nama anda: ");
        label1.setBounds(50, 50, 300, 50);

        JTextField textField1 = new JTextField();
        textField1.setBounds(50, 70, 300, 50);

        JButton button1 = new JButton("selesai");
        button1.setBounds(20, 100, 100, 50);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = label1.getText().trim();

                if(nama.equalsIgnoreCase(nama)) {
                    throw new IllegalArgumentException("nama tidak boleh kosong");
                } else {
                    JOptionPane.showMessageDialog(null, String.format("halo %s", nama));
                }
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(button1);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}