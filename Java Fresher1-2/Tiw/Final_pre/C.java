import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    C obj = new C();

    String textRead = obj.readFile();
    int uppercase = obj.findUpperCase(textRead);
    int lowercase = obj.findLowerCase(textRead);
    int digit = obj.findDigit(textRead);
    int line = obj.findLine(textRead);

    obj.display(uppercase, " Upper Case");
    obj.display(lowercase, " Lower Case");
    obj.display(digit, " Digit");
    obj.display(line, " Line");
  }

  void display(int number, String str) {
    System.out.println(number + str);
  }

  String readFile() {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File("C_Input.txt"));
      while (read.hasNextLine()) {
        textRead += read.nextLine() + "\n";
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textRead;
  }

  int findUpperCase(String textRead) {
    int uppercase = 0;
    for (int i = 0; i < textRead.length(); i++) {
      if (Character.isUpperCase(textRead.charAt(i))) {
        uppercase++;
      }
    }
    return uppercase;
  }

  int findLowerCase(String textRead) {
    int lowercase = 0;
    for (int i = 0; i < textRead.length(); i++) {
      if (Character.isLowerCase(textRead.charAt(i))) {
        lowercase++;
      }
    }
    return lowercase;
  }

  int findDigit(String textRead) {
    int digit = 0;
    for (int i = 0; i < textRead.length(); i++) {
      if (Character.isDigit(textRead.charAt(i))) {
        digit++;
      }
    }
    return digit;
  }

  int findLine(String textRead) {
    String[] textParts = textRead.split("\n");
    return textParts.length;
  }
}
