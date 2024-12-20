import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    /*
     * 2. จงเขียนโปรแกรมรับค่าข้อมูลตัวเลข 2 จํานวนแล้วคํานวณ
     * และแสดงผลดังตัวอย่างผลลัพธ์
     */
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input Num1: ");
    int num1 = input.nextInt();
    System.out.print("Input Num2: ");
    int num2 = input.nextInt();

    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    System.out.println(num1 + " / " + num2 + " = " + (float) (num1 / num2));
    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

    input.close();
  }
}
