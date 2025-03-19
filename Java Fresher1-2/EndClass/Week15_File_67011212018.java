import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Week15_File_67011212018 {
  public static void main(String[] args) {
    Week15_File_67011212018 obj = new Week15_File_67011212018();
    String file = "std.xls";
    try {
      FileWriter fw = new FileWriter(file);
      FileInputStream fistm = new FileInputStream(file);
      fw.write("Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade\n");
      while (true) {
        String Code = obj.Input("Code: ");
        if (Code.charAt(0) == '0') {
          fw.close();
          obj.readFile(fistm);
          System.out.println("Exit...");
          break;
        }

        String Fname = obj.Input("Fname: ");
        String Lname = obj.Input("Lname: ");
        int Midterm = obj.check("Midterm: ");
        int Final = obj.check("Final: ");

        int Sum = Midterm + Final;
        char Grade = obj.checkGrade(Sum);

        fw.write(Code + "\t" + Fname + "\t" + Lname + "\t" + Midterm + "\t" + Final + "\t" + Sum + "\t" + Grade + "\n");
      }
    } catch (FileNotFoundException err) {
      System.out.println(err.getMessage());
    } catch (IOException err) {
      System.out.println(err.getMessage());
    }
  }

  char checkGrade(int Sum) {
    char grade = ' ';
    if (Sum > 80) {
      grade = 'A';
    } else if (Sum >= 70 && Sum <= 79) {
      grade = 'B';
    } else if (Sum >= 60 && Sum <= 69) {
      grade = 'C';
    } else if (Sum >= 50 && Sum <= 59) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    return grade;
  }

  String Input(String ui) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print(ui);
      String x = sc.nextLine().trim();
      if (!x.equals("")) {
        return x;
      }
    }
  }

  int check(String ui) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(ui);
        return sc.nextInt();
      } catch (InputMismatchException e) {
        System.out.println(e);
        System.out.println("Try again! Number only");
        sc.next();
      }
    }
  }

  void readFile(FileInputStream fistm) {
    try {
      while (true) {
        int read = fistm.read();
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
