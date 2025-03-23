import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class A {
  public static void main(String[] args) {
    A obj = new A();
    String fileNameInput = "A_Input.txt";

    obj.readFileToASCII(fileNameInput);
  }

  void readFileToASCII(String fileNameInput) {
    boolean isFirst = true;
    try {
      Scanner read = new Scanner(new File(fileNameInput));
      while (true) {
        if (read.hasNextLine() == false) {
          break;
        }
        String textRead = read.nextLine();
        String textASCII = toASCII(textRead);
        writeText(isFirst, textASCII);
        isFirst = false;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }

  String toASCII(String text) {
    String textASCII = "";
    String[] textPart = text.split(" ");
    for (int i = 0; i < textPart.length; i++) {
      for (int j = 0; j < textPart[i].length(); j++) {
        textASCII += (int) textPart[i].charAt(j);
      }
      if (i < textPart.length - 1) {
        textASCII += "+";
      }
    }
    return textASCII;
  }

  void writeText(boolean isFirst, String text) {
    String fileNameOutput = "A_Output.txt";
    try {
      if (isFirst) {
        FileWriter fwFirst = new FileWriter(fileNameOutput);
        fwFirst.write("");
        fwFirst.close();
      }
      FileWriter fw = new FileWriter(new File(fileNameOutput), true);
      fw.write(text + "\n");
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
