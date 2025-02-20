import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Ex5 obj = new Ex5();
    String data = obj.input("Input: ");
    obj.display(obj.reverse(data));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String x) {
    System.out.println(x);
  }

  String reverse(String x) {
    String reverse = new StringBuilder(x).reverse().toString();
    return reverse;
  }
}
