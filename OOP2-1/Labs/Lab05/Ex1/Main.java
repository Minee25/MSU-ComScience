import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Always run Swing code on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}

class MyFrame extends JFrame implements ActionListener {
    private JTextField field;
    private JButton btn;

    public MyFrame() {
        super("Hello world!!!");

        // Initialize components
        field = new JTextField();
        btn = new JButton("OK");

        // Setup frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        setSize(300, 100);
        setLocationRelativeTo(null);

        // Add components and listeners
        btn.addActionListener(this);
        add(field);
        add(btn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        field.setText("Hello world!!!");
        this.setTitle("Hello world!!!");
    }
}
