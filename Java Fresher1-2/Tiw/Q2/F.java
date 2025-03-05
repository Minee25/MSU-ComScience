import java.util.Scanner;

public class F {
  public static void main(String[] args) {
    F obj = new F();
    String text = obj.input(">> ");
    boolean check = obj.check(text);
    obj.display(check);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(boolean data) {
    System.out.println(data);
  }

  boolean check(String data) {
    if (Character.toLowerCase(data.charAt(0)) == Character.toLowerCase(data.charAt(data.length() - 1))) {
      return true;
    }
    return false;
  }
}
