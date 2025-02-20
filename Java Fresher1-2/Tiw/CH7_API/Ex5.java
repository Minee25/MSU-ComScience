
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Ex5 obj = new Ex5();
    String data = obj.input(">> ");
    obj.display(obj.swap2(data));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String x) {
    System.out.println(x);
  }

  String swap(String data) {
    StringBuilder swap = new StringBuilder(data);
    swap.reverse();
    return swap.toString();
  }

  String swap2(String data) {
    String text = "";
    for (int i = data.length() - 1; i >= 0; i--) {
      text += data.charAt(i);
    }
    return text;
  }
}
