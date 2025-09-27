import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Ex1 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  public Windows() {
    setTitle("Random Color");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(720, 720);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(2, 2));

    add(new RandomColor(5));
    add(new RandomColor(10));
    add(new RandomColor(1, 5));
    add(new RandomColor(5, 10));
  }
}

class RandomColor extends JLabel implements Runnable {
  private int minDelay;
  private int maxDelay;

  public RandomColor(int minDelay, int maxDelay) {
    this.minDelay = minDelay * 1000;
    this.maxDelay = maxDelay * 1000;

    setOpaque(true);
    setBackground(getRandomColor());
    setHorizontalAlignment(SwingConstants.CENTER);
    setFont(new Font(null, Font.BOLD, 16));
    setText("Color Box");

    new Thread(this).start();
  }

  public RandomColor(int maxDelay) {
    this(maxDelay, maxDelay);
  }

  @Override
  public void run() {
    int delay;
    if (minDelay == maxDelay) {
      delay = minDelay;
    } else {
      delay = minDelay + new Random().nextInt(maxDelay - minDelay + 1);
    }
    while (true) {
      try {

        int sec = delay / 1000;

        for (int i = sec; i > 0; i--) {
          setText("Change Color in " + i + " sec");
          Thread.sleep(1000);
        }

        setBackground(getRandomColor());
      } catch (InterruptedException err) {
        err.printStackTrace();
      }

    }
  }

  private Color getRandomColor() {
    int r = new Random().nextInt(256);
    int g = new Random().nextInt(256);
    int b = new Random().nextInt(256);
    return new Color(r, g, b);
  }
}
