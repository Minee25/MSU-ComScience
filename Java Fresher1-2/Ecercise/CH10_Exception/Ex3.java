import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Ex3 obj = new Ex3();
    int num1 = obj.input("Num1: ");
    int num2 = obj.input2("Num2: ");
    double divide = obj.divide(num1, num2);
    obj.display(divide);
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  int input(String prompt) {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Please number only!");
        System.out.println(e);
        input.next();
      }
    }
  }

  int input2(String prompt) {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print(prompt);
        int input2 = input.nextInt();
        if (input2 != 0) {
          return input2;
        }
      } catch (InputMismatchException e) {
        System.out.println("Not 0");
        System.out.println(e);
        input.next();
      }
    }
  }

  double divide(int num1, int num2) {
    return (double) num1 / num2;
  }
}
