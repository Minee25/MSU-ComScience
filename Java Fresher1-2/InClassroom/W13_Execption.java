public class W13_Execption {
  public static void main(String[] args) {
    int x, z;
    int y;
    x = 5;
    y = 0;
    try {
      z = x / y;
      System.out.println(z);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
