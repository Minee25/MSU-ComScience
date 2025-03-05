import java.text.DecimalFormat;
import java.util.Scanner;

public class E {
  public static void main(String[] args) {
    E obj = new E();
    String data = obj.input(">> ");
    double cal = obj.cal(data);
    String format = obj.format(cal);
    obj.display(format);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String data) {
    System.out.println(data);
  }

  // 7*300
  double cal(String data) {
    // หา op
    char op = ' ';
    for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == '+') {
        op = '+';
        break;
      }
      if (data.charAt(i) == '-') {
        op = '-';
        break;
      }
      if (data.charAt(i) == '*') {
        op = '*';
        break;
      }
      if (data.charAt(i) == '/') {
        op = '/';
        break;
      }
    }

    // cal
    String[] num = data.split("\\" + String.valueOf(op));
    double result = 0;

    if (op == '+') {
      result = (double) Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
    } else if (op == '-') {
      result = (double) Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
    } else if (op == '*') {
      result = (double) Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
    } else if (op == '/') {
      result = (double) Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
    } 
    return result;
  }

  String format(double data) {
    // String pattern = "#,##0.000";
    // DecimalFormat df = new DecimalFormat(pattern);
    // String money = df.format(data);
    String money = String.format("%,.3f", data);
    return money;
  }
}
