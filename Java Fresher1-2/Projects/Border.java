import java.util.Scanner;

public class Border {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // String[] word = { "12", "1234f" };
    String[] word = new String[3];
    for (int i = 0; i < 3; i++) {
      System.out.print(": ");
      word[i] = input.nextLine();
    }

    int longest = 0;
    for (int i = 0; i < word.length; i++) {
      if (word[i].length() > longest) {
        longest = word[i].length();
      }
    }

    // Border
    // Top
    for (int i = 0; i < longest + 5; i++) {
      System.out.print("-");
    }
    System.out.println();
    for (int i = 0; i < word.length; i++) {
      // Line Left
      System.out.print("| ");

      // Space Left
      for (int j = 0; j < (longest - word[i].length() + 1) / 2; j++) {
        System.out.print(" ");
      }
      System.out.print(word[i]);

      // Space Right
      for (int j = 0; j < (longest - word[i].length() + 1) / 2; j++) {
        System.out.print(" ");
      }
      if (longest % 2 == 0) {
        if (word[i].length() % 2 == 0) {
          System.out.print(" ");
        }
      } else {
        if (word[i].length() % 2 != 0) {
          System.out.print(" ");
        }
      }

      // Line Rights
      System.out.print(" |");
      System.out.println();
    }
    // Bottom
    for (int i = 0; i < longest + 5; i++) {
      System.out.print("-");
    }
  }
}
