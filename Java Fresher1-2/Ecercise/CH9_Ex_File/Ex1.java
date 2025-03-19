import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Ex1 obj = new Ex1();
    String fileName = "Ex1_Out.doc";
    try {
      FileWriter fileWriter = new FileWriter(fileName);
      FileInputStream fileInputStream = new FileInputStream(fileName);
      while (true) {
        String usrInput = obj.input(">> ");
        if (usrInput.equalsIgnoreCase("stop")) {
          fileWriter.close();
          obj.readFile(fileInputStream);
          System.out.println("\nExit...");
          break;
        } else {
          obj.writeTxt(fileWriter, usrInput);
        }
      }
    } catch (IOException err) {
      System.out.println(err);
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  void writeTxt(FileWriter fileWriter, String usrInput) {
    try {
      fileWriter.write(usrInput);
    } catch (IOException err) {
      System.out.println(err);
    }
  }

  void readFile(FileInputStream fileInputStream) {
    try {
      while (true) {
        int read = fileInputStream.read();
        if (read == -1) {
          break;
        }
        System.out.print((char) read);
      }
    } catch (IOException err) {
      System.out.println(err);
    }
  }
}
