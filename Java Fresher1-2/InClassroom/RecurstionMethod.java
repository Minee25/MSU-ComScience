public class RecurstionMethod {
  public static void main(String[] args) {
    RecurstionMethod obj = new RecurstionMethod();
    int fact = obj.Fact(5);
    System.out.println(fact);
  }

  int Fact(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * Fact(n - 1);
    }
  }
}
