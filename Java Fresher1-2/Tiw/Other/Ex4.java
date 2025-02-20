public class Ex4 {
  public static void main(String[] args) {
    int a[] = new int[10];
    int b[] = new int[10];
    boolean and[] = new boolean[10];

    for (int i = 0; i < 10; i++) {
      a[i] = (int) (Math.random() * 2);
      b[i] = (int) (Math.random() * 2);
    }

    for (int i = 0; i < 10; i++) {
      if (a[i] == b[i]) {
        and[i] = true;
      } else {
        and[i] = false;
      }
    }

    // Output
    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + "\t");
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print(b[i] + "\t");
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print(and[i] + "\t");
    }
  }
}
