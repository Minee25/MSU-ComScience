import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Start {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  public Windows() {
    setTitle("Paint method");
    setSize(1080, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    Paint paint = new Paint();
    add(paint);
  }
}

class Paint extends JPanel implements MouseMotionListener {
  int i = 0;
  int mouseX = -1;
  int mouseY = -1;

  public Paint() {
    addMouseMotionListener(this);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawString("Repaint count: " + i, 20, 20);

    if (mouseX >= 0 && mouseY >= 0) {
      g.setColor(Color.RED);
      g.fillOval(mouseX - 25, mouseY - 25, 50, 50);
    }
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    mouseX = e.getX();
    mouseY = e.getY();
    i++;
    repaint();
  }

  @Override
  public void mouseDragged(MouseEvent e) {
  }
}