import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex1 obj = new Ex1();

    String data = obj.input(">> ");
    obj.display(data, obj.isTel(data));
    obj.display(data, obj.isEmail(data));
  }

  void display(String data, String msg) {
    System.out.println(data + " " + msg);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  String isTel(String data) {
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i)) == false) {
        return "Is not phone number.";
      }
    }
    return "Is Mobile phone number.";
  }

  String isEmail(String data) {
    for (int i = 0; i < data.length(); i++) {
      if (Character.isDigit(data.charAt(i)) == false) {
        int indexAt = data.indexOf('@');
        String host = data.substring(indexAt + 1, data.length());
        return "Is e-mail address from " + host + " host.";
      }
    }
    return "Is not e-mail address.";
  }
}
