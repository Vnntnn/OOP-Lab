import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

class MyClock extends JLabel implements Runnable {
    public MyClock() {
        setFont(new Font("Arial", Font.BOLD, 50));
    }

    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int hour = d.get(Calendar.HOUR_OF_DAY);
            int min = d.get(Calendar.MINUTE);
            int sec = d.get(Calendar.SECOND);
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
