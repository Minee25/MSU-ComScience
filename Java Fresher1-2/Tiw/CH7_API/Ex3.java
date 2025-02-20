import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) { 
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(Object ...x) {
    for (Object object : x) {
      System.out.print(object);
    }
  }
}


