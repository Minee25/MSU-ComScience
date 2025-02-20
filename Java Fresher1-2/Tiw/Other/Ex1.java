import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    String names[] = new String[5];
    int mid[] = new int[5];
    int fin[] = new int[5];
    int scores[] = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Name: ");
      names[i] = input2.nextLine();
      System.out.print("Mid: ");
      mid[i] = input.nextInt();
      System.out.print("Final: ");
      fin[i] = input.nextInt();

      scores[i] = mid[i] + fin[i];
    } 

    System.out.println("Name\tMidterm\tFinal\tScore");
    for (int i = 0; i < 5; i++) {
      System.out.println(names[i] + "\t" + mid[i] + "\t" + fin[i] + "\t" + scores[i]);
    }
  }
}