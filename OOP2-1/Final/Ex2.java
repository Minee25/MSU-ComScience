import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex2 extends JFrame {
  public Ex2() {
    setTitle("Pont2Point");
    setSize(800, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    add(new Grid());
  }

  public static void main(String[] args) {
    new Ex2().setVisible(true);
  }
}

class Grid extends JPanel {
  int area = 100;
  List<JPanel> panels = new ArrayList<>();
  List<Integer> pressed = new ArrayList<>();

  public Grid() {
    setLayout(new GridLayout(area, area));
    setBackground(Color.BLACK);

    for (int i = 0; i < area * area; i++) {
      JPanel p = new JPanel();
      p.setBackground(Color.BLACK);
      panels.add(p);
      add(p);
    }

    for (int i = 0; i < area * area; i++) {
      final int index = i;
      panels.get(index).addMouseMotionListener(new MouseAdapter() {
        public void mouseMoved(MouseEvent e) {
          panels.get(index).setBackground(
              new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
          pressed.add(index);

          for (int j = 0; j < panels.size(); j++) {
            for (int k = 0; k < pressed.size(); k++) {
              if (j == pressed.get(k)) {
                panels.get(j).setBackground(
                    new Color(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
              }
            }
          }
        }
      });
    }

    new Timer(100, e -> {
      for (int i = 0; i < panels.size(); i++) {
        for (int j = 0; j < pressed.size(); j++) {
          if (i == pressed.getFirst()) {
            panels.get(i).setBackground(Color.BLACK);
            pressed.removeFirst();
          }
        }
      }
    }).start();
  }
}