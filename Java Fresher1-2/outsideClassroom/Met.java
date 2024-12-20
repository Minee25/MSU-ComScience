import java.util.Scanner;

public class Met {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println();

    int[] num = { 1, 2, 2, 2, 45, 5, 99, 2, 3, 13, 235, 23, 124, 124, 124, 124, 12, 41, 4, 124 };
    String name = "Minee";

    System.out.println(num.length);
    System.out.println(name.length());

    printf("Hi world", 1241);
  }

  // *****************************
  static int mpow(int number, int pow) {
    int sum = 1;
    for (int i = 0; i < pow; i++) {
      sum *= number;
    }
    return sum;
  }

  static void printf(int x) {
    System.out.println(x);
  }

  static void printf(String x, int num) {
    System.out.println(x + " " + num);
  }
}
