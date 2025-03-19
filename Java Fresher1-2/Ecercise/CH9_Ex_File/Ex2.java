import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    obj.run();
  }

  void run() {
    String fileName = "Ex2_Out.xls";
    boolean isFirst = true;
    try {
      FileWriter fileWriter = new FileWriter(fileName); // read
      FileInputStream fileInputStream = new FileInputStream(fileName); // write
      while (true) {
        String id = inputCode("ID: ");

        if (id.charAt(0) == '0') {
          fileWriter.close();
          readFile(fileInputStream);
          System.out.println("Exit...");
          break;
        }
        String firstName = input("Firstname: ");
        String lastName = input("Lastname: ");
        int midterm = inputNums("Midterm: ");
        int finalterm = inputNums("Final: ");
        int sumScore = sumScore(midterm, finalterm);
        String grade = calGrade(sumScore);

        writeText(fileWriter, isFirst, id, firstName, lastName, midterm, finalterm, sumScore, grade);
        isFirst = false;
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print(prompt);
      String usrInput = input.nextLine();
      if (!usrInput.trim().equals("")) {
        return usrInput;
      }
      System.out.println("Please field!");
    }
  }

  String inputCode(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print(prompt);
      String usrInput = input.nextLine();
      if (usrInput.matches("[0-9]+")) {
        return usrInput;
      }
      System.out.println("Please Code!");
    }
  }

  int inputNums(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException err) {
        System.out.println(err);
        System.out.println("Please fiels a number!");
        input.next();
      }
    }
  }

  int sumScore(int midterm, int finalterm) {
    return midterm + finalterm;
  }

  String calGrade(int score) {
    if (score >= 80) {
      return "A";
    } else if (score >= 75) {
      return "B+";
    } else if (score >= 70) {
      return "B";
    } else if (score >= 65) {
      return "C+";
    } else if (score >= 60) {
      return "C";
    } else if (score >= 55) {
      return "D+";
    } else if (score >= 50) {
      return "D";
    } else {
      return "F";
    }
  }

  void writeText(FileWriter fileWriter, boolean isFirst, String id, String firstName, String lastName, int midterm,
      int finalterm, int score, String gradString) {

    try {
      if (isFirst) {
        fileWriter.write("CODE" + "\t" + "Firstname" + "\t" + "Lastname" + "\t" + "Midterm" + "\t" + "Final" + "\t" + "Score" + "\t" + "Grade" + "\n");
      }
      fileWriter.write(id + "\t" + firstName + "\t" + lastName + "\t" + midterm + "\t" + finalterm + "\t" + score + "\t" + gradString + "\n");
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
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
