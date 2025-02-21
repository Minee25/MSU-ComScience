import java.util.Scanner;

public class F {
  public static void main(String[] args) {
    F obj = new F();
    String data = obj.input(">> ");
    boolean check = obj.check(data);
    obj.display(check);
  }

  void display(boolean data) {
    System.out.println(data);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.println(x);
    return input.nextLine();
  }

  boolean check(String data) { 
    // if (Character.toLowerCase(data.charAt(0)) == Character.toLowerCase(data.charAt(data.length() - 1))) {
    if (String.valueOf(data.charAt(0)).equalsIgnoreCase(String.valueOf(data.charAt(data.length() - 1)))) {
      return true;
    } else {
      return false;
    }
  }
}
