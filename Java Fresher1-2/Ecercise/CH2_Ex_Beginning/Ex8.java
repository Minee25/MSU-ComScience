import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    /*
     * 8. จงเขียนโปรแกรมหาพื้นที่ส่วนที่แรเงา (Gray) เมื่อกำหนดให้
     * รับค่าเส้นผ่าศูนย์กลาง (x) เข้ามาทางแป้นพิมพ์
     */
    Scanner input = new Scanner(System.in);

    System.out.print("X: ");
    double diameter = input.nextDouble();

    double radius = diameter / 2;

    // คำนวณพื้นที่วงกลม
    double circleArea = 3.14 * (radius * radius);

    // สมมติพื้นที่สีขาวเป็นค่าคงที่
    double whiteArea = 9.375;

    // คำนวณพื้นที่สีเทา
    double grayArea = circleArea - whiteArea;

    // แสดงผลลัพธ์
    System.out.println("Circle area: " + circleArea);
    System.out.println("White area: " + whiteArea);
    System.out.println("Gray area: " + grayArea);

    input.close();
  }
}
