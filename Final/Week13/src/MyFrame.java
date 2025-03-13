import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);

        t.start();
        
        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(clock);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
