public class Method1 {
  public static void main(String[] args) {
    mPrint("ASF");

    Method1 mobject = new Method1();
    mobject.mPrint2("asfs");
  }

  static void mPrint(String x) {
    System.out.println(x);
  }

  void mPrint2(String x) {
    System.out.println(x);
  }
}
