import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.util.*;

public class Ex1 {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      Windows windows = new Windows();
      windows.setVisible(true);
    });
  }
}

class Windows extends JFrame {
  private JLabel scoreLabel;

  public Windows() {
    setTitle("Ghost Hunter");
    setSize(1080, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    scoreLabel = new JLabel("Score: 0");
    scoreLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
    scoreLabel.setForeground(Color.WHITE);

    GamePanel gamepanel = new GamePanel(scoreLabel);
    setLayout(new BorderLayout());
    add(gamepanel, BorderLayout.CENTER);

    for (int i = 0; i < 10; i++) {
      Ghost ghost = new Ghost();
      gamepanel.addGhost(ghost);
      new Thread(ghost).start();
    }
  }
}

class GamePanel extends JPanel implements MouseListener {
  private Image bg;
  private ArrayList<Ghost> ghosts;
  private JLabel scoreLabel;
  private int score = 0;

  public GamePanel(JLabel scoreLabel) {
    bg = new ImageIcon(System.getProperty("user.dir") + File.separator + "Background.jpg").getImage();
    setLayout(null);
    ghosts = new ArrayList<>();
    addMouseListener(this);

    this.scoreLabel = scoreLabel;
    scoreLabel.setBounds(10, 10, 150, 30);
    scoreLabel.setForeground(Color.WHITE);
    scoreLabel.setOpaque(false);
    add(scoreLabel);
  }

  public void addGhost(Ghost ghost) {
    ghosts.add(ghost);
    add(ghost);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
  }

  @Override
  public void mousePressed(MouseEvent e) {
    for (int i = ghosts.size() - 1; i >= 0; i--) {
      Ghost ghost = ghosts.get(i);
      if (ghost.isAlive() && ghost.isHit(e.getX(), e.getY())) {
        ghost.die();
        ghosts.remove(i);
        remove(ghost);
        score += 10;
        scoreLabel.setText("Score: " + score);
        repaint();
        break;
      }
    }
  }

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

class Ghost extends JPanel implements Runnable {
  private int dx;
  private int dy;
  private boolean alive = true;
  Random rand = new Random();

  Image ghostImg;

  public Ghost() {
    int startX = rand.nextInt(1000);
    int startY = rand.nextInt(600);
    this.dx = rand.nextBoolean() ? 5 : -5;
    this.dy = rand.nextBoolean() ? 4 : -4;

    ghostImg = new ImageIcon(System.getProperty("user.dir") + File.separator + "ghost.png").getImage();

    setBounds(startX, startY, 80, 80);
    setOpaque(false);
  }

  public boolean isAlive() {
    return alive;
  }

  public void die() {
    alive = false;
  }

  public boolean isHit(int mouseX, int mouseY) {
    // ใช้ตำแหน่งจริงของ JPanel (getX/getY) แทน x,y
    int gx = getX();
    int gy = getY();
    return (mouseX >= gx && mouseX <= gx + 80 && mouseY >= gy && mouseY <= gy + 80);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(ghostImg, 0, 0, 80, 80, this);
  }

  @Override
  public void run() {
    while (alive) {
      int x = getX();
      int y = getY();

      if (getParent() != null) {
        if (x < 0 || x > getParent().getWidth() - 80) {
          dx = -dx;
        }
        if (y < 0 || y > getParent().getHeight() - 80) {
          dy = -dy;
        }
      }

      setLocation(x + dx, y + dy);

      try {
        Thread.sleep(16);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
