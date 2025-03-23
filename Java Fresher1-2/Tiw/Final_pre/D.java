import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    D obj = new D();
    String fileName = "D_Input.txt";
    String fileNameOutput = "D_Output.txt";

    String textRead = obj.readFile(fileName);
    char op = obj.findOperator(textRead);
    String[] numParts = obj.splitBetweenOperator(textRead, op);
    int num1 = obj.convertToNum(numParts[0]);
    int num2 = obj.convertToNum(numParts[1]);
    int result = obj.cal(op, num1, num2);
    String numString = obj.convertToText(result);

    obj.writeText(fileNameOutput, num1, num2, result, op, numString);

    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    System.out.println(numString);
  }

  String readFile(String fileName) {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNextLine()) {
        textRead += read.nextLine() + " ";
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textRead;
  }

  int convertToNum(String text) {
    String[] parts = text.split(" ");
    String numString = "";
    // String[] numStringArr = { "zero", "one", "two", "three", "four", "five",
    // "six", "seven", "eight",
    // "nine" };
    // for (int i = 0; i < parts.length; i++) {
    // for (int j = 0; j < numStringArr.length; j++) {
    // if (parts[i].equalsIgnoreCase(numStringArr[j])) {
    // numString += j;
    // }
    // }
    // }
    // return Integer.parseInt(numString);

    for (int i = 0; i < parts.length; i++) {
      if (parts[i].equalsIgnoreCase("one")) {
        numString += 1;
      } else if (parts[i].equalsIgnoreCase("two")) {
        numString += 2;
      } else if (parts[i].equalsIgnoreCase("three")) {
        numString += 3;
      } else if (parts[i].equalsIgnoreCase("four")) {
        numString += 4;
      } else if (parts[i].equalsIgnoreCase("five")) {
        numString += 5;
      } else if (parts[i].equalsIgnoreCase("six")) {
        numString += 6;
      } else if (parts[i].equalsIgnoreCase("seven")) {
        numString += 7;
      } else if (parts[i].equalsIgnoreCase("eight")) {
        numString += 8;
      } else if (parts[i].equalsIgnoreCase("nine")) {
        numString += 9;
      } else if (parts[i].equalsIgnoreCase("zero")) {
        numString += 0;
      }
    }
    return Integer.parseInt(numString);
  }

  char findOperator(String text) {
    // char[] opArr = { '+', '-', '*', '/', '%' };
    // char op = ' ';
    // for (int i = 0; i < text.length(); i++) {
    // for (int j = 0; j < opArr.length; j++) {
    // if (text.charAt(i) == opArr[j]) {
    // op = text.charAt(i);
    // break;
    // }
    // }
    // }
    // return op;

    char op = ' ';
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == '+') {
        op = '+';
        break;
      } else if (text.charAt(i) == '-') {
        op = '-';
        break;
      } else if (text.charAt(i) == '*') {
        op = '*';
        break;
      } else if (text.charAt(i) == '/') {
        op = '/';
        break;
      } else if (text.charAt(i) == '%') {
        op = '%';
        break;
      }
    }
    return op;
  }

  String[] splitBetweenOperator(String text, char op) {
    String[] parts = text.split("\\" + String.valueOf(op));
    return parts;
  }

  int cal(char op, int num1, int num2) {
    if (op == '+') {
      return num1 + num2;
    } else if (op == '-') {
      return num1 - num2;
    } else if (op == '*') {
      return num1 * num2;
    } else if (op == '/') {
      return num1 / num2;
    } else if (op == '%') {
      return num1 % num2;
    } else {
      return 0;
    }
  }

  String convertToText(int num) {
    // char[] numStringArr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    // String[] numStringArr2 = { "zero", "one", "two", "three", "four", "five",
    // "six", "seven", "eight",
    // "nine" };
    // String numText = "";
    // String numString = String.valueOf(num);

    // for (int i = 0; i < numString.length(); i++) {
    // for (int j = 0; j < numStringArr.length; j++) {
    // if (numString.charAt(i) == numStringArr[j]) {
    // numText += numStringArr2[j] + " ";
    // }
    // }
    // }
    // return numText;

    String numString = "";
    String numToString = String.valueOf(num);
    for (int i = 0; i < numToString.length(); i++) {
      if (numToString.charAt(i) == '1') {
        numString += "one" + " ";
      } else if (numToString.charAt(i) == '2') {
        numString += "two" + " ";
      } else if (numToString.charAt(i) == '3') {
        numString += "three" + " ";
      } else if (numToString.charAt(i) == '4') {
        numString += "four" + " ";
      } else if (numToString.charAt(i) == '5') {
        numString += "five" + " ";
      } else if (numToString.charAt(i) == '6') {
        numString += "six" + " ";
      } else if (numToString.charAt(i) == '7') {
        numString += "seven" + " ";
      } else if (numToString.charAt(i) == '8') {
        numString += "eight" + " ";
      } else if (numToString.charAt(i) == '9') {
        numString += "nine" + " ";
      } else if (numToString.charAt(i) == '0') {
        numString += "zero" + " ";
      }
    }
    return numString.trim();
  }

  void writeText(String fileNameOutput, int num1, int num2, int result, char op, String numString) {
    try {
      FileWriter fileWriter = new FileWriter(new File(fileNameOutput));
      fileWriter.write(num1 + " " + op + " " + num2 + " = " + result + "\n");
      fileWriter.write(numString);
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
