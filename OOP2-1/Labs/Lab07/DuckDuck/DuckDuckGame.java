import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class DuckDuckGame extends JFrame {
  public DuckDuckGame() {
    setTitle("Duck Duck Game");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(1280, 720);

    Background bg = new Background();
    add(bg);

    // timer อัปเดตเป็ด
    new Timer(16, e -> bg.updateDucks()).start();
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      DuckDuckGame windows = new DuckDuckGame();
      windows.setVisible(true);
    });
  }
}

class Duck {
  int x, y;
  int w = 50, h = 50;
  int speed;
  private final Random rand = new Random();

  public Duck(int startX, int startY) {
    this.x = startX;
    this.y = startY;
    this.speed = 2 + rand.nextInt(6); // ความเร็วสุ่ม 2-7
  }

  public void move() {
    x += speed;
  }

  public Rectangle getBounds() {
    return new Rectangle(x, y, w, h);
  }
}

class Background extends JPanel {
  Image bg = Toolkit.getDefaultToolkit()
      .createImage(System.getProperty("user.dir") + File.separator + "background.jpg");
  Image duckImage = Toolkit.getDefaultToolkit()
      .createImage(System.getProperty("user.dir") + File.separator + "duck.png");

  ArrayList<Duck> ducks = new ArrayList<>();
  private final Random rand = new Random();
  private int score = 0;
  private boolean gameOver = false;

  public Background() {
    // สร้างเป็ดเริ่มต้น
    for (int i = 0; i < 10; i++) {
      int startX = -rand.nextInt(800) - 50 * i;
      int startY = rand.nextInt(600);
      ducks.add(new Duck(startX, startY));
    }

    // ยิงเป็ดด้วยเมาส์
    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (!gameOver) {
          handleShot(e.getX(), e.getY());
        }
      }
    });
  }

  private void handleShot(int mx, int my) {
    for (int i = 0; i < ducks.size(); i++) {
      Duck d = ducks.get(i);
      if (d.getBounds().contains(mx, my)) {
        score += 10;
        ducks.remove(i);   // ยิงแล้วหายไป
        break;
      }
    }

    if (ducks.isEmpty()) {
      gameOver = true;
    }

    repaint();
  }

  public void updateDucks() {
    if (gameOver) return;

    ArrayList<Duck> toRemove = new ArrayList<>();
    for (Duck duck : ducks) {
      duck.move();
      if (duck.x > getWidth()) {
        toRemove.add(duck); // เป็ดหลุดขอบจอ -> หายไป
      }
    }
    ducks.removeAll(toRemove);

    if (ducks.isEmpty()) {
      gameOver = true;
    }

    repaint();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // วาด background
    if (bg != null) {
      g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    } else {
      g.setColor(new Color(135, 206, 235));
      g.fillRect(0, 0, getWidth(), getHeight());
    }

    // วาดเป็ด
    for (Duck d : ducks) {
      if (duckImage != null) {
        g.drawImage(duckImage, d.x, d.y, d.w, d.h, this);
      } else {
        g.setColor(Color.YELLOW);
        g.fillOval(d.x, d.y, d.w, d.h);
        g.setColor(Color.BLACK);
        g.drawOval(d.x, d.y, d.w, d.h);
      }
    }

    // คะแนน
    g.setFont(new Font("SansSerif", Font.BOLD, 24));
    g.setColor(Color.WHITE);
    g.drawString("Score: " + score, 20, 30);

    // Game Over
    if (gameOver) {
      g.setFont(new Font("SansSerif", Font.BOLD, 64));
      g.setColor(Color.RED);
      String msg = "GAME OVER";
      g.drawString(msg, getWidth() / 2 - 180, getHeight() / 2 - 50);

      g.setFont(new Font("SansSerif", Font.BOLD, 36));
      g.setColor(Color.WHITE);
      g.drawString("Final Score: " + score, getWidth() / 2 - 120, getHeight() / 2 + 20);
    }
  }
}
