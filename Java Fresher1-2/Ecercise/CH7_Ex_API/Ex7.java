import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Ex7 obj = new Ex7();
    Double money = obj.input("Money: ");
    obj.display(obj.line1(money));
    obj.display(obj.line2(money));
    obj.display(obj.line3(money));
    obj.display(obj.line4(money));
  }

  void display(String data) {
    System.out.println(data);
  }

  Double input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextDouble();
  }

  String line1(Double data) {
    String pattern = "#,###.0";
    DecimalFormat df = new DecimalFormat(pattern);
    df.setRoundingMode(RoundingMode.FLOOR);
    String myMoney = df.format(data);
    return myMoney;
  }

  String line2(Double data) {
    String pattern = "#,###.000";
    DecimalFormat df = new DecimalFormat(pattern);
    df.setRoundingMode(RoundingMode.FLOOR);
    String myMoney = df.format(data);
    return myMoney;
  }

  String line3(Double data) {
    String pattern = "#,####.0";
    DecimalFormat df = new DecimalFormat(pattern);
    df.setRoundingMode(RoundingMode.FLOOR);
    String myMoney = df.format(data);
    return myMoney;
  }

  String line4(Double data) {
    String pattern = "#,##.00000";
    DecimalFormat df = new DecimalFormat(pattern);
    df.setRoundingMode(RoundingMode.FLOOR);
    String myMoney = df.format(data);
    return myMoney;
  }
}
