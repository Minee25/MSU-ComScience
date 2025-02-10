import java.util.Arrays;
import java.util.Collections;

class Minee {
  private Minee() {
  }

  public static double triangle(double base, double height) {
    return 0.5 * base * height;
  }

  public static double square(double side) {
    return side * side;
  }

  public static double cricle(double radius) {
    return 3.141592653589793 * (radius * radius);
  }

  public static double[] sortByZtoA(int[] arr) {
    Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("เรียงลำดับจากมากไปน้อย:");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
  }
}
