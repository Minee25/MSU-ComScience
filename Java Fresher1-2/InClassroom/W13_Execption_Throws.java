public class W13_Execption_Throws {
  public static void main(String[] args) throws ArithmeticException {
    
    try {
      int a;
      int x[] = new int[5];
  
      x[5] = 70;
      a = 5 / 0;
      
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
