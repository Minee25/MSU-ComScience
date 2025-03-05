import java.util.InputMismatchException;
import java.util.Scanner;

public class W13_Execption2 {
  public static void main(String[] args) {
    W13_Execption2 obj = new W13_Execption2();
    int num1 = obj.input("Num (1): ");
    int num2 = obj.input("Num (2): ");
    int result = num1 + num2;
    System.out.println(result);
  }

  int input(String x) {
    while (true) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.print(x);
        return input.nextInt();
      } catch (InputMismatchException err) {
        System.out.println(err);
        System.out.println("Input Numeric only!");
      }  
    }
  }
}
