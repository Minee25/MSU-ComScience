import java.util.Scanner;

public class W5_Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int userInput = input.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("" + userInput + " Even");
        } else {
            System.out.println("" + userInput + " ODD");
        }
        input.close();
    }
}
