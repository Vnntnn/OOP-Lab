import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class MyTextEditor implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JTextArea ta1;
    private JMenuBar mb;
    private JMenu file;
    private JMenuItem n, o, s, c;
    
    public MyTextEditor() {
        fr = new JFrame("My Text Editor");
        p1 = new JPanel();
        p2 = new JPanel();
        ta1 = new JTextArea();
        mb = new JMenuBar();
        file = new JMenu("File");
        n = new JMenuItem("New");
        o = new JMenuItem("Open");
        s = new JMenuItem("Save");
        c = new JMenuItem("Close");
        
        ta1.setEditable(true);
        n.addActionListener(this);
        o.addActionListener(this);
        s.addActionListener(this);
        c.addActionListener(this);
        
        mb.add(file);
        
        file.add(n);
        file.add(o);
        file.add(s);
        file.addSeparator();
        file.add(c);
        
        fr.setJMenuBar(mb);
        fr.add(ta1, BorderLayout.CENTER);
        
        fr.setSize(275, 250);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyTextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(n)) {
            ta1.setText("");
        } else if (e.getSource().equals(o)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
        } else if (e.getSource().equals(s)) {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
        } else if (e.getSource().equals(c)) {
            System.exit(0);
        }
    }
}
