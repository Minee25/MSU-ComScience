package เรียนนอกห้อง;
import java.util.Scanner;

class Variable {
  public static void main(String[] args) {
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException ie) {
    // Thread.currentThread().interrupt();
    // }
    Scanner input = new Scanner(System.in);
    System.out.print("กรอกชื่อของคุณ: ");
    String name = input.nextLine();

    System.out.println(name);
  }
}