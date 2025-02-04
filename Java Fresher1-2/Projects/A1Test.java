import java.util.Arrays; 
import java.util.Collections;

public class A1Test {
  public static void main(String[] args) {
    Integer num[] = { 12, 4, 1, 2, 4, 5, 1, 5, 6, 6, 2 };
    Arrays.sort(num, Collections.reverseOrder());
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + ", ");
    }
  }
}