import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    D obj = new D();
    String data = obj.input(">> ");
    String num = obj.ASCII(data);
    obj.display(num);
    System.out.println(((int) 'A'));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String data) {
    System.out.println(data);
  }

  String ASCII(String data) {
    String num = "";
      for (int i = 0; i < data.length(); i++) {
        if (Character.isLetter(data.charAt(i))) {
          num += (int) (data.charAt(i));
        } else {
          num += "+";
        }
      }
      return num;
  }
}
