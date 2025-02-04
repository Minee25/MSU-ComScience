import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("M: ");
    int m = input.nextInt();

    System.out.print("M: ");
    int n = input.nextInt();

    System.out.print("P: ");
    int p = input.nextInt();

    int MxN[][] = new int[m][n];
    int NxP[][] = new int[n][p];
    int MxP[][] = new int[m][p];

    // Insert data
    for (int i = 0; i < MxN.length; i++) {
      for (int j = 0; j < MxN[i].length; j++) {
        MxN[i][j] = (int) (Math.random() * 5) - 2;
      }
    }

    for (int i = 0; i < NxP.length; i++) {
      for (int j = 0; j < NxP[i].length; j++) {
        NxP[i][j] = (int) (Math.random() * 5) - 2;
      }
    }

    // Process
    System.out.println("A" + "[" + m + "x" + n + "]");
    for (int i = 0; i < MxN.length; i++) {
      for (int j = 0; j < MxN[i].length; j++) {
        System.out.print(MxN[i][j] + "\t");
      }
      System.out.println();
    }

    // B
    System.out.println();
    System.out.println("B" + "[" + n + "x" + p + "]");
    for (int i = 0; i < NxP.length; i++) {
      for (int j = 0; j < NxP[i].length; j++) {
        System.out.print(NxP[i][j] + "\t");
      }
      System.out.println();
    }
    
    // AxB
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < p; j++) {
        for (int l = 0; l < n; l++) {
          MxP[i][j] += MxN[i][l] * NxP[l][j];
        }
      }
    }

    // C
    System.out.println();
    System.out.println("C" + "[" + m + "x" + p + "]");
    for (int i = 0; i < MxP.length; i++) {
      for (int j = 0; j < MxP[i].length; j++) {
        System.out.print(MxP[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
