package เรียนนอกห้อง;
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("กรอกชื่อของคุณ: ");
    String name = input.nextLine();
  
    System.out.println(name != null && !name.isEmpty() ? "ชื่อของคุณ: " + name : "คุณไม่มีชื่อ");
  }
}
