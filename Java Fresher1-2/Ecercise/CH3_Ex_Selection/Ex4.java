import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    /*
     * จงเขียนโปรแกรมรับค่าข้อมูลแล้วทำงานตามเงื่อนไขต่อไปนี้:
     * 
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำว่า “excellent” ให้แสดงข้อความ “Grade A”
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำว่า “good” ให้แสดงข้อความ “Grade B”
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำว่า “fair” ให้แสดงข้อความ “Grade C”
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำว่า “pass” ให้แสดงข้อความ “Grade D”
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำว่า “fail” ให้แสดงข้อความ “Grade F”
     * - ถ้าข้อมูลที่ป้อนเข้ามาเป็นคำอื่นๆ ให้แสดงข้อความ “Have not Grade”
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Input: ");
    String userInput = input.nextLine();

    if (userInput.equals("excellent")) {
      System.out.println("Grade A");
    } else if (userInput.equals("good")) {
      System.out.println("Grade B");
    } else if (userInput.equals("fair")) {
      System.out.println("Grade C");
    } else if (userInput.equals("pass")) {
      System.out.println("Grade D");
    } else if (userInput.equals("fail")) {
      System.out.println("Grade F");
    } else {
      System.out.println("Have not Grade");
    }
    
    input.close();
  }
}
