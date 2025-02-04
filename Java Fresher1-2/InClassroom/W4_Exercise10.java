import java.util.Scanner;

public class W4_Exercise10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Object month[][] = {
        { "Sunday", 3, 10, 17, 24 },
        { "Monday", 4, 11, 18, 25 },
        { "Tuesday", 5, 13, 20, 27 },
        { "Wednesday", 7, 14, 21, 28 },
        { "Friday", 1, 8, 15, 22, 29 },
        { "Saturday", 2, 9, 16, 23, 30 }
    };

    System.out.print("Day: ");
    int day = input.nextInt();

    for (int i = 0; i < month.length; i++) {
      for (int j = 1; j < month[i].length; j++) {
        if (day == (int) month[i][j]) {
          System.out.println(month[i][0]);
        }
      }
    }
  }
}
