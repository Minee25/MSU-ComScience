import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    A obj = new A();
    String fileName = "A_Input.txt";
    obj.readFileTextToASCII(fileName);
    System.out.println("Print Input Files:");
    obj.readFile(fileName); 
    System.out.println("\nPrint Output Files:");
    obj.readFile("A_Output.txt");
  }

  void readFileTextToASCII(String fileName) {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File(fileName));
      boolean isFirst = true;
      while (true) {
        if (!read.hasNext()) {
          break;
        }
        textRead = read.nextLine();

        if (textRead.matches("[A-Z ]+")) {
          String textASCII = textASCII(textRead);
          writeText(textASCII, isFirst);
        } else if (textRead.matches("[\\d+]+")) {
          String textASCII = asciiToText(textRead);
          writeText(textASCII, isFirst);
        }

        isFirst = false;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }

  String textASCII(String textRead) {
    String textASCII = "";
    String[] textSplit = textRead.split(" ");
    for (int i = 0; i < textSplit.length; i++) {
      for (int j = 0; j < textSplit[i].length(); j++) {
        textASCII += (int) textSplit[i].charAt(j);
        if (i < textSplit.length - 1) {
          textASCII += "+";
        }
      }
    }
    return textASCII;
  }

  void writeText(String textASCII, boolean isFirst) {
    String newFileName = "A_Output.txt";
    try {
      if (isFirst) {
        FileWriter fileWriter = new FileWriter(newFileName);
        fileWriter.write("");
        fileWriter.close();
      }
      FileWriter fileWriter = new FileWriter(newFileName, true);
      fileWriter.write(textASCII + "\n");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  void readFile(String fileName) {
    try {
      Scanner read = new Scanner(new File(fileName));
      while (true) {
        if (!read.hasNext()) {
          break;
        }
        System.out.println(read.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }

  String asciiToText(String textASCII) {
    String normalText = "";
    String[] asciiSplit = textASCII.split("\\+");

    for (int i = 0; i < asciiSplit.length; i++) {
      String dataArr = asciiSplit[i];
      for (int j = 0; j < dataArr.length(); j += 2) {
        normalText += (char) Integer.parseInt(dataArr.substring(j, j + 2));
      }
      normalText += " ";
    }
    return normalText;
  }
}
