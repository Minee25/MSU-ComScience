import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;

public class Ex1_2 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  JLabel[] labels = new JLabel[4];

  public Windows() {
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(2, 2));

    for (int i = 0; i < labels.length; i++) {
      labels[i] = new JLabel();
      int rand = 0;
      if (i == 0) {
        labels[i].setText("Change Color in 5 sec");
        rand = 5;
      } else if (i == 1) {
        labels[i].setText("Change Color in 10 sec");
        rand = 10;
      } else if (i == 2) {
        rand = new Random().nextInt(5);
        labels[i].setText("Change Color in " + rand + " sec");
      } else if (i == 3) {
        rand = new Random().nextInt(5) + 5;
        labels[i].setText("Change Color in " + rand + " sec");
      }
      MyThread th = new MyThread(labels[i], rand);
      th.start();
      add(labels[i]);
    }
  }
}

class MyThread extends Thread {
  JLabel label;
  int delay = 0;

  public MyThread(JLabel label, int delay) {
    this.label = label;
    this.delay = delay;
  }

  @Override
  public void run() {
    while (true) {
      Color color = new Color(
          new Random().nextInt(255),
          new Random().nextInt(255),
          new Random().nextInt(255));
      label.setForeground(color);
      try {
        Thread.sleep(delay * 1000);
      } catch (InterruptedException err) {
      }
    }
  }
}
