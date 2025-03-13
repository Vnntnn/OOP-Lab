import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.Random;

public class Poring extends Thread implements MouseListener {
    private static int count = 0;
    private JFrame frame;
    private JLabel pic_count;
    
    public Poring() {
        ImageIcon icon = null;
        frame = new JFrame();
        count += 1;
        Random r = new Random();

        URL imgurl = getClass().getClassLoader().getResource("Images/Poring.png");
        if (imgurl != null) {
            ImageIcon originalIcon = new ImageIcon(imgurl);
            Image img = originalIcon.getImage().getScaledInstance(170, 130, Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);
        }

        pic_count = new JLabel(icon);
        pic_count.setText(String.valueOf(count));
        pic_count.addMouseListener(this);

        frame.add(pic_count);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLocation(r.nextInt(800), r.nextInt(600));
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            try {
                frame.setLocation(frame.getX() + (r.nextInt(5) - 2), frame.getY() + (r.nextInt(5) - 2));
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        frame.dispose();
    }

    @Override public void mousePressed(MouseEvent e) {
    }
    
    @Override public void mouseReleased(MouseEvent e) {
    }
    
    @Override public void mouseEntered(MouseEvent e) {
    }
    
    @Override public void mouseExited(MouseEvent e) {
    }
}
