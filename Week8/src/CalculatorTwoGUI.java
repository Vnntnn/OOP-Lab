/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    public JFrame fr;
    public JPanel p;
    public JPanel top;
    public JTextField field1;
    public JButton b1;
    public JButton b2;
    public JButton b3;
    public JButton b4;
    public JButton b5;
    public JButton b6;
    public JButton b7;
    public JButton b8;
    public JButton b9;
    public JButton b0;
    public JButton plus;
    public JButton minus;
    public JButton times;
    public JButton divide;
    public JButton equal;
    public JButton c;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        p = new JPanel();
        top = new JPanel();
        field1 = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("x");
        divide = new JButton("/");
        equal = new JButton("=");
        c = new JButton("c");
        
        fr.setLayout(new BorderLayout());

        top.setLayout(new BorderLayout());
        top.add(field1, BorderLayout.NORTH);
        fr.add(top, BorderLayout.NORTH);

        p.setLayout(new GridLayout(4,4));
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(plus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(minus);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(times);
        p.add(b0);
        p.add(c);
        p.add(equal);
        p.add(divide);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(420,360);
        fr.setVisible(true);
    }

}
