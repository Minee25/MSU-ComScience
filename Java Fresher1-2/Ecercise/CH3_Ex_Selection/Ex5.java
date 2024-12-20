import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    /*
     * จงเขียนโปรแกรมคำนวณค่าน้ำของหอพักแห่งหนึ่ง
     * เมื่อกำหนดให้รับหมายเลขห้องและจำนวนหน่วยน้ำที่ใช้ โดยมีวิธีคำนวณค่าน้ำดังนี้:
     * 
     * - ถ้าใช้น้ำไม่เกิน 10 หน่วย คิดค่าน้ำหน่วยละ 5 บาท
     * - ถ้าใช้น้ำ 11-20 หน่วย คิดค่าน้ำ 10 หน่วยแรกหน่วยละ 8 บาท ที่เหลือคิดหน่วยละ
     * 15 บาท
     * - ถ้าใช้น้ำเกิน 20 หน่วย คิดค่าน้ำ 10 หน่วยแรกหน่วยละ 10 บาท 10
     * หน่วยถัดมาคิดหน่วยละ 20 บาท และที่เหลือคิดหน่วยละ 50 บาท
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Room: ");
    int room = input.nextInt();
    System.out.print("Unit: ");
    int unit = input.nextInt();

    int cost = 0;

    if (unit < 10) {
      cost = unit * 5;
    } else if (unit >= 11 && unit <= 20) {
      cost = (10 * 8) + ((unit - 10) * 15);
    } else {
      int pap1 = 10 * 10;
      int pap2 = 10 * 20;
      int pap3 = (unit - 20) * 50;
      cost = pap1 + pap2 + pap3;
      // cost = (10 * 10) + (10 * 20) + ((unit - 20) * 50);
    }

    System.out.println("**************");
    System.out.println("Room: " + room);
    System.out.println("Cost: " + cost);

    input.close();
  }
}
