import java.util.Scanner;

public class Week9_Method1_67011212030 {
  public static void main(String[] args) {
    Week9_Method1_67011212030 obj = new Week9_Method1_67011212030();
    double x1 = obj.input("X1: ");
    double y1 = obj.input("Y1: ");
    double x2 = obj.input("X2: ");
    double y2 = obj.input("Y2: ");
    double x3 = obj.input("X3: ");
    double y3 = obj.input("Y3: ");

    double sideA = obj.side(x1, x2, y1, y2);
    double sideB = obj.side(x2, x3, y2, y3);
    double sideC = obj.side(x3, x1, y3, y1);

    double s = obj.s(sideA, sideB, sideC);
    double area = obj.area(s, sideA, sideB, sideC);

    obj.display("A:", sideA);
    obj.display("B:", sideB);
    obj.display("C:", sideC);
    obj.display("S: ", s);
    obj.display("Area: ", area);
  }

  double input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    int usrInput = input.nextInt();
    return usrInput;
  }

  double side(double a, double b, double c, double d) {
    double side = (double) Math.sqrt(Math.pow(a - b, 2) + Math.pow(c - d, 2));
    return side;
  }

  double s(double a, double b, double c) {
    double s = (double) (a + b + c) / 2;
    return s;
  }

  double area(double s, double a, double b, double c) {
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    return area;
  }

  void display(String msg, double x) {
    System.out.println(msg + x);
  }
}