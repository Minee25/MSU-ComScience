import java.util.Scanner;

public class W6_ExerciseLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        // int at = n / 5;
        // int start = n % 5;

        // for (int i = 0; i < at; i++) {
        // System.out.print("@");
        // }

        // for (int i = 0; i < start; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < n; i++) {
        // if (i < 5) {
        // System.out.print("@");
        // }
        // else if (i >= 5) {
        // System.out.print("*");
        // n -= 5;
        // i--;
        // }
        // }

        while (n > 0) {
            if (n >= 5) {
                System.out.print("@");
                n -= 5;
            } else if (n < 5) {
                System.out.print("*");
                n--;
            }
        }
    }
}
