import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel p1;
    private JLabel t1, t2, t3;
    private JTextField tf1, tf2, tf3;
    private JButton btn1, btn2;
    private Student s;

    public StudentView() {
        frame = new JFrame("StudentView");
        p1 = new JPanel();
        t1 = new JLabel("ID :");
        t2 = new JLabel("Name :");
        t3 = new JLabel("Money :");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField("0");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");

        tf3.setBackground(Color.gray);
        tf3.setEditable(false);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        p1.setLayout(new GridLayout(4, 2));
        p1.add(t1);
        p1.add(tf1);
        p1.add(t2);
        p1.add(tf2);
        p1.add(t3);
        p1.add(tf3);
        p1.add(btn1);
        p1.add(btn2);

        frame.add(p1);
        frame.addWindowListener(this);

        frame.setResizable(false);
        frame.setBounds(100, 100, 250, 125);
        frame.setLocation(650, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            s.setMoney(s.getMoney() + 100);
            tf3.setText(String.valueOf(s.getMoney()));
        } else if (e.getSource().equals(btn2)) {
            s.setMoney(s.getMoney() - 100);
            tf3.setText(String.valueOf(s.getMoney()));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("StudentM.dat");
        if (f.exists()) {
            try (ObjectInputStream objFile = new ObjectInputStream(new FileInputStream(f))) {
                s = (Student) objFile.readObject();
                tf1.setText(String.valueOf(s.getID()));
                tf2.setText(s.getName());
                tf3.setText(String.valueOf(s.getMoney()));
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
                s = new Student();
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (ObjectOutputStream objFile = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))) {
            s.setID(Integer.parseInt(tf1.getText()));
            s.setName(tf2.getText());
            objFile.writeObject(s);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public static void main(String[] args) {
        new StudentView();
    }
}
