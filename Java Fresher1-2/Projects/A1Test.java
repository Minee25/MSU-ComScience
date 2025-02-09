import java.util.Scanner;

public class A1Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name[] = new String[3];

    for (int i = 0; i < name.length; i++) {
      System.out.print(" : ");
      name[i] = sc.nextLine();
    }

    int length = 0;
    for (int i = 0; i < 3; i++) {
      if (name[i].length() > length) {
        length = name[i].length();
      }
    }

    System.out.println(length);

    for (int i = 0; i < length; i++) {
      System.out.print("--");
    }

    System.out.println();

    for (int i = 0; i < name.length; i++) {
      System.out.print("|");
      for (int j = 0; j < length / 2; j++) {
        System.out.print(" "); 
      }
      System.out.print(name[i]);
      for (int j = 0; j < length / 2; j++) {
        System.out.print(" "); 
      }
      System.out.println("|");
      /* for (int j = 0; j < name.length; j++) {
        
      } */
    }


  }
}