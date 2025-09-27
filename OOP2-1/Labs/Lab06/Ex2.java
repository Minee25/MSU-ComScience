import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ex2 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  public Windows() {
    setTitle("Rain Letter");
    setSize(1080, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    RainLetter rain = new RainLetter();
    JPanel container = new JPanel(new BorderLayout());
    JPanel bottom = new JPanel();
    JButton toggleBtn = new JButton("Start") {
      @Override
      protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        g2.dispose();

        setContentAreaFilled(false);
        super.paintComponent(g);
      }
    };
    toggleBtn.setFont(new Font("sans-serif", Font.BOLD, 16));
    toggleBtn.setForeground(Color.WHITE);
    toggleBtn.setBackground(Color.BLUE);
    toggleBtn.setFocusPainted(false);
    toggleBtn.setBorderPainted(false);
    toggleBtn.setOpaque(true); // ให้วาด background
    toggleBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    toggleBtn.setMargin(new Insets(10, 20, 10, 20));

    container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    container.add(rain, BorderLayout.CENTER);

    toggleBtn.addActionListener(e -> {
      rain.toggleBtn();
      toggleBtn.setText(rain.isRunning() ? "Stop" : "Start");
    });

    bottom.add(toggleBtn);
    container.add(bottom, BorderLayout.SOUTH);
    add(container);
  }
}

class RainLetter extends JPanel implements Runnable {
  JLabel letters[] = new JLabel[26];
  int letterX[] = new int[26];
  int letterY[] = new int[26];
  int speed[] = new int[26];
  Thread thread;
  boolean running = false;

  public RainLetter() {
    setLayout(null);

    for (int i = 0; i < letters.length; i++) {
      letters[i] = new JLabel(Character.toString((char) ('A' + i)));
      letters[i].setFont(new Font("Monospaced", Font.BOLD, 28));
      letters[i].setForeground(new Color(
          new Random().nextInt(255),
          new Random().nextInt(255),
          new Random().nextInt(255)));

      letterY[i] = -40;
      speed[i] = 1 + new Random().nextInt(3);

      add(letters[i]);
    }
  }

  public void toggleBtn() {
    if (!running) {
      running = true;
      thread = new Thread(this);
      thread.start();
    } else {
      running = false;
    }
  }

  public boolean isRunning() {
    return running;
  }

  @Override
  public void run() {
    while (running) {
      moveLetters();
      try {
        Thread.sleep(16);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void moveLetters() {
    int panelHeight = getHeight();
    int panelWidth = getWidth();

    for (int i = 0; i < letters.length; i++) {
      letterY[i] += speed[i];

      if (letterY[i] > panelHeight) {
        letterY[i] = -40;
        speed[i] = 1 + new Random().nextInt(5);
      }

      letterX[i] = i * (panelWidth / 26);
      letters[i].setBounds(letterX[i], letterY[i], 40, 40);
    }
  }
}
