import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class W15_FileScanner {
  public static void main(String[] args) {
    try {
      String fileName = "W15_f1.txt";
      Scanner sc = new Scanner(new File(fileName));
      while (sc.hasNext()) {
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }catch (InputMismatchException e) {
      System.out.println(e);
    }
  }
}
