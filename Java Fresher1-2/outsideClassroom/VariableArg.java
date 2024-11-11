public class VariableArg {
  public static void main(String[] args) {
    sum(14);
  }
 
  public static void sum(int... num) {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    System.out.println("The SUM: " + sum);
  }
}
