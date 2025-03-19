import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CalculateGrade {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(new File("Score.txt"));

      String nisit = "";
      String grade = "";
      while (input.hasNext()) {
        nisit = input.nextLine();
        int pos = nisit.indexOf(" ");
        String score = nisit.substring(pos, nisit.length());
        score = score.trim();
        double scoreInt = Double.parseDouble(score);

        if (scoreInt >= 80) {
          grade = "A";
        } else if (scoreInt >= 75) {
          grade = "B+";
        } else if (scoreInt >= 70) {
          grade = "B";
        } else if (scoreInt >= 65) {
          grade = "C+";
        } else if (scoreInt >= 60) {
          grade = "C";
        } else if (scoreInt >= 55) {
          grade = "D+";
        } else if (scoreInt >= 50) {
          grade = "D";
        } else if (scoreInt < 50) {
          grade = "F";
        }
        System.out.println(nisit + " " + grade);
      }
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
