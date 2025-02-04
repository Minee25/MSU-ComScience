import java.util.Scanner;

public class Ex2_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("N: ");
    int n = input.nextInt();

    char letter[] = new char[n];
    
    for (int i = 0; i < n; i++) {
      char random = (char) ((Math.random() * 26) + 65);

      boolean check = true;
      for (int j = 0; j < letter.length; j++) {
        if (random == letter[j]) {
          check = false; 
          i--;
          break;
        }
      }

      if (check == true) {
        letter[i] = random;
      }
    }
 
    for (int i = 0; i < letter.length; i++) { 
      for (int j = i; j < letter.length; j++) {  
        System.out.print(letter[j] + "\t");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("-\t");
      }
      System.out.println();
    } 
  }
}
 