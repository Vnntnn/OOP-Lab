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

public class TellerGUI {
    public JFrame fr;
    public JPanel p1;
    public JPanel p2;
    public JLabel balance;
    public JLabel amount;
    public JTextField field1;
    public JTextField field2;
    public JButton deposit;
    public JButton withdraw;
    public JButton exit;
    
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        balance = new JLabel("Balance");
        amount = new JLabel("Amount");
        field1 = new JTextField();
        field2 = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        
        fr.setLayout(new GridLayout(2,1));
        p1.setLayout(new GridLayout(2,2));
        p1.add(balance);
        p1.add(field1);
        p1.add(amount);
        p1.add(field2);

        p2.setLayout(new FlowLayout());
        p2.add(deposit);
        p2.add(withdraw);
        p2.add(exit);

        fr.add(p1);
        fr.add(p2);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
