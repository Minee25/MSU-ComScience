import java.util.Scanner;

public class W3_Exercise2_1 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = 0.0;
      double var4 = 0.0;
      System.out.print("Income: ");
      double var6 = var1.nextDouble();
      if (var6 * 15.5 / 100.0 > 100000.0) {
         var2 = var6 * 2.5E-5;
         var4 = var6 - var2;
         System.out.println("Vat: " + var2);
         System.out.println("Income: " + var4);
      }

   }
}
