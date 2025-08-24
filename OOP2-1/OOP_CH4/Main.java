import java.awt.*;

import javax.swing.JTextArea;

public class Main {
  public static void main(String[] args) {
    Frame frame = new Frame("Multiple Buttons");
    frame.setSize(500, 400);
    frame.setLocation(300, 150);
    frame.setLayout(new GridLayout(8, 5));

    for (int i = 1; i <= 20; i++) {
      frame.add(new Button("Button" + i));
      frame.add(new JTextArea(" "));
    }

    frame.setVisible(true);
  }
}
