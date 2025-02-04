public class Method1 {
  public static void main(String[] args) {
    Method1 obj = new Method1();
    double power = obj.infinitePower(5, 3.1);
    System.out.println(power);
  }

  double infinitePower(double x, double power) {
    int result = 1;
    for (int i = 0; i < power; i++) {
      result *= x;
    }
    return result;
  }
}