import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    /*
     * 5. ร้านค้าแห่งหนึ่งจัดโปรโมชั่นประจำปี โดยมีส่วนลดให้ลูกค้า 30% ของราคาสินค้า
     * จงเขียนโปรแกรมคำนวณหาจำนวนเงินส่วนลด (Sale) และจำนวนเงินที่จ่ายจริง
     * (คิดส่วนลดแล้ว) (Pay) เมื่อมีการซื้อสินค้าเป็นเงินจำนวนหนึ่ง (Price)
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Price: ");
    int price = input.nextInt();

    double sale = (double)price * 30 / 100;
    double pay = (double)price - sale;

    System.out.println("Sale: " + sale);
    System.out.println("Pay: " + pay);

    input.close();
  }
}
