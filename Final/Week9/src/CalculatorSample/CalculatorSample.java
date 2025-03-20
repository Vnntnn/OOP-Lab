/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatorSample;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    public JFrame fr;
    public JPanel p;
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
    public JButton clear;
    public JButton equal;
    public JButton plusButton;
    public JButton minusButton;
    public JButton multiplyButton;
    public JButton divideButton;
    public JTextField field1;
    public double num1,num2,result;
    public char operator;

    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        b1 = new JButton("1");
        b1.addActionListener(this);
        b2 = new JButton("2");
        b2.addActionListener(this);
        b3 = new JButton("3");
        b3.addActionListener(this);
        b4 = new JButton("4");
        b4.addActionListener(this);
        b5 = new JButton("5");
        b5.addActionListener(this);
        b6 = new JButton("6");
        b6.addActionListener(this);
        b7 = new JButton("7");
        b7.addActionListener(this);
        b8 = new JButton("8");
        b8.addActionListener(this);
        b9 = new JButton("9");
        b9.addActionListener(this);
        b0 = new JButton("0");
        b0.addActionListener(this);
        clear = new JButton("c");
        clear.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
        plusButton = new JButton("+");
        plusButton.addActionListener(this);
        minusButton = new JButton("-");
        minusButton.addActionListener(this);
        multiplyButton = new JButton("×");
        multiplyButton.addActionListener(this);
        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        field1 = new JTextField();

        fr.setLayout(new BorderLayout());
        fr.add(field1,BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,4));
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(plusButton);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(minusButton);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(multiplyButton);
        p.add(b0);
        p.add(clear);
        p.add(equal);
        p.add(divideButton);
        fr.add(p,BorderLayout.CENTER);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(b1)){
            field1.setText(field1.getText()+"1");
        } else if(ae.getSource().equals(b2)){
            field1.setText(field1.getText()+"2");
        } else if(ae.getSource().equals(b3)){
            field1.setText(field1.getText()+"3");
        } else if(ae.getSource().equals(b4)){
            field1.setText(field1.getText()+"4");
        } else if(ae.getSource().equals(b5)){
            field1.setText(field1.getText()+"5");
        } else if(ae.getSource().equals(b6)){
            field1.setText(field1.getText()+"6");
        } else if(ae.getSource().equals(b7)){
            field1.setText(field1.getText()+"7");
        } else if(ae.getSource().equals(b8)){
            field1.setText(field1.getText()+"8");
        } else if(ae.getSource().equals(b9)){
            field1.setText(field1.getText()+"9");
        } else if(ae.getSource().equals(b0)){
            field1.setText(field1.getText()+"0");
        } else if(ae.getSource().equals(clear)){
            field1.setText("");
        } else if(ae.getSource().equals(plusButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '+';
            field1.setText("");
        } else if(ae.getSource().equals(minusButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '-';
            field1.setText("");
        } else if(ae.getSource().equals(multiplyButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '*';
            field1.setText("");
        } else if(ae.getSource().equals(divideButton)){
            num1 = Double.parseDouble(field1.getText());
            operator = '/';
            field1.setText("");
        } else if(ae.getSource().equals(equal)){
            num2 = Double.parseDouble(field1.getText());
            if (operator == '+'){
                result = num1 + num2;
            }else if (operator == '-'){
                result = num1 - num2;
            }else if (operator == '*'){
                result = num1 * num2;
            }else if (operator == '/'){
                result = num1 / num2;
            }
            field1.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }
}
