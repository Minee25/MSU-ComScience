import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("N: ");
    int n = input.nextInt();

    int area[][] = new int[n][n];

    // Process
    for (int i = 0; i < area.length; i++) {
      for (int j = 0; j < area[i].length; j++) {
        if (j == i) {
          area[i][j] = 1;
        } else {
          area[i][j] = 0;
        }
      }
    }

    // Output
    for (int i = 0; i < area.length; i++) {
      for (int j = 0; j < area[i].length; j++) {
        System.out.print(area[i][j] + "\t");
      }
      System.out.println();
    }

    input.close();
  }
}
