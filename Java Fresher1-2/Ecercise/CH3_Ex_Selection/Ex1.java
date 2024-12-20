import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /*
     * 1. จงเขียนโปรแกรมรับค่าจำนวนเต็ม แล้วตรวจสอบว่าถ้า
     * เป็นจำนวนที่หารด้วย 9 ลงตัว ให้แสดงข้อมูลนั้นแล้วตามด้วยข้อความ
     * “Division by Nine Perfectly” ดังตัวอย่างผลลัพธ์
     */

    System.out.print("Number: ");
    int number = input.nextInt();

    if (number % 9 == 0) {
      System.out.println("DIvistion by Nine Perfectly");
    }

    input.close();
  }
}
