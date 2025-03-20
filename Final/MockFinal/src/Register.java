import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register {
    private JFrame fr;
    private JPanel panelLog, panelUp, panelLogIn, panelLogPass;
    private JButton log;
    private JTextField logTf, passTf;
    private JLabel loglb, passlb;

    public Register() {
        fr = new JFrame("Register");
        panelLogIn = new JPanel(new FlowLayout());
        panelLogPass = new JPanel(new FlowLayout());
        panelUp = new JPanel(new FlowLayout());
        panelLog = new JPanel(new GridLayout(2, 2));
        loglb = new JLabel("Login");
        passlb = new JLabel("Password");
        log = new JButton("Login");
        
        
    }
}
