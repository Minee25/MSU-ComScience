import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    /*
      พ่อได้รับเงินเดือน (Income) จำนวนหนึ่ง
      แบ่งให้แม่(Mother) ร้อยละ 45
      ให้ลูก(Child) ร้อยละ 15
      ที่เหลือเก็บไว้ใช้จ่าย
      จงเขียนโปรแกรมคำนวณหาว่า แม่ ลูก และพ่อ (เหลือเงินไว้ใช้จ่าย) คนละกี่บาท
     */

    Scanner input = new Scanner(System.in);

    // Input
    System.out.print("Income: ");
    int income = input.nextInt();

    // Process
    double mother = (double)income * 45 / 100;
    double chlid = (double)income * 15 / 100;
    double father = (double)income - mother - chlid;

    // Output
    System.out.println("Income: " + income);
    System.out.println("Mother: " + mother);
    System.out.println("Chlid: " + chlid);
    System.out.println("Father: " + father);

    input.close();
  }
}
