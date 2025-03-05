import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    C obj = new C();
    String data = obj.input(">> ");
    obj.output(data);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void output(String data) { 
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i))) {
        System.out.print(data.charAt(i));
      } else if (data.charAt(i) == ',') {
        System.out.print("\t");
      } else if (data.charAt(i) == '/') {
        System.out.print("\n");
      }
    }
  }
} 
