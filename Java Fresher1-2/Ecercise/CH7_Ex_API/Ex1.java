import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Ex1 obj = new Ex1();

    String data = obj.input("Input: ");
    obj.display(data, obj.checkTellAndEmail(data));
  }

  void display(String data, boolean isTel) {
    if (isTel) {
      System.out.println(data + " Is Mobile phone number.");
      System.out.println(data + " Is not e-mail address.");
    } else {
      String domain = data.substring(data.indexOf('@') + 1, data.length());
      System.out.println(data + " Is not phone number.");
      System.out.println(data + " Is e-mail address");
      System.out.println("From: " + domain);
    }
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  boolean checkTellAndEmail(String data) {
    if (!data.contains("@")) {
      return true;
    } else {
      return false;
    }
  }
}
