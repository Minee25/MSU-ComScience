import java.util.Scanner;

public class W5_DoWhlie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();

        int i = 1;
        int count = 0;
        do {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        } while (i <= n);
        System.out.println("\nCount: " + count);
        if (count == 2) {
            System.out.println("PRIME");
        } else {
            System.out.println("NOT PRIME");

        }
    }
}