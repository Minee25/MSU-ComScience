import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ex3 extends JFrame {
  JTextField input = new JTextField();
  JButton decrease = new JButton("<<");
  JButton increaes = new JButton(">>");
  JPanel wrapper = new JPanel();
  JLabel text = new JLabel("", SwingConstants.CENTER);

  public Ex3() {
    setTitle("Sign Post");
    setSize(720, 405);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    // input.setColumns(10);
    input.setPreferredSize(new Dimension(150, 30));

    wrapper.setLayout(new FlowLayout(FlowLayout.LEFT));
    wrapper.add(input);
    wrapper.add(decrease);
    wrapper.add(increaes);

    text.setFont(new Font(null, Font.PLAIN, 30));

    add(wrapper, BorderLayout.NORTH);
    add(text, BorderLayout.CENTER);

    input.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        text.setText(input.getText());
      };
    });

    decrease.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (text.getFont().getSize() <= 10) {
          return;
        }
        text.setFont(new Font(null, Font.PLAIN, text.getFont().getSize() - 10));
      };
    });

    increaes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        text.setFont(new Font(null, Font.PLAIN, text.getFont().getSize() + 10));
      };
    });
  }

  public static void main(String[] args) {
    Ex3 windows = new Ex3();
    windows.setVisible(true);
  }
}
