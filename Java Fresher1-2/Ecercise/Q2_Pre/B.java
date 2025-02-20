import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    B obj = new B();
    String text = obj.input(">> ");
    String swap = obj.swap(text);
    obj.display(swap);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String data) {
    System.out.print(data);
  }

  String swap(String data) {
    String textSwap = "";
    for (int i = 0; i < data.length(); i++) {
      if (i % 2 == 0) {
        textSwap += Character.toUpperCase(data.charAt(i));
      } else {
        textSwap += data.charAt(i);
      }
    }

    return textSwap;
  }
}
