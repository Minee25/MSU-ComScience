import java.util.Arrays;
import java.util.Scanner;

public class W7_Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        double score[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Letter: ");
            score[i] = input.nextDouble();
        }

        // sort by
        Arrays.sort(score);

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]);
            if (i < score.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
