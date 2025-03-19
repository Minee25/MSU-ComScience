import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A1Test {
  public static void main(String[] args) {

    // String data = "345";
    // String[] letters = data.split("");
    // String[] letterReverse = letters;
    // Arrays.sort(letterReverse, Collections.reverseOrder());
    // System.out.println(letters[0]);
    // System.out.println(letterReverse[0]);

    int num1 = 10;
    int num2 = 10;

    num2 = num1 > 10 ? 10 : 999;
    System.out.println(num2);
    // System.out.println((int)'ก');
    for (int i = 0; i < 11; i++) {
      System.out.println(
          "6701121203" + i + " Minee Master " + ((int) (Math.random() * 50)) + " " + ((int) (Math.random() * 50)));
    }
  }
}