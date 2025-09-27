import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Random; 

public class DuckDuckGame extends JFrame {
  public DuckDuckGame() {
    setTitle("Duck Duck Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1280, 720);
    setLocationRelativeTo(null);

    add(new Background());
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      new DuckDuckGame().setVisible(true);
    });
  }
}

class Background extends JPanel {
  Image bg = new ImageIcon(System.getProperty("user.dir") + File.separator + "background.jpg").getImage();
  Image duckImage = new ImageIcon(System.getProperty("user.dir") + File.separator + "duck.png").getImage();
  Image pointShot = new ImageIcon(System.getProperty("user.dir") + File.separator + "pointShot.png").getImage();

  private int duckCount = 10;
  private int cursorX = 0;
  private int cursorY = 0;
  private int cursorSizeWidth = 50;
  private int cursorSizeHeight = 50;

  ArrayList<Duck> ducks = new ArrayList<>();
  private int score = 0;

  public Background() {
    SwingUtilities.invokeLater(() -> {
      for (int i = 0; i < duckCount; i++) {
        Duck d = new Duck(this);
        ducks.add(d);
        new Thread(d).start();
      }
    });

    addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        cursorSizeWidth += 20;
        cursorSizeHeight += 20;

        for (Duck duck : ducks) {
          if (duck.alive && duck.getBounds().contains(e.getX(), e.getY())) {
            duck.kill();
            score += 10;
          }
        }
        repaint();
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        cursorSizeWidth = 50;
        cursorSizeHeight = 50;
        repaint();
      }
    });

    addMouseMotionListener(new MouseAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        cursorX = e.getX();
        cursorY = e.getY();
        repaint();
      }

      @Override
      public void mouseDragged(MouseEvent e) {
        cursorX = e.getX();
        cursorY = e.getY();
        repaint();
      }
    });
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);

    ducks.removeIf(duck -> !duck.alive);
    for (Duck duck : ducks) {
      g.drawImage(duckImage, duck.x, duck.y, duck.w, duck.h, this);
    }

    // Score
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.BOLD, 28));
    g.drawRect(5, 5, 180, 50);
    g.drawString("Score: " + score, 20, 40);

    // Crosshair
    // drawCrosshair(g, cursorX, cursorY);
    g.drawImage(pointShot, cursorX - cursorSizeWidth / 2, cursorY - cursorSizeHeight / 2, cursorSizeWidth,
        cursorSizeHeight, this);
  }
}

class Duck implements Runnable {
  int x;
  int y;
  int w = 50;
  int h = 50;
  int speed = 0;
  private JPanel panel;
  public boolean alive = true;

  public Duck(JPanel panel) {
    // this.x = -50;
    this.x = -50 + new Random().nextInt(panel.getWidth());
    this.y = 50 + new Random().nextInt(panel.getHeight() - 100);
    this.speed = 2 + new Random().nextInt(10);
    this.panel = panel;
  }

  public void kill() {
    alive = false;
    panel.repaint();
  }

  public Rectangle getBounds() {
    return new Rectangle(x, y, w, h);
  }

  @Override
  public void run() {
    while (alive) {
      x += speed;
      if (x > panel.getWidth()) {
        x = -50;
        y = 50 + new Random().nextInt(panel.getHeight() - 100);
        speed = 2 + new Random().nextInt(10);
      }
      panel.repaint();
      try {
        Thread.sleep(16);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
