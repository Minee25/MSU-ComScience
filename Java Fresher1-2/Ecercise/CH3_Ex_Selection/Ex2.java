import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    /*
     * 2. จงเขียนโปรแกรมคำนวณเงินทอนเมื่อราคาสินค้า (price)
     * ไม่เกินจำนวนเงินที่จ่าย (pay)
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Price: ");
    int price = input.nextInt();
    System.out.print("Pay: ");
    int pay = input.nextInt();

    int change = pay - price;
    
    System.out.println("Change: " + change);

    input.close();
  }
}
