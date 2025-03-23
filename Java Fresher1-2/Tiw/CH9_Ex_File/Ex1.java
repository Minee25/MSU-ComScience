import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Ex1 obj = new Ex1();
    String fileName = "data.doc";

    String sumText = "";
    while (true) {
      String text = obj.input("Input: ");
      if (text.equals("stop")) {
        break;
      }
      sumText += text + "\n";
    }

    obj.writeFile(fileName, sumText);
    obj.readFile(fileName);
  }

  String input(String ui) {
    Scanner input = new Scanner(System.in);
    System.out.print(ui);
    return input.nextLine();
  }

  void writeFile(String fileName, String sumText) {
    try {
      FileWriter fw = new FileWriter(fileName);
      fw.write(sumText);
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  void readFile(String fileName) {
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNextLine()) {
        System.out.println(read.nextLine());
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
