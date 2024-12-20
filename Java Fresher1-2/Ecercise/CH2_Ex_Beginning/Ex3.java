import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    /*
     * จงเขียนโปรแกรม (ร้านขายของ) รับค่าต่อไปนี้
     * - ชื่อสินค้า (product)
     * - ราคา/ชิ้น (price)
     * - จำนวนสินค้า (amount)
     * - จำนวนเงินที่ลูกค้าจ่าย (pay)
     * แล้วทำการประมวลผลหาราคารวม (Cost) เงินทอน (Change)
     * และแสดงตามตัวอย่างผลลัพธ์
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Product: ");
    String product = input.nextLine();
    System.out.print("Price: ");
    int price = input.nextInt();
    System.out.print("Amount: ");
    int amount = input.nextInt();
    System.out.print("Pay: ");
    int pay = input.nextInt();

    int cost = price * amount;
    int change = pay - cost;

    System.out.println("Buy " + product + ", Price " + price + " Bath, Amount " + amount);
    System.out.println("Cost: " + cost + " Bath");
    System.out.println("Pay: " + pay + " Bath");
    System.out.println("Change: " + change + " Bath");

  }
}
