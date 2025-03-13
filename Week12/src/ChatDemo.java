import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel p1;
    private JTextArea t1;
    private JTextField tf1;
    private JButton btn1, btn2;
    
    public ChatDemo() {

        /**
         * Initializing components
         */
        frame = new JFrame("ChatDemo");
        p1 = new JPanel();
        t1 = new JTextArea(20, 45);
        tf1 = new JTextField(45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");
        
        t1.setEditable(false);
        
        /**
         * Add action event to buttons
         */
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        /**
         * Add components to JFrame <- JPanel
         */
        p1.add(btn1);
        p1.add(btn2);
        frame.addWindowListener(this);
        frame.add(t1, BorderLayout.NORTH);
        frame.add(tf1, BorderLayout.CENTER);
        frame.add(p1, BorderLayout.SOUTH);
        
        /**
         * Initializing windows application
         */
        frame.setLocation(550, 250);
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1) && !"".equals(tf1.getText())) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now()));
            
            /**
             * Add Input text to textArea
             */
            t1.append(dtf.format(LocalDateTime.now()) + " : " + tf1.getText() + "\n");
            tf1.setText("");
        }else if (e.getSource().equals(btn2)){
            t1.setText("");
            tf1.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("ChatDemo.dat");
        if (f.exists()) {
            try (FileReader chatFile = new FileReader(f)) {
                int i;
                String text = "";
                while ((i = chatFile.read()) != -1) {
                    text += (char) i;
                }
                t1.setText(text);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileWriter chatFile = new FileWriter("ChatDemo.dat")) {
            chatFile.write(t1.getText());
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
}
