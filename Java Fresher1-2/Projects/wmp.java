import java.util.Scanner;

public class wmp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // แป้นพิมพ์ภาษาอังกฤษและไทย จากแถวบนลงมาล่าง เรียงจากซ้ายไปขวาบนคีย์บอร์ด
    // และการกด Shift (บนลงล่าง ซ้ายไปขวาเหมือนกัน)
    String engLang = " 1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?ๅ/_ภถุึคตจขชๆไำพะัีรนยบลฃฟหกดเ้่าสวงผปแอิืทมใฝ+๑๒๓๔ู฿๕๖๗๘๙๐\"ฎฑธํ๊ณฯญฐ,ฅฤฆฏโฌ็๋ษศซ.()ฉฮฺ์?ฒฬฦ";
    String thaiLang = " ๅ/_ภถุึคตจขชๆไำพะัีรนยบลฃฟหกดเ้่าสวงผปแอิืทมใฝ+๑๒๓๔ู฿๕๖๗๘๙๐\"ฎฑธํ๊ณฯญฐ,ฅฤฆฏโฌ็๋ษศซ.()ฉฮฺ์?ฒฬฦ1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?";

    // Input
    System.out.println("\n\n\n\u001B[33mลืมเปลี่ยนภาษาหรอ ไม่ต้องห่วง!\u001B[0m");
    System.out.println("\u001B[32mเลือกเมนู\u001B[0m");
    System.out.println("\u001B[32m1. อังกฤษเป็นไทย\n2. ไทยเป็นอังกฤษ\u001B[0m");
    System.out.print(">> ");
    int option = input.nextInt();
    input.nextLine();

    System.out.print("\u001B[36mพิมพ์ข้อความ: \u001B[0m");
    String userInput = input.nextLine();
    int[] choice = new int[userInput.length()];

    // Process
    if (option == 1) {
      // Process หาว่าอยู่ตำแหน่งไหน ของ ภาษาอังกฤษ
      // ;yoouh Cyoi^hl7d;jk m6dvpjk'f^l[kpq c]t w,jiu[ihvog]p
      for (int i = 0; i < userInput.length(); i++) {
        for (int j = 0; j < engLang.length(); j++) {
          if (userInput.charAt(i) == engLang.charAt(j)) {
            choice[i] = j;
            break;
          } else if (userInput.charAt(i) == ' ') {
            choice[i] = 0;
            break;
          }
        }
      }

      // Output ปริ้นตำแหน่งของภาษาไทยออกมา
      System.out.print("\u001B[36mผลลัพธ์: \u001B[0m");
      for (int i = 0; i < userInput.length(); i++) {
        System.out.print(thaiLang.charAt(choice[i]));
      }
    } else if (option == 2) {
      // Process หาว่าอยู่ตำแหน่งไหน ของ ภาษาอังกฤษ
      // ธนกฟัม ณ ดำำส สราำ ำอำพัะ้รืเ รห พำสฟปำก ฟืก ีื้ีพพรำกใ
      for (int i = 0; i < userInput.length(); i++) {
        for (int j = 0; j < thaiLang.length(); j++) {
          if (userInput.charAt(i) == thaiLang.charAt(j)) {
            choice[i] = j;
            break;
          } else if (userInput.charAt(i) == ' ') {
            choice[i] = 0;
            break;
          }
        }
      }

      // Output ปริ้นตำแหน่งของภาษาอังกฤษออกมา
      System.out.print("\u001B[36mผลลัพธ์: \u001B[0m");
      for (int i = 0; i < userInput.length(); i++) {
        System.out.print(engLang.charAt(choice[i]));
      }
    } else {
      System.out.print("ไม่มีตัวเลือก!");
    }
  }
}
