import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(255, 238, 169));
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for Playing Learn Java.");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        heading.setForeground(new Color(255, 125, 41));
        add(heading);

        JLabel Finalscore = new JLabel("Your score is: " + score);
        Finalscore.setBounds(350, 200, 300, 30);
        Finalscore.setFont(new Font("tahoma", Font.PLAIN, 26));
        Finalscore.setForeground(new Color(255, 125, 41));
        add(Finalscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(385, 250, 110, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        // submit.setEnabled(false);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
