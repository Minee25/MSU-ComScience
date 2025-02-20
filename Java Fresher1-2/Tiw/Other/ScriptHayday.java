public class ScriptHayday {

  public static void main(String[] args) {
    double j = 33;
    for (int i = 1; i <= 100; i++) {
      // เส้นจากขวาไปซ้าย
      // System.out.println("mouseMove " + "98" + " " + j);
      System.out.printf("mouseMove %d %.1f\n", 98, j);
      System.out.println("wait 20");
      j += 0.3;
      // System.out.println("mouseMove " + "98" + " " + j);
      System.out.printf("mouseMove %d %.1f\n", 98, j);
      System.out.println("wait 20");

      // เส้นจากซ้ายไปขวา
      // System.out.println("mouseMove " + "6" + " " + j);
      System.out.printf("mouseMove %d %.1f\n", 6, j);
      System.out.println("wait 20");
      j += 0.3;
      // System.out.println("mouseMove " + "6" + " " + j);
      System.out.printf("mouseMove %d %.1f\n", 6, j);
      System.out.println("wait 20");
    }
  }
}