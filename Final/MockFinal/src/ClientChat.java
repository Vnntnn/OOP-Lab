import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientChat implements ActionListener, WindowListener, Serializable {
    private JFrame fr;
    private JPanel in_group;
    private JTextArea chat;
    private JTextField user_input;
    private JButton send;
    private String name;
    private String chatFile; // ไฟล์สำหรับเก็บแชท
    private ClientChat otherClient;

    public ClientChat(String name) {
        this.name = name;
        this.chatFile = name + "_chat.txt"; // ไฟล์เก็บแชทของแต่ละ Client
        fr = new JFrame("Client " + name);
        in_group = new JPanel(new BorderLayout());
        chat = new JTextArea();
        user_input = new JTextField();
        send = new JButton("Send");
        
        send.addActionListener(this);
        fr.addWindowListener(this); // ✅ เพิ่ม Window Listener เพื่อเซฟไฟล์เมื่อปิดหน้าต่าง

        chat.setEditable(false);
        
        in_group.add(user_input);
        in_group.add(send, BorderLayout.EAST);
        
        fr.add(chat, BorderLayout.CENTER);
        fr.add(in_group, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.setSize(450, 500);
        fr.setVisible(true);

        loadChatHistory(); // ✅ โหลดแชทจากไฟล์เมื่อเปิดโปรแกรม
    }

    // เชื่อมต่อกับอีกฝั่งของแชท
    public void connect(ClientChat other) {
        this.otherClient = other;
    }

    // ส่งข้อความไปยังทั้งสองแชท
    public void sendText(String text) {
        if (text.isEmpty()) return;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String time = dtf.format(LocalDateTime.now());
        String formattedText = "[" + time + "] " + name + ": " + text + "\n";

        chat.append(formattedText);

        if (otherClient != null) {
            otherClient.receiveText(formattedText);
        }

        user_input.setText("");
        saveToFile(formattedText); // ✅ บันทึกข้อความใหม่ลงไฟล์ทันที
    }

    // รับข้อความจากอีกฝั่ง
    public void receiveText(String text) {
        chat.append(text);
        saveToFile(text); // ✅ บันทึกข้อความที่ได้รับลงไฟล์
    }

    // ✅ โหลดแชทจากไฟล์เมื่อเปิดโปรแกรม
    private void loadChatHistory() {
        try (BufferedReader br = new BufferedReader(new FileReader(chatFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                chat.append(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("ยังไม่มีไฟล์แชท หรือโหลดแชทล้มเหลว");
        }
    }

    // ✅ บันทึกข้อความใหม่ลงไฟล์
    private void saveToFile(String text) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(chatFile, true))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ✅ เซฟแชททั้งหมดลงไฟล์เมื่อปิดหน้าต่าง
    @Override
    public void windowClosing(WindowEvent e) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(chatFile))) {
            bw.write(chat.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(send)) {
            sendText(user_input.getText());
        }
    }

    public JButton getSend() { return send; }
    public JTextArea getChat() { return chat; }
    public JTextField getUser_input() { return user_input; }
}
