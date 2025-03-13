import javax.swing.*;
import java.awt.*;

class TimerLabel extends JLabel implements Runnable {
    private int seconds = 0;

    public TimerLabel() {
        setFont(new Font("Arial", Font.BOLD, 50));
    }

    public void run() {
        while (true) {
            int hr = seconds / 3600;
            int min = (seconds % 3600) / 60;
            int sec = seconds % 60;
            setText(String.format("%02d:%02d:%02d", hr, min, sec));
            seconds++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TimerFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer");
        TimerLabel timer = new TimerLabel();
        Thread t = new Thread(timer);

        t.start();

        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(timer);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
