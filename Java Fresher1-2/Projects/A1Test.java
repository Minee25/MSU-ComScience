public class A1Test {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(
          "grade.put(\"" + (char) ((Math.random() * 6) + 65) + "\", " + (int) ((Math.random() * 10)) + ");");
    }
  }
}