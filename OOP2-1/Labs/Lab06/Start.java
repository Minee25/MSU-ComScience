import javax.swing.*;
import java.awt.*;

public class Start {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  JTextArea numberArea = new JTextArea();
  JTextArea charArea = new JTextArea();

  public Windows() {
    setTitle("Thread");
    setSize(512, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(1, 2));

    numberArea.setFont(new Font(null, Font.PLAIN, 18));
    charArea.setFont(new Font(null, Font.PLAIN, 18));

    JScrollPane leftScrollPane = new JScrollPane(numberArea);
    JScrollPane rightScrollPane = new JScrollPane(charArea);
    add(leftScrollPane);
    add(rightScrollPane);

    new NumberThread(numberArea).start();
    new CharThread(charArea).start();
  }
}

abstract class DemoThread extends Thread {
  protected JTextArea textArea;

  public DemoThread(JTextArea textArea) {
    this.textArea = textArea;
  }

  protected void appendText(final String text) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        textArea.append(text + "\n");
      }
    });
  }

  protected void sleepThread(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException err) {
      err.printStackTrace();
    }
  }
}

// Number Thread
class NumberThread extends DemoThread {
  public NumberThread(JTextArea textArea) {
    super(textArea);
  }

  @Override
  public void run() {
    for (int i = 1; i <= 26; i++) {
      textArea.append(Integer.toString(i) + "\n");
      sleepThread(100);
    }
  }
}

// Charactor Thread
class CharThread extends DemoThread {
  public CharThread(JTextArea textArea) {
    super(textArea);
  }

  @Override
  public void run() {
    for (char c = 'A'; c <= 'Z'; c++) {
      textArea.append(Character.toString(c) + "\n");
      sleepThread(100);
    }
  }
}