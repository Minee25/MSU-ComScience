import java.util.Scanner;

public class Week13_Exception_67011212030 {
  public static void main(String[] args) {
    Week13_Exception_67011212030 obj = new Week13_Exception_67011212030();
    // ANB256POk13
    // 1GB./23LU8
    // 999999999999999999999999999999919
    // AFSF9etw999AewtF999!!99AFS9(wt9)9999999!!!...99Gw+-tAGWQWTQWT9999QWwetTTW/QT9999*999Yqy19qyqy
    String data = obj.input(">> ");
    String numSplits = obj.numSplits(data);
    obj.displayFormat(numSplits);
    String sum = obj.sum(numSplits);
    while (true) {
      obj.display(" = ", sum);
      if (sum.length() <= 1) {
        break;
      }
      obj.displayFormat(sum);
      sum = obj.sum(sum);
    }
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  void displayFormat(String data) {
    for (int i = 0; i < data.length(); i++) {
      System.out.print(data.charAt(i));
      if (i < data.length() - 1) {
        System.out.print(" + ");
      }
    }
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  String numSplits(String data) {
    String sum = "";
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i))) {
        sum += Character.getNumericValue(data.charAt(i));
      }
    }
    return sum;
  }

  String sum(String data) {
    int sum = 0;
    for (int i = 0; i < data.length(); i++) {
      sum += Character.getNumericValue(data.charAt(i));
    }
    return String.valueOf(sum);
  }
}
