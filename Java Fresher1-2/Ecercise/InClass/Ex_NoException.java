import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_NoException {
  Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    Ex_NoException obj = new Ex_NoException();
    int num1 = obj.input("Num (1): ");
    String op = obj.inputOp("Op: ");
    int num2 = obj.input("Num (2): ");
    int cal = obj.cal(num1, op, num2);
    obj.display(cal);

  }

  void display(Object... args) {
    for (Object obj : args) {
      System.out.print(obj);
    }
  }

  int input(String x) {
    while (true) {
      System.out.print(x);
      try {
        return Integer.parseInt(input.next());
      } catch (NumberFormatException err) {
        System.out.println(err);
      }
    }
  }

  String inputOp(String x) {
    while (true) { 
      System.out.print(x);
      try {
        return input.next();
      } catch (InputMismatchException err) {
        System.out.println(err);
      }
    }
  }
 
  int cal(int num1, String op, int num2) { 
    if (op.equals("+")) {
      return num1 + num2;
    } else if (op.equals("-")) {
      return num1 - num2;
    } else if (op.equals("*")) {
      return num1 * num2;
    } else if (op.equals("/")) {
      try {
        return num1 / num2;
      } catch (Exception e) {
        System.out.println("ไม่หารด้วย 0 นะงับ");
        return 0;
      }
    } else if (op.equals("%")) {
      try {
        return num1 % num2;
      } catch (Exception e) {
        System.out.println("ไม่หารด้วย 0 นะงับ");
        return 0;
      }
    } else {
      throw new IllegalArgumentException("ตัวดำเนินการไม่ถูกต้อง: " + op);
    }
  }
}
