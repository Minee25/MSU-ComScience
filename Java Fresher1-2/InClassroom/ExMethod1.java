import java.util.Scanner;

public class ExMethod1 {
  public static void main(String[] args) {
    ExMethod1 obj = new ExMethod1();
    double height = obj.input("Height: "); 
    double base = obj.input("Base: ");
    double triangle = obj.triangle(height, base);
    obj.display(triangle);
  }

  double input(String msg) {
    Scanner input = new Scanner(System.in);
    System.out.print(msg);
    double x = input.nextInt(); 
    return x;
  }

  double triangle(double height, double base) {
    double result =(double) 1 / 2 * height * base;
    return result;
  }

  void display(int x) {
    System.out.println(x);
  }

  void display(String x) {
    System.out.print(x);
  }

  void display(double x) {
    System.out.println(x);
  }
}
