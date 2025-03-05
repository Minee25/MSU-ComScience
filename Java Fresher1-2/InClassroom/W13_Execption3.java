public class W13_Execption3 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 0;
    try {
      int result = num1 / num2;
      System.out.println(result);
    }catch (ArithmeticException err) {
      System.out.println("No / by 0");
      System.out.println(err);
    }  catch (IndexOutOfBoundsException err) {
      System.out.println("Index not found");
      System.out.println(err);
    } catch (Exception err) {
      System.out.println("ERR");
      System.out.println(err);
      System.exit(0);
    } finally {
      System.out.println("Finally");
    }
  }
}
