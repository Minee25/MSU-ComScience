import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    /*
     * จงเขียนโปรแกรมคำนวณหาเงินเดือนใหม่ของพนักงานในบริษัทแห่งหนึ่ง
     * โดยมีเงื่อนไขดังนี้: 
     * - หาก 10% ของเงินเดือน (เก่า) ไม่เกิน 5,000 บาท จะได้รับการขึ้นเงินเดือน
     *  12.5% ของเงินเดือน (เก่า)
     * - หาก 10% ของเงินเดือน (เก่า) มากกว่า 5,000 บาท จะได้รับการขึ้นเงินเดือน 2.5%
     * ของเงินเดือน (เก่า)
     */

    Scanner input = new Scanner(System.in);

    System.out.print("Income: ");
    int income = input.nextInt();

    int tenPercent = income * 10 / 100;
    double newIncome = 0;

    if (tenPercent <= 5000) {
      newIncome = (income * 12.5 / 100) + income;
    } else {
      newIncome = (income * 2.5 / 100) + income;
    }
    
    System.out.println("New Income: " + newIncome);
    
    input.close();
  }
}
