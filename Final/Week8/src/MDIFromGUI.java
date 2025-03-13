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

public class MDIFromGUI {
    public JFrame fr;
    public JMenuBar menubar;
    public JMenu file,edit,view;
    public JMenuItem open,save,edits;
    public JMenu neww;
    public JMenuItem window,message;
    public JDesktopPane desktopPane;
    public JInternalFrame app1,app2,app3;
    public Color black;
    
    public MDIFromGUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        black = new Color(0, 0, 0);
        fr = new JFrame("SubMenuItem Demo");
        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        neww = new JMenu("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        edits = new JMenuItem("Edit");
        window = new JMenuItem("Window");
        message = new JMenuItem("Message");
        app1 = new JInternalFrame("Application 01",true,true,true,true);
        app2 = new JInternalFrame("Application 02",true,true,true,true);
        app3 = new JInternalFrame("Application 03",true,true,true,true);
        desktopPane = new JDesktopPane();
        
        file.add(neww);
        file.addSeparator();
        neww.add(window);
        neww.addSeparator();
        neww.add(message);
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(edits);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);
        
        app1.getContentPane().add(new JLabel());
        app1.setSize(200,200);
        app1.setVisible(true);
        app2.getContentPane().add(new JLabel());
        app2.setSize(200,200);
        app2.setLocation(app1.getX()+app1.getWidth()+10, app1.getY());
        app2.setVisible(true);
        app3.getContentPane().add(new JLabel());
        app3.setSize(200,200);
        app3.setLocation(app2.getX()+app2.getWidth()+20, app2.getY());
        app3.setVisible(true);
        desktopPane.add(app1);
        desktopPane.add(app2);
        desktopPane.add(app3);
        desktopPane.setBackground(black);
        
        fr.setJMenuBar(menubar);
        fr.add(desktopPane);
        fr.setBackground(black);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 600);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new MDIFromGUI();
    }
}
