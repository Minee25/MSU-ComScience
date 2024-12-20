import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    /*
     * 9. ชายคนหนึ่งต้องการทาสีผนัง (รวมทั้งประตูและหน้าต่าง)
     * ห้องนอน โดยช่างคิดราคาค่าแรงในการทาสีตารางเมตรละ 25.25 บาท
     * จงเขียนโปรแกรมรับค่า ความกว้าง ยาว และสูง (เมตร) ของห้อง แล้ว
     * คำนวณว่าชายคนดังกล่าวต้องจ่ายค่าแรงให้ช่างทาสีเป็นเงินกี่บาท
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Width: ");
    double width = input.nextDouble();

    System.out.print("Length: ");
    double length = input.nextDouble();

    System.out.print("Height: ");
    double height = input.nextDouble();

    double area = 2 * (width * height + length * height);
    // (width * height) * 2 + (length * height) * 2;

    double pay = area * 25.25;

    System.out.println("Area: " + area);
    System.out.println("Pay: " + pay + " Bath"); 
    
    input.close();
  }
}
