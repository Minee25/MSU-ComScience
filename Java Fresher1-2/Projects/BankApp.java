import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BankApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BankApp obj = new BankApp();
    int money = 1000;
    int bank = 5000;

    obj.welcome();
    System.out.println();
    obj.bankCmd();

    while (true) {
      if (!obj.checkCmd(obj.input(">>: "), money, bank)) {
        break;
      }
    }
  }

  void welcome() {
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
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    String userInput = input.nextLine().trim().toLowerCase();
    return userInput;
  }

  void bankCmd() {
    System.out.println("\u001B[33m]--[Command]--[\u001B[0m");
    System.out.println("\u001B[32mcmd (0)\u001B[0m: ดูคำสั่งทั้งหมด");
    System.out.println("\u001B[32mwithdraw (1)\u001B[0m: ถอนเงิน");
    System.out.println("\u001B[32mdeposit (2)\u001B[0m: ฝากเงิน");
    System.out.println("\u001B[32mcheckBank (3)\u001B[0m: เช็คยอดเงินในธนาคาร");
    System.out.println("\u001B[32mcheckMoney (4)\u001B[0m: เช็คยอดเงินในกระเป๋า");
    System.out.println("\u001B[32mcheckAll (5)\u001B[0m: เช็คยอดเงินทั้งหมด");
    System.out.println("\u001B[32mexit (6)\u001B[0m: ออกจากธนาคาร");
  }

  boolean checkCmd(String userInput, int money, int bank) {
    if (userInput.isEmpty() || userInput.equals("")) {
      System.out.println("กรุณาพิมพ์ด้วย");
    } else if (userInput.equals("cmd") || userInput.equals("0")) {
      bankCmd();
    } else if (userInput.equals("checkall") || userInput.equals("5")) {
      checkMoney(money, bank);
    } else if (userInput.equals("exit") || userInput.equals("6")) {
      System.out.println("ออกจากธนาคาร...");
      return false;
    } else {
      System.out.println("ไม่พบคำสั่ง กรุณาลองอีกครั้ง!");
    }
    return true;
  }

  void checkMoney(int money, int bank) {
    System.out.println("Check All");
    System.out.println("Money: " + money);
    System.out.println("Bank: " + bank);
  }

  void withdraw(int money, int bank) {
    Scanner input = new Scanner(System.in);
    System.out.println("Withdraw (b to back)");
    System.out.print("Amount: ");
    String withdraw = input.nextLine().trim().toLowerCase();
    for (int i = 0; i < withdraw.length(); i++) {
      if (!Character.isDigit(withdraw.charAt(i))) {
        System.out.println("Not CMD");
        break;
      }
    }  
  }
}
