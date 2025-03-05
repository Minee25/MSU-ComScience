import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    int scoreMid = obj.input("Score Mid: ");
    int scoreFinal = obj.input("Score Final: ");
    int sumScore = obj.sum(scoreMid, scoreFinal);
    char grade = obj.grade(sumScore);
    obj.display("Score: ", sumScore, " Grade: ", grade);
  }

  void display(Object... data) {
    StringBuilder output = new StringBuilder();
    for (Object objects : data) {
      output.append(objects);
    }
    System.out.println(output.toString());
  }

  int input(String prompt) {
    while (true) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Please number only");
        System.out.println(e);
      }
    }
  }

  int sum(int mid, int fin) {
    return mid + fin;
  }

  char grade(int score) {
    if (score >= 70) {
      return 'S';
    } else {
      return 'U';
    }
  }
}
