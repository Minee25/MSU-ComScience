import java.util.Scanner;

public class W3_Exercise1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = input.nextInt();

        if (number % 9 == 0) {
            System.out.println("" + number + " Division by Nine Perfectly"); 
        }
    } 
}
