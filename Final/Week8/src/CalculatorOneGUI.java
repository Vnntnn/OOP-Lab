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

public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField t1, t2, t3;
    private JButton plus, minus, divide, multiply;
    private JPanel panel;
    
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        panel = new JPanel();
        
        plus = new JButton("บวก");
        minus = new JButton("ลบ");
        multiply = new JButton("คูณ");
        divide = new JButton("หาร");

        Font thaiFont = new Font("Tahoma", Font.PLAIN, 14);
        plus.setFont(thaiFont);
        minus.setFont(thaiFont);
        multiply.setFont(thaiFont);
        divide.setFont(thaiFont);
        fr.setFont(thaiFont);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);

        fr.add(t1);
        fr.add(t2);
        fr.add(panel);
        fr.add(t3);

        fr.setLayout(new GridLayout(4, 1));

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 200);
        fr.setVisible(true);
    }
}
