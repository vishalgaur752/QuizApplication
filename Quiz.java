import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];

    Quiz() {
        setBounds(108, 0, 1300, 824);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1300, 300);
        add(image);

        JLabel qno = new JLabel("1.");
        qno.setBounds(50, 335, 50, 30);
        qno.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(qno);

        JLabel question = new JLabel("This ia a question.");
        question.setBounds(80, 335, 1000, 30);
        question.setFont(new Font("tahoma", Font.PLAIN, 20));
        add(question);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        // Answer Stored
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        JRadioButton opt1 = new JRadioButton("Option 1");
        opt1.setBounds(90, 380, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("dialog", Font.PLAIN, 20));
        add(opt1);

        JRadioButton opt2 = new JRadioButton("Option 1");
        opt2.setBounds(90, 420, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("dialog", Font.PLAIN, 20));
        add(opt2);

        JRadioButton opt3 = new JRadioButton("Option 1");
        opt3.setBounds(90, 460, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("dialog", Font.PLAIN, 20));
        add(opt3);

        JRadioButton opt4 = new JRadioButton("Option 1");
        opt4.setBounds(90, 500, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("dialog", Font.PLAIN, 20));
        add(opt4);

        ButtonGroup groupOptions = new ButtonGroup();
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);

        JButton next = new JButton("Next");
        next.setBounds(900, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        add(next);

        JButton lifeLine = new JButton("50 50 Lifeline");
        lifeLine.setBounds(900, 610, 200, 40);
        lifeLine.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeLine.setBackground(new Color(30, 144, 255));
        lifeLine.setForeground(Color.WHITE);
        add(lifeLine);

        JButton submit = new JButton("Submit");
        submit.setBounds(900, 670, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        add(submit);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
