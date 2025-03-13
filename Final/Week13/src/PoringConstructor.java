import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener {
    public JFrame frame;
    public JPanel panel;
    public JButton button;

    public PoringConstructor(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Add");

        button.addActionListener(this);

        panel.add(button);
        frame.add(panel);

        frame.setLayout(new FlowLayout());
        frame.setLocation(700, 300);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)){
            Poring p = new Poring();
            p.start();
        }
    }

    public static void main(String[] args) {
        new PoringConstructor();
    }
}
