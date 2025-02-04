import java.util.Scanner;

public class W4_Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cost = 1;
        int ten = 0;
        int twn = 0;

        System.out.print("Room: ");
        int room = input.nextInt();

        System.out.print("Unit: ");
        int unit = input.nextInt();

        if (unit <= 10) {
            cost = unit * 5;
        } else if (unit >= 11 && unit <= 20) {
            ten = 10 * 8;
            unit -= 10;
            cost =  unit * 10  + ten + twn;
        } else {
            ten = 10 * 10;
            twn = 10 * 20;
            unit -= 20;
            cost =  unit * 50  + ten + twn;
        }

        System.out.println("\nOutput");
        System.out.println("Room: " + room);
        System.out.println("Cost: " + cost);
    }
}
