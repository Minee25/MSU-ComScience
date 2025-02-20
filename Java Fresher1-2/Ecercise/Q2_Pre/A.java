import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    A obj = new A();

    String text = obj.input(">> ");
    int number = obj.numberSum(text);
    obj.display(number);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(int data) {
    System.out.println(data);
  }

  int numberSum(String data) {
    int sum = 0;
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i))) {
        sum += Integer.parseInt(String.valueOf(data.charAt(i)));
      }
    }
    return sum;
  }
}
