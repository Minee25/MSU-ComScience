import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    System.out.print("N: ");
    int n = input.nextInt();

    String name[] = new String[n];
    int scoreMid[] = new int[n];
    int scoreFinal[] = new int[n];
    int sum[] = new int[n];

    // Name
    for (int i = 0; i < n; i++) {
      System.out.print("Name: ");
      name[i] = inputString.nextLine();

      System.out.print("Mid: ");
      scoreMid[i] = input.nextInt();

      System.out.print("Final: ");
      scoreFinal[i] = input.nextInt();
    }

    // Sum score
    for (int i = 0; i < n; i++) {
      sum[i] = scoreMid[i] + scoreFinal[i];
    }

    // Find min max
    int minMid = scoreMid[0];
    int maxMid = scoreMid[0];

    int minFi = scoreFinal[0];
    int maxFi = scoreFinal[0];

    int minScore = sum[0];
    int maxScore = sum[0];


    String nameMinMidTerm = name[0];
    String nameMaxMidTerm = name[0];

    String nameMinFinal = name[0];
    String nameMaxFinal = name[0];
    
    String nameMinScore = name[0];
    String nameMaxScore = name[0];

    for (int i = 1; i < n; i++) {
      if (scoreMid[i] < minMid) {
        minMid = scoreMid[i];
        nameMinMidTerm = name[i];
      }
      if (scoreMid[i] > maxMid) {
        maxMid = scoreMid[i];
        nameMaxMidTerm = name[i];
      }
      if (scoreFinal[i] < minFi) {
        minFi = scoreFinal[i];
        nameMinFinal = name[i];
      }
      if (scoreFinal[i] > maxFi) {
        maxFi = scoreFinal[i];
        nameMaxFinal = name[i];
      }
      if (sum[i] < minScore) {
        minScore = sum[i];
        nameMinScore = name[i];
      }
      if (sum[i] > maxScore) {
        maxScore = sum[i];
        nameMaxScore = name[i];
      }
    }

    // Output
    System.out.println("Name\tMidterm\tFinal\tScore");
    for (int i = 0; i < n; i++) {
      System.out.println(name[i] + "\t" + scoreMid[i] + "\t" + scoreFinal[i] + "\t" + sum[i]);
    }
    System.out.println("Min Midterm:\t" + nameMinMidTerm);
    System.out.println("Max Midterm:\t" + nameMaxMidTerm);
    System.out.println("Min Final:\t" + nameMinFinal);
    System.out.println("Max Finale:\t" + nameMaxFinal);
    System.out.println("Min Score:\t" + nameMinScore);
    System.out.println("Max Score:\t" + nameMaxScore);

    input.close();
    inputString.close();
  }
}
