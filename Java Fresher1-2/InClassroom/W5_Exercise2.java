import java.util.Scanner;

public class W5_Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input: ");
            int userInput = input.nextInt();
            sum += userInput; 
        }
        
        avg = (double)sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}
