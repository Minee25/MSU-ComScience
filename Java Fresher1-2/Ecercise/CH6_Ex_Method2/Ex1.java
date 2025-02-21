import java.util.Scanner;
public static void main(String[] args) {
  Ex1 obj = new Ex1();
  
  double sum = obj.pLong(50000, 20, 2.37);
  obj.input(sum);
}

double pLong(double p, int y, double r) {
  if (y <= 0) {
      return p;
  } else {
      return (1 + r / 100) * pLong(p, y - 1, r);
  }
}

void input(double n) {
  System.out.println(n);
}
public class Ex1 {
  public static void main(String[] args) {
    Ex1 obj = new Ex1();
    double sum = obj.pLong(50000, 10, 2.37);
    obj.input(sum);
  }

  double pLong(double p, int y, double r) {
    if (y <= 0) {
      return p;
    } else {
      return (1 + r / 100) * pLong(p, y - 1, r);
    }
  }

  void input(double n) {
    System.out.println(n);
  }
}
