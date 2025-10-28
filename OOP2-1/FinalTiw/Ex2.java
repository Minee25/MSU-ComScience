import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2 extends JFrame {
  public Ex2() {
    setTitle("Disappear");
    setSize(512, 512);
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    setLocationRelativeTo(null);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        setTitle("Clsing Windows");
        while (true) {
          setSize(getWidth() - 10, getHeight() - 10);
          setLocationRelativeTo(null);
          if (getWidth() < 150 && getHeight() < 150) {
            System.exit(0);
          }
          try {
            Thread.sleep(16);
          } catch (Exception error) {}
        }
      };
    });
  }

  public static void main(String[] args) {
    Ex2 windows = new Ex2();
    windows.setVisible(true);
  }
}
