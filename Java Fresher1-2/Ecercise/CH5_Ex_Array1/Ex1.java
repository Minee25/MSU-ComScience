import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    String name[] = new String[5];
    int mid[] = new int[5];
    int fi[] = new int[5];

    // input
    for (int i = 0; i < 5; i++) {
      System.out.print("Name (" + (i + 1) + "): ");
      name[i] = input2.nextLine();

      System.out.print("Miterm (" + (i + 1) + "): ");
      mid[i] = input.nextInt();

      System.out.print("Final (" + (i + 1) + "): ");
      fi[i] = input.nextInt();
    }

    // Output
    System.out.println();
    System.out.println("Name\tMidterm\tFinal\tScore");
    for (int i = 0; i < 5; i++) {
      System.out.println(name[i] + "\t" + mid[i] + "\t" + fi[i] + "\t" + (mid[i] + fi[i]));
    }

    input.close();
    input2.close();
  }
}
