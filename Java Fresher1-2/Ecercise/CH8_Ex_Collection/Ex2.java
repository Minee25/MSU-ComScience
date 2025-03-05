import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    ArrayList<String> arls = new ArrayList<String>();
    new Ex2().run(arls);
  }

  private void run(ArrayList<String> data) {
    while (true) {

    }
  }

  private void showMenu() {
    System.out.println("[F] Add First");
    System.out.println("[L] Add Last");
    System.out.println("[B] Add Before");
    System.out.println("[A] Add After");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search data");
    System.out.println("[X] Exit...");
  }

  private String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  private void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }
}
