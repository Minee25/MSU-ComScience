import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    TryCatch obj = new TryCatch();
    int number = obj.input("Number: ");
    System.out.println(number);
  }

  int input(String prompt) {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException err) {
        System.out.println(err);
      }
    }
  }
}
