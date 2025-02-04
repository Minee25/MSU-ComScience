import java.util.Scanner;

public class Ex1_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; ) {
      int random = (int) (Math.random() * 10) + 1;

      boolean isUnique = true;
      for (int j = 0; j < i; j++) {
        if (random == arr[j]) {
          isUnique = false;
          break;
        }
      }

      if (isUnique == true) {
        arr[i] = random;
        i++;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + "\t");
    }
  }
}