import java.util.Scanner;

public class test2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("M: ");
    int m = input.nextInt();

    System.out.print("N: ");
    int n = input.nextInt();

    int a[][] = new int[m][n];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = (int) (Math.random() * 10) + 1;
      }
    }

    int row[] = new int[n];
    int cols[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        row[i] += a[i][j];
        cols[j] += a[i][j];
      }
    }

    // Output

    System.out.println("A:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + "\t");
      }
      System.out.print("-> " + row[i]);
      System.out.println();
    }
    for (int i = 0; i < cols.length; i++) {
      System.out.print("|\t");
    }
    System.out.println();
    for (int i = 0; i < cols.length; i++) {
      System.out.print(cols[i] + "\t");
    }
  }
}
