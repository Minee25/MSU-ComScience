import java.util.Scanner;
import java.text.DecimalFormat;

public class E {
  public static void main(String[] args) {
    E obj = new E();
    String data = obj.input(">> ");
    Double money = obj.cal(data);
    String format = obj.format(money);
    obj.display(format);
  }

  void display(String data) {
    System.out.println(data);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  Double cal(String data) {
    char operator = ' ';
    for (int i = 0; i < data.length(); i++) {
      char x = data.charAt(i);
      if (x == '+' || x == '-' || x == '*' || x == '/') {
        operator = data.charAt(i);
        break;
      }
    }

    String[] numbers = data.split("\\" + String.valueOf(operator));
    double result = 0;
    if (operator == '+') {
      result = (double) Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    } else if (operator == '-') {
      result = (double) Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
    } else if (operator == '*') {
      result = (double) Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
    } else if (operator == '/') {
      result = (double) Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
    }
    return result;
  }

  String format(Double data) {
    String pattern = "#,##0.000";
    DecimalFormat df = new DecimalFormat(pattern);
    return df.format(data);
  }
}
