class Ex4 {
  public static void main(String[] args) {
    int a[] = new int[10];
    int b[] = new int[10];
    String and[] = new String[10];

    for (int i = 0; i < 10; i++) {
      a[i] = (int) (Math.random() * 2);
      b[i] = (int) (Math.random() * 2);
    }
    
    for (int i = 0; i < 10; i++) {
      if (a[i] == 1 && b[i] == 1) {
        and[i] = "true";
      } else {
        and[i] = "false";
      }
    }

    // ********** Output **********
    // print arr A
    System.out.print("A:\t[");
    for (int i = 0; i < 10; i++) {
      System.out.print(a[i] + "\t");
    }
    System.out.println("]");

    // print arr B
    System.out.print("B:\t[");
    for (int i = 0; i < 10; i++) {
      System.out.print(b[i] + "\t");
    }
    System.out.println("]");

    // print AND
    System.out.print("B:\t[");
    for (int i = 0; i < 10; i++) {
      System.out.print(and[i] + "\t");
    }
    System.out.println("]");
  }
}