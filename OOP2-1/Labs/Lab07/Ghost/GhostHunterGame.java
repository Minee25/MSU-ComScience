import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class GhostHunterGame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ghost Hunter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);

    GamePanel panel = new GamePanel();
    frame.add(panel);

    frame.setVisible(true);
    panel.startGame();
  }
}

// ----------------- GamePanel -----------------
class GamePanel extends JPanel implements Runnable, MouseListener {
  private ArrayList<Ghost> ghosts;
  private Thread gameThread;
  private boolean running = false;
  private int score = 0;
  private Random rand = new Random();

  public GamePanel() {
    ghosts = new ArrayList<>();
    addMouseListener(this);
    setBackground(Color.BLACK);
  }

  public void startGame() {
    running = true;
    gameThread = new Thread(this);
    gameThread.start();
  }

  @Override
  public void run() {
    while (running) {
      // สุ่มสร้าง Ghost
      if (ghosts.size() < 5) {
        ghosts.add(new Ghost(rand.nextInt(getWidth() - 50), rand.nextInt(getHeight() - 50)));
      }

      // อัปเดตการเคลื่อนที่
      for (Ghost g : ghosts) {
        g.move(getWidth(), getHeight());
      }

      repaint();

      try {
        Thread.sleep(30); // คุม FPS
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // วาด Ghost
    for (Ghost ghost : ghosts) {
      ghost.draw(g);
    }

    // วาด Score
    g.setColor(Color.WHITE);
    g.setFont(new Font("Arial", Font.BOLD, 20));
    g.drawString("Score: " + score, 20, 30);
  }

  // ตรวจจับการคลิก (ยิง Ghost)
  @Override
  public void mousePressed(MouseEvent e) {
    for (int i = 0; i < ghosts.size(); i++) {
      Ghost ghost = ghosts.get(i);
      if (ghost.isHit(e.getX(), e.getY())) {
        ghosts.remove(i);
        score += 10;
        break;
      }
    }
  }

  // ไม่ใช้แต่ต้อง override
  @Override
  public void mouseClicked(MouseEvent e) {
  }

  @Override
  public void mouseReleased(MouseEvent e) {
  }

  @Override
  public void mouseEntered(MouseEvent e) {
  }

  @Override
  public void mouseExited(MouseEvent e) {
  }
}

// ----------------- Ghost -----------------
class Ghost {
  private int x, y, size = 50;
  private int dx, dy;
  private Color color;

  public Ghost(int x, int y) {
    this.x = x;
    this.y = y;
    Random rand = new Random();
    dx = rand.nextInt(5) + 1;
    dy = rand.nextInt(5) + 1;
    color = Color.GREEN; // ถ้าอยากเปลี่ยนเป็นรูปภาพ สามารถใช้ drawImage()
  }

  public void move(int panelWidth, int panelHeight) {
    x += dx;
    y += dy;

    // เด้งเมื่อชนขอบ
    if (x < 0 || x + size > panelWidth)
      dx = -dx;
    if (y < 0 || y + size > panelHeight)
      dy = -dy;
  }

  public void draw(Graphics g) {
    g.setColor(color);
    g.fillOval(x, y, size, size);
  }

  public boolean isHit(int mouseX, int mouseY) {
    return (mouseX >= x && mouseX <= x + size &&
        mouseY >= y && mouseY <= y + size);
  }
}
