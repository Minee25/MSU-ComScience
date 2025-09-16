import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2 {
  public static void main(String[] args) {
    MyFrame windows = new MyFrame();
    windows.setVisible(true);
  }
}

class MyFrame extends JFrame {
  private JTextField field = new JTextField();
  private JTextArea result = new JTextArea();
  private JButton btn = new JButton("OK");

  public MyFrame() {
    setTitle("Multiplication table");
    setSize(720, 520);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    add(field, BorderLayout.NORTH);
    add(result, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);

    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          int mom = Integer.parseInt(field.getText());
          result.setText("");
          for (int i = 1; i <= 12; i++) {
            result.append(mom + " + " + i + " = " + (mom * i) + "\n");
          }
        } catch (NumberFormatException err) {
          result.setText("Input number error!!!");
        }
      }
    });
  }
}
