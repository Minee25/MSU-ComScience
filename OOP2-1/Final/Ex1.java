import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Ex1 extends JFrame {
  public Ex1() {
    setTitle("Pont2Point");
    setSize(1080, 720);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    Background background = new Background();
    add(background);
  }

  public static void main(String[] args) {
    new Ex1().setVisible(true);
  }
}

class Background extends JPanel {
  List<Integer> pointX = new ArrayList<>();
  List<Integer> pointY = new ArrayList<>();

  public Background() {
    setLayout(null);
    setBackground(Color.RED);

    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        pointX.add(e.getX());
        pointY.add(e.getY());
        repaint();
      };
    });
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.GREEN);
    int w = getWidth() - 200;
    int h = getHeight() - 200;
    int x = (getWidth() - w) / 2;
    int y = (getHeight() - h) / 2;
    g.fillRect(x, y, w, h);

    g.setColor(Color.BLUE);
    int bw = w / 2;
    int bh = h / 2;
    int bx = x + (w - bw) / 2;
    int by = y + (h - bh) / 2;
    g.fillRect(bx, by, bw, bh);

    g.setColor(Color.BLACK);
    for (int i = 0; i < pointX.size(); i++) {
      g.fillOval(pointX.get(i) - 5, pointY.get(i) - 5, 10, 10);
    }

    for (int i = 0; i < pointX.size() - 1; i++) {
      g.drawLine(pointX.get(i), pointY.get(i), pointX.get(i + 1), pointY.get(i + 1));
    }
  }
}