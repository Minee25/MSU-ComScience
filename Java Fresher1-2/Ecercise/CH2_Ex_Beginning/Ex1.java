import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    /*
     * 1. จงเขียนโปรแกรมรับข้อมูล ชื่อ (ข้อความ) นามสกุล
     * (ข้อความ) รหัสนิสิต(ตัวเลขจํานวนเต็ม) ปี พ.ศ.เกิด(ตัวเลขจํานวนเต็ม)
     * คํานวณอายุ แล้วแสดงผลดังตัวอย่างผลลัพธ์
     * หมายเหตุ จากผลลัพธ์ผู้ใช้โปรแกรมป้อนเมื่อปี พ.ศ. 2555
    */

    Scanner input = new Scanner(System.in);

    System.out.print("Input Frist Name: ");
    String fname = input.nextLine();
    System.out.print("Input Last Name: ");
    String lname = input.nextLine();
    System.out.print("Input ID: ");
    String id = input.nextLine();
    System.out.print("Input Birth: ");
    int birth = input.nextInt();
 
    int age = 2024 - birth;
    System.out.println("Hello My name is " + fname + " " + lname);
    System.out.println("ID " + id);
    System.out.println("I was born " + birth + " I have " + age + " years old.");
    
    input.close();
  }
}
