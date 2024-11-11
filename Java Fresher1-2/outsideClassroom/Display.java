class Display {
  public static void main(String[] args) {
    byte num1 = 127;
    byte num2 = 127;
    byte carry = 0;

    // แปลงตัวเลขเป็นสตริงเพื่อแยกหลัก
    String num1String = Integer.toString(num1);
    String num2String = Integer.toString(num2);

    // ดึงแต่ละหลักจาก num1
    byte plusnum1_1 = (byte) Integer.parseInt(String.valueOf(num1String.charAt(0)));  // หลักร้อย
    byte plusnum1_2 = (byte) Integer.parseInt(String.valueOf(num1String.charAt(1)));  // หลักสิบ
    byte plusnum1_3 = (byte) Integer.parseInt(String.valueOf(num1String.charAt(2)));  // หลักหน่วย

    // ดึงแต่ละหลักจาก num2
    byte plusnum2_1 = (byte) Integer.parseInt(String.valueOf(num2String.charAt(0)));  // หลักร้อย
    byte plusnum2_2 = (byte) Integer.parseInt(String.valueOf(num2String.charAt(1)));  // หลักสิบ
    byte plusnum2_3 = (byte) Integer.parseInt(String.valueOf(num2String.charAt(2)));  // หลักหน่วย

    // คำนวณผลบวกหลักหน่วย
    byte first;
    if (plusnum1_3 + plusnum2_3 >= 10) {
      first = (byte) (plusnum1_3 + plusnum2_3 - 10);
      carry = 1;
    } else {
      first = (byte) (plusnum1_3 + plusnum2_3);
      carry = 0;
    }

    // คำนวณผลบวกหลักสิบ รวมค่า carry จากหลักหน่วย
    byte middle;
    if (plusnum1_2 + plusnum2_2 + carry >= 10) {
      middle = (byte) (plusnum1_2 + plusnum2_2 + carry - 10);
      carry = 1;
    } else {
      middle = (byte) (plusnum1_2 + plusnum2_2 + carry);
      carry = 0;
    }

    // คำนวณผลบวกหลักร้อย รวมค่า carry จากหลักสิบ
    byte end = (byte) (plusnum1_1 + plusnum2_1 + carry);

    // แสดงผลลัพธ์
    System.out.println("" + end + middle + first);  // จะได้ผลลัพธ์ 254
  }
}
