import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2 {
  public static void main(String[] args) {
    MyFrame windows = new MyFrame();
  }
}

class MyFrame extends JFrame {
  private JTextField field = new JTextField();
  private JTextArea result = new JTextArea();
  private JButton btn = new JButton("OK");

  public MyFrame() {
    super("Simple Form");
    setSize(720, 520);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    field.setText("GGG");

    add(field, BorderLayout.NORTH);
    add(result, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);

    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
      }
    });
    setVisible(true);
  }
}
