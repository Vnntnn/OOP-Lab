import java.awt.event.*;

public class Client implements ActionListener {
    private ClientChat A, B;

    public Client() {
        A = new ClientChat("A");
        B = new ClientChat("B");

        // เชื่อมต่อกัน
        A.connect(B);
        B.connect(A);
    }

    public static void main(String[] args) {
        new Client();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
