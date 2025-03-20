import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAdd implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel name, price, type;
    private JTextField tname, tprice, tbooknum;
    private JButton insert;
    private JComboBox cType;
    private final String[] bType = { "General", "Computer", "Math&Sci", "Photo" };

    public BookAdd() {
        fr = new JFrame();
        p1 = new JPanel(new GridLayout(3, 2));
        p2 = new JPanel(new FlowLayout());
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        tname = new JTextField();
        tprice = new JTextField();
        cType = new JComboBox(bType);
        insert = new JButton("Insert");

        p1.add(name);
        p1.add(tname);
        p1.add(price);
        p1.add(tprice);
        p1.add(type);
        p1.add(cType);
        p2.add(insert);

        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.SOUTH);

        fr.pack();
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new BookAdd();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(add)) {
            new BookAdd(this);
        } else if (e.getSource().equals(update)) {
            try {
                if (Integer.parseInt(showIndex.getText()) != 0) {
                    bookStore.get(Integer.parseInt(showIndex.getText())).setName(showName.getText());
                    bookStore.get(Integer.parseInt(showIndex.getText())).setPrice(Double.valueOf(showPrice.getText()));
                    bookStore.get(Integer.parseInt(showIndex.getText())).setType((String) comboType.getSelectedItem());
                    JOptionPane.showMessageDialog(null, "Done it", "Update Command", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource().equals(delete)) {
            if (Integer.parseInt(showIndex.getText()) != 0) {
                if (Integer.parseInt(showIndex.getText()) > 1) {
                    showName.setText(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getName());
                    showPrice.setText(
                            String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getPrice()));
                    comboType.setSelectedIndex(
                            checkIndex(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getType()));
                    showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) - 1));
                    bookStore.remove(Integer.parseInt(showIndex.getText()));
                } else if (Integer.parseInt(showIndex.getText()) == 1) {
                    if (bookStore.size() == 1) {
                        bookStore.remove(Integer.parseInt(showIndex.getText()) - 1);
                        showName.setText("");
                        showPrice.setText("");
                        comboType.setSelectedIndex(0);
                        showIndex.setText("0");
                    } else if (bookStore.size() > 1) {
                        showName.setText(bookStore.get(Integer.parseInt(showIndex.getText())).getName());
                        showPrice.setText(
                                String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())).getPrice()));
                        comboType.setSelectedIndex(
                                checkIndex(bookStore.get(Integer.parseInt(showIndex.getText())).getType()));
                        showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText())));
                        bookStore.remove(Integer.parseInt(showIndex.getText()));
                    }
                }
                JOptionPane.showMessageDialog(null, "Done it", "Delete Command", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource().equals(goBack)) {
            if (Integer.parseInt(showIndex.getText()) > 1) {

                showName.setText(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getName());
                showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getPrice()));
                comboType.setSelectedIndex(
                        checkIndex(bookStore.get(Integer.parseInt(showIndex.getText()) - 2).getType()));
                showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) - 1));
            }
        } else if (e.getSource().equals(goNext)) {
            if (Integer.parseInt(showIndex.getText()) < bookStore.size()) {
                showName.setText(bookStore.get(Integer.parseInt(showIndex.getText())).getName());
                showPrice.setText(String.valueOf(bookStore.get(Integer.parseInt(showIndex.getText())).getPrice()));
                comboType.setSelectedIndex(checkIndex(bookStore.get(Integer.parseInt(showIndex.getText())).getType()));
                showIndex.setText(String.valueOf(Integer.parseInt(showIndex.getText()) + 1));
            }
        }
    }
}
