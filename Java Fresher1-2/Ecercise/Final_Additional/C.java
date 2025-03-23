import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    C obj = new C();
    String fileName = "C_Input.txt";
    String fileNameOutput = "C_Output.txt";

    String text = obj.readFile(fileName);
    int upperCase = obj.upperCase(text);
    int lowerCase = obj.lowerCase(text);
    int digit = obj.digit(text);
    int line = obj.line(fileName);

    obj.display("Upper Case: ", upperCase);
    obj.display("Lower Case: ", lowerCase);
    obj.display("Digit: ", digit);
    obj.display("Line: ", line);

    obj.writeFile(fileNameOutput, upperCase, lowerCase, digit, line);
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  String readFile(String fileName) {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNext()) {
        textRead += read.nextLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textRead.trim();
  }

  int upperCase(String text) {
    int upperCaseAmount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isUpperCase(text.charAt(i))) {
        upperCaseAmount++;
      }
    }
    return upperCaseAmount;
  }

  int lowerCase(String text) {
    int lowerCaseAmount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isLowerCase(text.charAt(i))) {
        lowerCaseAmount++;
      }
    }
    return lowerCaseAmount;
  }

  int digit(String text) {
    int digitAmount = 0;
    for (int i = 0; i < text.length(); i++) {
      if (Character.isDigit(text.charAt(i))) {
        digitAmount++;
      }
    }
    return digitAmount;
  }

  int line(String fileName) {
    int line = 0;
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNext()) {
        read.nextLine();
        line++;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return line;
  }

  void writeFile(String fileNameOutput, int upperCase, int lowerCase, int digit, int line) {
    try {
      FileWriter fileWriter = new FileWriter(new File(fileNameOutput));
      fileWriter.write("Upper Case: " + upperCase + "\n");
      fileWriter.write("Lower Case: " + lowerCase + "\n");
      fileWriter.write("Digit: " + digit + "\n");
      fileWriter.write("Line: " + line + "\n");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
