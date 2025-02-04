import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N: ");
    int n = input.nextInt();

    char letter[] = new char[n];
    for (int i = 0; i < n; i++) {
      int random = (int) ((Math.random() * 26) + 'A');
      letter[i] = (char) random;
    }

    // Output
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        System.out.print(letter[j] + "\t"); 
      }
      for (int j2 = 0; j2 < i; j2++) {
        System.out.print("-\t");
      }
      System.out.println();
    }

    input.close();
  }
}
