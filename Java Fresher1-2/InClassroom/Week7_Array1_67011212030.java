import java.util.Scanner;

public class Week7_Array1_67011212030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        String name[] = new String[n];
        int scoreMid[] = new int[n];
        int scoreFinal[] = new int[n];
        int sum[] = new int[n];
        char grade[] = new char[n];

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

        // Grade
        for (int i = 0; i < n; i++) {
            if (sum[i] >= 70) {
                grade[i] = 'S';
            } else {
                grade[i] = 'U';
            }
        }

        // Find min max
        int minMid = scoreMid[0];
        int maxMid = scoreMid[0];

        int minFi = scoreFinal[0];
        int maxFi = scoreFinal[0];

        int minScore = sum[0];
        int maxScore = sum[0];

        for (int i = 1; i < n; i++) {
            if (scoreMid[i] < minMid) {
                minMid = scoreMid[i];
            } 
            if (scoreMid[i] > maxMid) {
                maxMid = scoreMid[i];
            }
            if (scoreFinal[i] < minFi) {
                minFi = scoreFinal[i];
            } 
            if (scoreFinal[i] > maxFi) {
                maxFi = scoreFinal[i];
            }
            if (sum[i] < minScore) {
                minScore = sum[i];
            } 
            if (sum[i] > maxScore) {
                maxScore = sum[i];
            }
        }

        // Output
        System.out.println("Name\tMidterm\tFinal\tScore\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + "\t" + scoreMid[i] + "\t" + scoreFinal[i] + "\t" + sum[i] + "\t" + grade[i]);
        }
        System.out.println("Min" + "\t" + minMid + "\t" + minFi + "\t" + minScore);
        System.out.println("Max" + "\t" + maxMid + "\t" + maxFi + "\t" + maxScore);
    }
}
