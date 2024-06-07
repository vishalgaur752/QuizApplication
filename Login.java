import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, Back;
    JTextField tfName;

    Login() {
        getContentPane().setBackground(new Color(255, 238, 169));
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, -2, 600, 560);
        add(image);

        JLabel heading = new JLabel("Learn Java");
        heading.setBounds(750, 90, 300, 45);
        heading.setFont(new Font("Comic Sans MS", Font.BOLD, 45));
        heading.setForeground(new Color(255, 125, 41));// RGB
        add(heading);

        JLabel name = new JLabel("Enter your name.");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        name.setForeground(new Color(255, 125, 41));// RGB
        add(name);

        tfName = new JTextField();
        tfName.setBounds(735, 200, 300, 25);
        tfName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfName);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        Back = new JButton("Back");
        Back.setBounds(915, 270, 120, 25);
        Back.setBackground(new Color(30, 144, 254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfName.getText();
            setVisible(false);
            new Rules(name);

        } else if (ae.getSource() == Back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}