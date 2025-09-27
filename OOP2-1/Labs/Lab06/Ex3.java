import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ex3 {
  public static void main(String[] args) {
    Windows windows = new Windows();
    windows.setVisible(true);
  }
}

class Windows extends JFrame {
  public Windows() {
    setTitle("Stop watch");
    setSize(1080, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    StopWatch stopWatch = new StopWatch();
    add(stopWatch);
  }
}

class StopWatch extends JPanel implements Runnable {
  JButton toggleBtn = new JButton("Start/Stop");
  JLabel timer = new JLabel();
  boolean running = false;

  int millisecond = 0;
  int second = 0;
  int minute = 0;
  int hour = 0;

  public StopWatch() {
    setLayout(new BorderLayout());
    timer.setText("00:00:00:000");
    timer.setFont(new Font(null, Font.PLAIN, 20));
    timer.setHorizontalAlignment(SwingConstants.CENTER);

    toggleBtn.setFont(new Font(null, Font.PLAIN, 20));
    toggleBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    toggleBtn.addActionListener(e -> {
      Toggle();
    });

    add(timer, BorderLayout.CENTER);
    add(toggleBtn, BorderLayout.SOUTH);
  }

  private void Toggle() {
    if (!running) {
      running = true;
      Thread t = new Thread(this);
      t.start();
    } else {
      running = false;
    }
  }

  @Override
  public void run() {
    while (running) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      millisecond++;

      if (millisecond >= 1000) {
        millisecond = 0;
        second++;
      }
      if (second >= 60) {
        second = 0;
        minute++;
      }
      if (minute >= 60) {
        minute = 0;
        hour++;
      }
      timer.setText(String.format("%02d:%02d:%02d:%03d", hour, minute, second, millisecond));
    }
  }
}
