import java.awt.*;
import java.util.Random;
import javax.swing.JButton;

class Lab3 {

  public static void main(String[] args) {
    Frame frame = new Frame("50 Button");
    Random rand = new Random();
    frame.setSize(500, 400);
    frame.setLocation(300, 150);
    frame.setLayout(null);

    for (int i = 0; i < 50; i++) {
      JButton btn = new JButton("" + i);
      int positionHight = rand.nextInt(500);
      int positionWidth = rand.nextInt(400);
      
      Float r = rand.nextFloat();
      Float g = rand.nextFloat();
      Float b = rand.nextFloat();
      Color randomColor = new Color(r, g, b);
      btn.setBounds(positionHight, positionWidth, 50, 50);
      btn.setBackground(randomColor);
      frame.add(btn);
    }

    frame.setVisible(true);
  }
}