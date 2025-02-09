public class GenPassword {
  public static void main(String[] args) {
    String letter[] = {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 
        "abcdefghijklmnopqrstuvwxyz",
        "!@#$%^&*()-_=+[]{};:'\",.<>?/|\\",
        "0123456789"
    };

    String password = "";
    for (int i = 0; i < 30; i++) {
      int randomRow = (int) (Math.random() * letter.length);
      int randomLetter = (int) (Math.random() * letter[randomRow].length());

      password += letter[randomRow].charAt(randomLetter);
    }

    System.out.println(password);
  }
}
