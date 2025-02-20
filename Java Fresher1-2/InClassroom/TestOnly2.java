import java.util.Scanner;

public class TestOnly2 {
  public static void main(String[] args) {
    String name = "Thaksin Mualsuk";

    StringBuilder sb = new StringBuilder(name);
    sb.insert(4, "Minee");
    System.out.println(sb);
  }
}
