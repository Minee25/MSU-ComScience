import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    D obj = new D();
    String fileName = "D_Input.txt";
    String fileNameOutput = "D_Output.txt";
    String text = obj.readFile(fileName);
    if (!text.equals("ERROR")) {
      char op = obj.findOperator(text);
      String[] parts = obj.splitOperator(text, op);
      int num1 = obj.convert(parts[0]);
      int num2 = obj.convert(parts[1]);
      int result = obj.cal(op, num1, num2);
      String numText = obj.convertToText(result);
      obj.display(num1, " ", op, " ", num2, " = ", result);
      obj.display(numText);
      obj.writeText(fileNameOutput, num1, num2, result, op, numText);
    } else if (text.equals("ERROR1")) {
      System.out.println(1);
    } else if (text.equals("ERROR2")) {
      System.out.println(2);
    } else if (text.equals("ERROR3")) {
      System.out.println(3);
    } else {
      obj.display("ERROR Not a number");
    }
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
      while (read.hasNextLine()) {
        textRead += read.nextLine() + " ";
      }
      read.close();
    } catch (FileNotFoundException e) {
      return "ERROR";
    }

    textRead = textRead.trim();
    if (!textRead.matches(".*[+\\-*/%].*")) {
      return "ERROR";
    }

    char op = findOperator(textRead);
    String[] parts = splitOperator(textRead, op);
    if (parts.length != 2) {
      return "ERROR";
    }

    String[] num = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    for (String part : parts) {
      String[] words = part.trim().split(" ");
      for (String word : words) {
        boolean found = false;
        for (String n : num) {
          if (word.equalsIgnoreCase(n)) {
            found = true;
            break;
          }
        }
        if (!found) {
          return "ERROR";
        }
      }
    }

    return textRead;
  }

  char findOperator(String text) {
    char[] opArr = { '+', '-', '*', '/', '%' };
    char op = ' ';
    for (int i = 0; i < text.length(); i++) {
      for (int j = 0; j < opArr.length; j++) {
        if (text.charAt(i) == opArr[j]) {
          op = text.charAt(i);
          break;
        }
      }
    }
    return op;
  }

  String[] splitOperator(String text, char op) {
    String[] parts = text.split("\\" + String.valueOf(op));
    return parts;
  }

  int cal(char op, int num1, int num2) {
    int result = 0;
    if (op == '+') {
      result = num1 + num2;
    } else if (op == '-') {
      result = num1 - num2;
    } else if (op == '*') {
      result = num1 * num2;
    } else if (op == '/') {
      result = num1 / num2;
    } else if (op == '%') {
      result = num1 % num2;
    }
    return result;
  }

  int convert(String text) {
    String[] parts = text.split(" ");
    String[] numStringArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine" };
    String numString = "";

    for (int i = 0; i < parts.length; i++) {
      for (int j = 0; j < numStringArr.length; j++) {
        if (parts[i].equalsIgnoreCase(numStringArr[j])) {
          numString += j;
        }
      }
    }
    return Integer.parseInt(numString);
  }

  String convertToText(int num) {
    char[] numStringArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    String[] numStringArr2 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine" };
    String numText = "";
    String numString = String.valueOf(num);

    for (int i = 0; i < numString.length(); i++) {
      for (int j = 0; j < numStringArr.length; j++) {
        if (numString.charAt(i) == numStringArr[j]) {
          numText += numStringArr2[j] + " ";
        }
      }
    }
    return numText;
  }

  void writeText(String fileNameOutput, int num1, int num2, int result, char op, String numText) {
    try {
      FileWriter writeOP = new FileWriter(new File(fileNameOutput));
      writeOP.write(num1 + " " + op + " " + num2 + " = " + result + "\n");
      writeOP.write(numText);
      writeOP.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
