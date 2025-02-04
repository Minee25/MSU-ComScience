import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("N: ");
    int n = input.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      int random = (int) (Math.random() * n) + 1;

      for (int j = 0; j < n; j++) { 
        if (random == arr[i]) {
          i -= 1;
          break;
        }
      }

      arr[i] = random;
    }

    // Output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + "\t");
    }

    input.close();
  }
}
