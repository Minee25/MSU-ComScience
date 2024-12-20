public class Ex9 {
  public static void main(String[] args) {
    /*
     * 9. จงเขียนโปรแกรมสุ่มค่าข้อมูลที่อยู่ระหว่าง 1-6 จำนวน 3 ครั้ง แล้วตรวจสอบ
     * - ถ้าผลรวมของการสุ่มทั้ง 3 มีค่าไม่เกิน 10 ให้แสดงข้อความว่า "LOW"
     * - ถ้าผลรวมของการสุ่มทั้ง 3 มีค่าเท่ากับ 11 ให้แสดงข้อความว่า "MIDDLE"
     * - ถ้าผลรวมของการสุ่มทั้ง 3 มีค่าเท่ากับ 12 ขึ้นไปให้แสดงข้อความว่า "HIGH"
     */

    int sum = 0;
    for (int i = 0; i < 3; i++) {
      int random = (int) (Math.random() * 5) + 1;
      System.out.print(random + " + ");
      sum += random;
    }

    System.out.println("\b\b= " + sum);
    if (sum < 10) {
      System.out.println("Low");
    } else if (sum == 11) {
      System.out.println("MIDDLE");
    } else  {
      System.out.println("HIGH");
    }
  }
}
