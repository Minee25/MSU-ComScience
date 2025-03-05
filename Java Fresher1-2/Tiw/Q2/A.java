import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    A obj = new A();
    String text = obj.input(">> ");
    int sum = obj.sum(text);
    obj.display(sum); 
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(int data) {
    System.out.println(data);
  }

  int sum(String data) {
    int sum = 0;
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i))) {
        sum += Character.getNumericValue(data.charAt(i));
      }
    }
    return sum;
  }
}
