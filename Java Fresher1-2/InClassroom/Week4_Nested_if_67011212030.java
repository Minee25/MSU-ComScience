import java.util.Scanner;

public class Week4_Nested_if_67011212030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Number: ");
        int userInput = input.nextInt();

        // Validate
        if (userInput < 1 && userInput > 90) {
            System.out.println("Day not found");
            return;
        }

        // Day
        int day = userInput % 7 + 1;
        if (day == 0) {
            System.out.println("Sun");
        } else if (day == 1) {
            System.out.println("Mon");
        } else if (day == 2) {
            System.out.println("Tue");
        } else if (day == 3) {
            System.out.println("Web");
        } else if (day == 4) {
            System.out.println("Thr");
        } else if (day == 5) {
            System.out.println("Fri");
        } else if (day == 6) {
            System.out.println("Sat");
        } 

        // Month
        int date = 0;
        if (userInput >= 1 && userInput <= 31) {
            System.out.println("Jan");
            date = userInput;
        } else if (userInput >= 32 && userInput <= 59) {
            System.out.println("Feb");
            date = userInput - 31;
        } else if (userInput >= 60 && userInput <= 90) {
            System.out.println("Mar");
            date = userInput - 59;
        }

        // Date
        System.out.println(date);
    }
}
