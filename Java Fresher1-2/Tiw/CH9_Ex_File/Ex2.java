import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    String fileName = "std.xls";
    boolean isFirst = true;

    while (true) {
      String code = obj.input("Code: ");
      if (code.charAt(0) == '0') {
        System.out.println("Exit...");
        break;
      }
      String firstName = obj.input("Firstname: ");
      String lastname = obj.input("Lastname: ");
      int midterm = obj.inputNum("Midterm: ");
      int finalterm = obj.inputNum("Final: ");

      int sumScore = midterm + finalterm;
      String grade = obj.calGrade(sumScore);
      obj.writeFile(fileName, isFirst, code, firstName, lastname, midterm, finalterm, sumScore, grade);

      isFirst = false;
    }
    obj.readFile(fileName);
  }

  String input(String ui) {
    Scanner input = new Scanner(System.in);
    System.out.print(ui);
    return input.nextLine();
  }

  int inputNum(String ui) {
    Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(ui);
        return input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println(e);
        System.out.println("Please a number!");
        input.next();
      }
    }
  }

  String calGrade(int sumScore) {
    String grade = "";
    if (sumScore > 80) {
      grade = "A";
    } else if (sumScore > 70) {
      grade = "B";
    } else if (sumScore > 60) {
      grade = "C";
    } else if (sumScore > 50) {
      grade = "D";
    } else {
      grade = "F";
    }
    return grade;
  }

  void writeFile(String fileName, boolean isFirst, String code, String firstName, String lastName, int midterm,
      int finalterm, int sumScore, String grade) {
    try {
      if (isFirst) {
        FileWriter fwFisrt = new FileWriter(fileName);
        fwFisrt.write("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade\n");
        fwFisrt.close();
      }
      FileWriter fw = new FileWriter(fileName, true);
      fw.write(code + "\t");
      fw.write(firstName + "\t");
      fw.write(lastName + "\t");
      fw.write(midterm + "\t");
      fw.write(finalterm + "\t");
      fw.write(sumScore + "\t");
      fw.write(grade + "\n");
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
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
}
