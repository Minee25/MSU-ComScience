import java.util.Date;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    Date dt = new Date();
    try {
      System.out.print("Input date format : ");
      String fm1 = input.nextLine();
      SimpleDateFormat spdfm = new SimpleDateFormat(fm1);
      System.out.println(spdfm.format(dt));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}