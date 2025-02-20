import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Ex3 obj = new Ex3();
    String data = obj.input("Input: ");
    obj.display(obj.checkNumeric(data), " Numeric");
    obj.display(obj.checkLowercase(data), " Lowercase");
    obj.display(obj.checkUppercase(data), " Uppercase");
  }

  void display(int data, String msg) {
    System.out.println(data + msg);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  int checkNumeric(String data) {
    int numeric = 0;
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i))) {
        numeric++;
      }
    }
    return numeric;
  }

  int checkLowercase(String data) {
    int lowercase = 0;
    for (int i = 0; i < data.length(); i++) {
      if (Character.isLowerCase(data.charAt(i))) {
        lowercase++;
      }
    }
    return lowercase;
  }

  int checkUppercase(String data) {
    int uppercase = 0;
    for (int i = 0; i < data.length(); i++) {
      if (Character.isUpperCase(data.charAt(i))) {
        uppercase++;
      }
    }
    return uppercase;
  }
}
