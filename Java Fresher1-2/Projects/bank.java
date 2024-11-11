import java.util.Scanner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class bank {
  public static void main(String[] args) {
    int money = 1000;
    int bank = 5000;
    Scanner input = new Scanner(System.in);
    LocalDate dateNow = LocalDate.now();
    LocalTime timeNow = LocalTime.now();

    // Correct DateTimeFormatter pattern
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    String formattedDate = dateNow.format(dateFormatter);
    String formattedTime = timeNow.format(timeFormatter);

    System.out.println("\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\u001B[32m>>----------]ยินดีต้อนรับสู่ธนาคาร 💸💸[----------<<\u001B[0m");
    System.out.println("          เวลา " + formattedDate + " " + formattedTime + " น.");
    System.out.println();
    System.out.println("\u001B[33m]--[Command]--[\u001B[0m");
    System.out.println("\u001B[32mcmd (0)\u001B[0m: ดูคำสั่งทั้งหมด");
    System.out.println("\u001B[32mwithdraw (1)\u001B[0m: ถอนเงิน");
    System.out.println("\u001B[32mdeposit (2)\u001B[0m: ฝากเงิน");
    System.out.println("\u001B[32mcheckBank (3)\u001B[0m: เช็คยอดเงินในธนาคาร");
    System.out.println("\u001B[32mcheckMoney (4)\u001B[0m: เช็คยอดเงินตัวเอง");
    System.out.println("\u001B[32mcheckAll (5)\u001B[0m: เช็คยอดเงินทั้งหมด");

    while (true) {
      System.out.print(">> ");
      String userInput = input.nextLine(); 
      userInput.trim();
      userInput.toLowerCase(); 

      if (userInput.isEmpty() || userInput == "check") {
        System.out.println("กรุณาพิมพ์ด้วย"); 
      }
      else if (userInput.equals("checkall") || userInput.equals("5")) {
        System.out.println("Check All");
        System.out.println("Bank: " + bank);
        System.out.println("Money: " + money);
      }
    }
  }
}
