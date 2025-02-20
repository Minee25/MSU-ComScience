import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    String data = obj.input("Input: ");
    obj.display(data, obj.palindrome(data));
  }

  void display(String data, String msg) {
    System.out.println(data + " " + msg);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  String palindrome(String data) {
    String reverse = new StringBuilder(data).reverse().toString();
    if (data.equals(reverse)) {
      for (int i = 0; i < data.length(); i++) {
        if (!Character.isDigit(data.charAt(i))) {
          return "Is String palindrome.";
        }
      }
      return "Is numeric palindrome.";
    } else {
      return "Is not palinedrome.";
    }
  }
}
