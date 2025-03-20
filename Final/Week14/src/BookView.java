import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BookView implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel pinput, pnum, pbtn;
    private JLabel name, price, type;
    private JTextField tname, tprice, tbooknum;
    private JComboBox cType;
    private JButton next, prev, add, upd, del;
    private final String[] bType = {"General", "Computer", "Math&Sci", "Photo"};
    private ArrayList<Book> BooksList;

    public BookView() {
        fr = new JFrame("Book View");
        pinput = new JPanel(new GridLayout(3, 2));
        pnum = new JPanel();
        pbtn = new JPanel();
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        tname = new JTextField();
        tprice = new JTextField();
        tbooknum = new JTextField("0");
        cType = new JComboBox(bType);
        next = new JButton(">>>");
        prev = new JButton("<<<");
        add = new JButton("Add");
        upd = new JButton("Update");
        del = new JButton("Delete");
        tbooknum.setEditable(false);
        BooksList = new ArrayList();
        
        pinput.add(name);
        pinput.add(tname);
        pinput.add(price);
        pinput.add(tprice);
        pinput.add(type);
        pinput.add(cType);
        
        pnum.add(prev);
        pnum.add(tbooknum);
        pnum.add(next);
        
        pbtn.add(add);
        pbtn.add(upd);
        pbtn.add(del);
        
        fr.add(pinput, BorderLayout.NORTH);
        fr.add(pnum, BorderLayout.CENTER);
        fr.add(pbtn, BorderLayout.SOUTH);
        
        fr.pack();
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(next)) {
            
        } else if (e.getSource().equals(prev)) {
            
        } else if (e.getSource().equals(add)) {
            new BookAdd();
        } else if (e.getSource().equals(upd)) {
            
        } else if (e.getSource().equals(del)) {
            
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
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

    public ArrayList<Book> getBooksList() {
        return BooksList;
    }

    public void setBooksList(ArrayList<Book> BooksList) {
        this.BooksList = BooksList;
    }
}
