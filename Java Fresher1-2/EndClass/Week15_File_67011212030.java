import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Week15_File_67011212030 {
  public static void main(String[] args) {
    Week15_File_67011212030 obj = new Week15_File_67011212030();
    String fileName = "std.xls";
    boolean addFirst = true;
    while (true) {
      String id = obj.input("ID: ");
      if (String.valueOf(id.charAt(0)).equals("0")) {
        System.out.println("Exit...");
        break;
      }
      String firstName = obj.input("First name: ");
      String lastName = obj.input("Last name: ");
      int midTerm = obj.inputNums("Midterm: ");
      int finalTerm = obj.inputNums("Final: ");

      int sumScore = midTerm + finalTerm;
      String grade = obj.calGrade(sumScore);
      obj.writeToXls(fileName, addFirst, id, firstName, lastName, midTerm, finalTerm, sumScore, grade);
      addFirst = false;
    }
    obj.readFile(fileName);
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        return input.nextLine();
      } catch (InputMismatchException err) {
        System.out.println(err);
        System.out.println("Number only!");
        input.next();
      }
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
        System.out.println("Number only!");
        input.next();
      }
    }
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

  void writeToXls(String fileName, boolean addFirst, String id, String firstName, String lastName, int midTerm,
      int finalTerm, int sumScore, String grade) {
    try {
      if (addFirst) {
        FileWriter fileWriterFirst = new FileWriter(fileName);
        fileWriterFirst.write("Code\tFirstname\tLastname\tMidterm\tFinal\tScore\tGrade\n");
        fileWriterFirst.close();
      }
      FileWriter fileWriter = new FileWriter(fileName, true);
      fileWriter.write(id + "\t");
      fileWriter.write(firstName + "\t");
      fileWriter.write(lastName + "\t");
      fileWriter.write(midTerm + "\t");
      fileWriter.write(finalTerm + "\t");
      fileWriter.write(sumScore + "\t");
      fileWriter.write(grade + "\n");
      fileWriter.close();
    } catch (FileNotFoundException err) {
      System.out.println(err);
    } catch (IOException err) {
      System.out.println(err);
    }
  }

  void readFile(String fileName) {
    try {
      FileInputStream fileRead = new FileInputStream(fileName);
      while (true) {
        int read = fileRead.read();
        if (read == -1) {
          break;
        }
        System.out.print((char) read);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}