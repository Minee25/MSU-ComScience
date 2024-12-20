import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    /*
     * 6. ร้านค้าแห่งหนึ่งจัดโปรโมชั่นประจำปี โดยมีส่วนลดให้ลูกค้า 30% ของราคาสินค้า
     * จงเขียนโปรแกรมคำนวณหาจำนวนเงินส่วนลด (Sale) และจำนวนเงินที่จ่ายจริง
     * (คิดส่วนลดแล้ว) (Pay) เมื่อมีการซื้อสินค้าเป็นเงินจำนวนหนึ่ง (Price)s
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Rice (Kg): ");
    int rice = input.nextInt();

    double bag = rice / 12;
    double remaining = rice % 12;

    System.out.println("Packaging: " + bag + " bag.");
    System.out.println("Remaining: " + remaining + " Kg.");

    input.close();
  }
}
