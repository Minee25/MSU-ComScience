import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.*; 
import java.lang.reflect.Array;

public class Ex1 extends JFrame {
  JTextField input = new JTextField();
  JTextField output = new JTextField();

  public Ex1() {
    setTitle("Sorting Letter");
    setSize(512, 512);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(2, 1));

    input.setFont(new Font(null, Font.PLAIN, 43));
    output.setFont(new Font(null, Font.PLAIN, 43));

    input.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
        /*
         * String text = input.getText();
         * List<Character> chars = new ArrayList<>();
         * 
         * for (char c : text.toCharArray()) {
         * chars.add(c);
         * }
         * 
         * Collections.sort(chars);
         * 
         * StringBuilder sorted = new StringBuilder();
         * for (char c : chars) {
         * sorted.append(c);
         * }
         * 
         * output.setText(sorted.toString());
         */

        String text = input.getText();
        char sort[];

        // Convert to char array
        sort = text.toCharArray();
        Arrays.sort(sort);

        // Conert to string
        String textOuput = "";
        for (char c : sort) {
          textOuput += c;
        }

        output.setText(textOuput);
        // output.setText(new String(sort));
      };
    });

    add(input);
    add(output);
  }

  public static void main(String[] args) {
    Ex1 windows = new Ex1();
    windows.setVisible(true);
  }
}
