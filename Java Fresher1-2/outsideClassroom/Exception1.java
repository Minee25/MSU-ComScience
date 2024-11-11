import java.util.Scanner;

public class Exception1 {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("Input: ");
      String userInput = input.nextLine(); 
      if (userInput.chars().allMatch(Character::isDigit)) {
        throw new Exception( "พิมพ์ไทยดีเฮ้ย");
      }
      System.out.println(userInput);
    } catch (Exception err) {
      System.out.println(err);
    }
 
  }
}
