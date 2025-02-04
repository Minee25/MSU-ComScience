import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    int mid = InputMid();
    int fin = InputFinal();
    int sum = Sum(mid, fin);
    char grade = Grade(sum);
    Print(sum);
    Print(grade);
  }

  // Display
  static void Print(String x) {
    System.out.println(x);
  }

  static void Print(int x) {
    System.out.println(x);
  }
  static void Print(char x) {
    System.out.println(x);
  }

  // Input
  static int InputMid() {
    Scanner input = new Scanner(System.in);
    System.out.print("Mid: ");
    int mid = input.nextInt();
    return mid;
  }

  // Input Final
  static int InputFinal() {
    Scanner input = new Scanner(System.in);
    System.out.print("Final: ");
    int fin = input.nextInt();
    return fin;
  }

  static int Sum(int mid, int fin) {
    int sum = mid + fin;
    return sum;
  }

  // Calculate Grade
  static char Grade(int score) {
    char grade;
    if (score >= 70) {
      grade = 'S';
    } else {
      grade = 'U';
    }
    return grade;
  }
}
