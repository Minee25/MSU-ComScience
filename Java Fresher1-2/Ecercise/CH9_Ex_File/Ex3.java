import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Ex3 obj = new Ex3();
    String fileName = "Ex3.xls";
    boolean isFirst = true;
    while (true) {
      String code = obj.inputCode("Code: ");
      if (code.charAt(0) == '0') {
        obj.readAndWrite(fileName);
        obj.readFile(fileName);
        break;
      }
      String firstName = obj.input("Firstname: ");
      String lastName = obj.input("Lastname: ");
      int midTerm = obj.inputNum("Midterm: ");
      int finalTerm = obj.inputNum("Final: ");
      int sumScore = obj.sumScore(midTerm, finalTerm);
      char grade = obj.calGrade(sumScore);
      obj.writeText(fileName, isFirst, code, firstName, lastName, midTerm, finalTerm, sumScore, grade);
      isFirst = false;
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print(prompt);
      String usrInput = input.nextLine().trim();
      if (!usrInput.equals("")) {
        return usrInput;
      }
      System.out.println("Not empty!");
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

  int inputNum(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Please a number!");
        System.out.println(e);
        input.next();
      }
    }
  }

  int sumScore(int midTerm, int finalTerm) {
    return midTerm + finalTerm;
  }

  char calGrade(int sumScore) {
    if (sumScore >= 80) {
      return 'A';
    } else if (sumScore >= 70) {
      return 'B';
    } else if (sumScore >= 60) {
      return 'C';
    } else if (sumScore >= 50) {
      return 'D';
    } else {
      return 'F';
    }
  }

  void writeText(String fileName, boolean isFirst, String code, String firstName, String lastName, int midTerm,
      int finalTerm, int sumScore, char grade) {
    try {
      if (isFirst) {
        FileWriter fileWriterFirst = new FileWriter(fileName);
        fileWriterFirst.write("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade\n");
        fileWriterFirst.close();
      }
      FileWriter fileWriter = new FileWriter(fileName, true);
      fileWriter.write(code + "\t" + firstName + "\t" + lastName + "\t" + midTerm + "\t" + finalTerm + "\t" + sumScore
          + "\t" + grade + "\n");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  void readAndWrite(String fileName) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      String read;
      bufferedReader.readLine();
      List<Integer> midTerms = new ArrayList<>();
      List<Integer> finalTerms = new ArrayList<>();
      List<Integer> scores = new ArrayList<>();
      Map<String, Integer> gradeCount = new HashMap<>();
      int student = 0;

      while ((read = bufferedReader.readLine()) != null) {
        student++;

        String[] parts = read.split("\t");

        midTerms.add(Integer.parseInt(parts[3]));
        finalTerms.add(Integer.parseInt(parts[4]));
        scores.add(Integer.parseInt(parts[5]));

        gradeCount.put(parts[6], gradeCount.getOrDefault(parts[6], 0) + 1);
      }
      bufferedReader.close();

      DecimalFormat df = new DecimalFormat("0.0#");

      FileWriter fileWriter = new FileWriter(fileName, true);
      fileWriter.write("//////////////////////////////////////////////////////////////////\n");
      fileWriter.write("Student: " + student + "\n");
      fileWriter.write("\tMidterm\tFinal\tScore\tA\tB\tC\tD\tF\n");
      fileWriter.write("Max:\t" + Collections.max(midTerms) + "\t" + Collections.max(finalTerms) + "\t"
          + Collections.max(scores) + "\n");
      fileWriter.write("Min:\t" + Collections.min(midTerms) + "\t" + Collections.min(finalTerms) + "\t"
          + Collections.min(scores) + "\n");
      fileWriter.write("Avg:\t"
          + df.format(midTerms.stream().mapToDouble(Integer::intValue).sum() / student) + "\t"
          + df.format(finalTerms.stream().mapToDouble(Integer::intValue).sum() / student) + "\t"
          + df.format(scores.stream().mapToDouble(Integer::intValue).sum() / student) + "\n");
      fileWriter.write("Grade:\t\t\t\t");
      for (String grade : Arrays.asList("A", "B", "C", "D", "F")) {
        fileWriter.write(gradeCount.getOrDefault(grade, 0) + "\t");
      }
      fileWriter.write("\n//////////////////////////////////////////////////////////////////\n");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  void readFile(String fileName) {
    try {
      FileInputStream fileInputStream = new FileInputStream(fileName);
      while (true) {
        int x = fileInputStream.read();
        if (x == -1) {
          break;
        }
        System.out.print((char) x);
      } 
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
