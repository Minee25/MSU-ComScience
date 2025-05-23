import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("N: ");
    int n = input.nextInt();

    int data[][] = new int[n][n];
    double avg[][] = new double[n][n];
    int sum[] = new int[n];

    // Insert data
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        data[i][j] = (int) (Math.random() * 10) + 1;
        sum[i] += data[i][j];
      }
    } 
    
    // avg
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++) {
        if (i == j) {
          avg[i][j] = (double) sum[i] / n;
        } else {
          avg[i][j] = 0;
        }
      }
    }
  
    // Output
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.print(data[i][j] + "\t");
      }
      System.out.println();
    }

    System.out.println("Data Avg");
    for (int i = 0; i < data.length; i++) { 
      for (int j = 0; j < data[i].length; j++) { 
        if (i == j) {
          System.out.print(avg[i][j] + "\t");
        } else {
          System.out.print(0 + "\t");
        }
      }
      System.out.println();
    }
  }
}
