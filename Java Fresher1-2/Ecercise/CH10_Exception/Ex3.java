import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Ex3 obj = new Ex3();
    int num1 = obj.input("Num1: ");
  }

  int input(String prompt) {
    while (true) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
