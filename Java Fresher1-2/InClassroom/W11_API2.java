public class W11_API2 {
  public static void main(String[] args) {
    Integer in = 10;
    String x = in.toString();
    System.out.println(x);

    System.out.println("-----");
    int a = 10;
    int b = 50;
    int compare = Integer.compare(a, b);
    if (compare == 1) {
      System.out.println("A > B");
    } else if (compare == -1) {
      System.out.println("B > A");
    } else {
      System.out.println("A equals B");
    }
  }
}
