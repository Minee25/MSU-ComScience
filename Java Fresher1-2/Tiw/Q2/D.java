
import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    D obj = new D();
    String text = obj.input(">> ");
    String ascii = obj.convert(text);
    obj.display(ascii);
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String data) {
    System.out.println(data);
  }

  String convert(String data) {
    if (data.matches("[A-Z ]+")) {
      String ASCII = "";
      for (int i = 0; i < data.length(); i++) {
        if (Character.isLetter(data.charAt(i))) {
          ASCII += (int) data.charAt(i);
        } else {
          ASCII += "+";
        }
      }
      return ASCII;
    } else if (data.matches("[\\d+]+")) {
      String text = "";
      String[] textSplit = data.split("\\+");
      for (int i = 0; i < textSplit.length; i++) {
        String textPap = textSplit[i];
        for (int j = 0; j < textPap.length(); j += 2) {
          text += (char) Integer.parseInt(textPap.substring(j, j + 2));
        }
        text += " ";
      }
      return text;
    } else {
      return "ERROR";
    }
  }
}
