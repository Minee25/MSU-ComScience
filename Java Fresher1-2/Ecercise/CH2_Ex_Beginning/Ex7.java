import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    /*
     * 7. พ่อค้าผลไม้แห่งหนึ่งต้องการซื้อผลไม้มาขายที่ร้าน ปกติแล้ว
     * เขาจะซื้อลำไย (Longan) 85% ของมะม่วงทั้งหมด และซื้อมะม่วง
     * (Mango) 27% ของเงาะ (Rambutan) ทั้งหมด จงหาว่าพ่อค้าจะต้องซื้อ
     * ผลไม้ทั้ง 3 ชนิดมาขายรวมกันกี่กิโลกรัม ถ้าพ่อค้าต้องการซื้อมะม่วง
     * เป็นจำนวนหนึ่ง
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Mango: ");
    int mango = input.nextInt();

    double longan = (double) mango * 85 / 100;
    double rambutan = (double)mango / 27 * 100;
    double sum = mango + longan + rambutan;

    System.out.println("Rambutan: " + rambutan);
    System.out.println("Mango: " + mango);
    System.out.println("Longan: " + longan);
    System.out.println("Sum: " + sum);

    input.close();
  }
}
