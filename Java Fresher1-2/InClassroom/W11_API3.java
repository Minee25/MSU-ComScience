public class W11_API3 {
  public static void main(String[] args) {
    char ch = 'F';
    boolean x = Character.isUpperCase(ch);
    System.out.println(x);

    System.out.println("-----");
    int number = 12;
    System.out.println(Character.isDigit(number));

    System.out.println("-----");
    char grade = 'F';
    System.out.println(Character.isLetter(grade));
  }
}
