import java.util.HashMap;

public class Testt {
  public static void main(String[] args) {
    HashMap<String, Integer> grade = new HashMap<String, Integer>();
    grade.put("A", 2);
    grade.put("B", 9);
    grade.put("A", 5);
    grade.put("D", 8);
    grade.put("F", 7);
    grade.put("C", 7);
    grade.put("F", 5);
    grade.put("B", 3);
    grade.put("F", 8);
    grade.put("A", 16);

    grade.forEach((key, value) -> {
      System.out.println(key + ": " + value);
    });
  }
}