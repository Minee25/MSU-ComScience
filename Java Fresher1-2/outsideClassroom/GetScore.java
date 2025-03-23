import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GetScore {
  public static void main(String[] args) {
    GetScore obj = new GetScore();
    String fileName = "score.txt";
    String fileNameNew = "scoreNew.txt";

    String textReaded = obj.readFile(fileName);
    String[][] user = obj.textSplits(textReaded);
    String[][] newUserAndScoreAndGrade = obj.newUserAndScoreAndGrade(user);
    obj.writeFile(fileNameNew, newUserAndScoreAndGrade);

    obj.displayArr2D(newUserAndScoreAndGrade);
    // obj.readFile2(fileName);
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  void displayArr2D(Object[][]... args) {
    for (Object[][] objects : args) {
      for (Object[] objects2 : objects) {
        for (Object objects3 : objects2) {
          System.out.print(objects3.toString() + " ");
        }
        System.out.println();
      }
    }
  }

  String[][] newUserAndScoreAndGrade(String user[][]) {
    String[][] newUserAndScoreAndGrade = new String[user.length][user[0].length + 2];
    for (int i = 0; i < user.length; i++) {
      for (int j = 0; j < user[i].length; j++) {
        newUserAndScoreAndGrade[i][j] = user[i][j];
        newUserAndScoreAndGrade[i][user[i].length] = String
            .valueOf(Integer.parseInt(user[i][3]) + Integer.parseInt(user[i][4]));
        newUserAndScoreAndGrade[i][user[i].length + 1] = calGrade(Integer.parseInt(newUserAndScoreAndGrade[i][5]));
      }
    }
    return newUserAndScoreAndGrade;
  }

  String readFile(String fileName) {
    String textReaded = "";
    try {
      Scanner read = new Scanner(new FileReader(fileName));
      read.nextLine();
      while (read.hasNextLine()) {
        textReaded += read.nextLine() + "\n";
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textReaded;
  }

  String[][] textSplits(String text) {
    String[] textSplitBankSlashN = text.split("\n");
    String[][] textParts = new String[textSplitBankSlashN.length][];
    for (int i = 0; i < textSplitBankSlashN.length; i++) {
      textParts[i] = textSplitBankSlashN[i].split("[\\s]+");
    }
    return textParts;
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

  void writeFile(String fileNameNew, String[][] newUserAndScoreAndGrade) {
    try {
      FileWriter fileWriter = new FileWriter(fileNameNew);
      // for (String[] lines : newUserAndScoreAndGrade) {
      // for (String word : lines) {
      // fileWriter.write(word + " ");
      // }
      // fileWriter.write("\n");
      // }
      fileWriter.write("ID Name Lastname Midterm Final SumScore Grade\n");
      for (int i = 0; i < newUserAndScoreAndGrade.length; i++) {
        for (int j = 0; j < newUserAndScoreAndGrade[i].length; j++) {
          fileWriter.write(newUserAndScoreAndGrade[i][j]);
          if (j < newUserAndScoreAndGrade[i].length - 1) {
            fileWriter.write(" ");
          }
        }
        if (i < newUserAndScoreAndGrade.length - 1) {
          fileWriter.write("\n");
        }
      }
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  void readFile2(String fileName) {
    String textReaded = "";
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      String x;
      while ((x = bufferedReader.readLine()) != null) {
        textReaded += x + "\n";
      }
      System.out.println(textReaded);
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
