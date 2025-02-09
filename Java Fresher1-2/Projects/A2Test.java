import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A2Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num[] = new int[100];
    for (int n = 0;;n++) {
      System.out.print(">> ");
      int pap = input.nextInt();
      if (pap == 0) {
        break;
      }
      num[n] = pap;
    }
    
    int index = 0;
    for (int i = 0; i < num.length; i++) {
      if (num[i] == 0) {
        break;
      } else {
        index ++;
      }
    }

    int num2[] = new int[index];
    for (int i = 0; i < num2.length; i++) {
      num2[i] = num[i];
    }

    for (int i = 0; i < num2.length; i++) {
      System.out.print(num2[i] + ", ");
    }
  }
}