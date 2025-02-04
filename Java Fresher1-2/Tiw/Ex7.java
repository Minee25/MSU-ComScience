import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("M: ");
    int m = input.nextInt();

    System.out.print("N: ");
    int n = input.nextInt();

    int a[][] = new int[m][n];
    int at[][] = new int[n][m];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = (int) (Math.random() * 10) + 1;
      }
    }

    for (int i = 0; i < at.length; i++) {
      for (int j = 0; j < at[i].length; j++) {
        at[i][j] = a[j][i];
      }
    }

    // Output

    System.out.println("A:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.println();
    } 

    System.out.println("AT:");
    for (int i = 0; i < at.length; i++) {
      for (int j = 0; j < at[i].length; j++) {
        System.out.print(at[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
