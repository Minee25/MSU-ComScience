import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex2_2 {
  public static void main(String[] args) {
    Multiply windows = new Multiply();
    windows.setVisible(true);
  }
}

class Multiply extends JFrame {
  JTextField inputTextField = new JTextField();
  JTextArea resultTextArea = new JTextArea();
  JButton submit = new JButton("Submit");

  public Multiply() {
    setSize(400, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());

    add(inputTextField, BorderLayout.NORTH);
    add(resultTextArea, BorderLayout.CENTER);
    add(submit, BorderLayout.SOUTH);

    submit.addMouseListener(new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) {
      }

      @Override
      public void mousePressed(MouseEvent e) {
        submitPressed(e);
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

    });
  }

  private void submitPressed(MouseEvent e) {
    try {
      String input = inputTextField.getText();
      int m = Integer.parseInt(input);
      resultTextArea.setText("");
      for (int i = 1; i <= 12; i++) {
        resultTextArea.append(m + " x " + i + " = " + (m * i) + "\n");
      }
    } catch (NumberFormatException err) {
      resultTextArea.setText("Input Nubmer Error!!!");
    }
  }
}
