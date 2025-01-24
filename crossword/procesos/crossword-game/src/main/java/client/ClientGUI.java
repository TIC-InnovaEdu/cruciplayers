package client;

import javax.swing.*;
import java.awt.*;

public class ClientGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextArea textArea;
    private JButton sendButton;
    private JTextField inputField;

    public ClientGUI() {
        frame = new JFrame("Crossword Game Client");
        panel = new JPanel();
        textArea = new JTextArea(20, 40);
        sendButton = new JButton("Send");
        inputField = new JTextField(30);

        setupGUI();
    }

    private void setupGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);
        panel.add(inputField);
        panel.add(sendButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        sendButton.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            textArea.append("You: " + message + "\n");
            inputField.setText("");
            // Here you would add the logic to send the message to the server
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClientGUI::new);
    }
}