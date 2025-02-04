import java.util.Scanner;

public class Week6_Loop2_67011212030 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Second: ");
        int secInput = input.nextInt();
        System.out.print("Minute: ");
        int minuteInput = input.nextInt();
        System.out.print("Hours: ");
        int hoursInput = input.nextInt();
        
        int s = 0, m = 0, h = 0;
        System.out.println("Hours:\tMinute:\tSecound");
        System.out.print("\r" + h + " \t" + m + " \t" + s + " ");

        while (true) {
            System.out.print("\r" + h + " \t" + m + " \t" + s + " ");

            if (h >= hoursInput) {
                if (m >= minuteInput) {
                    if (s >= secInput) {
                        System.out.println("\nTime out!");
                        break;
                    }
                }
            }

            // sleep
            try {
                Thread.sleep(100);
            } catch (InterruptedException err) {
                System.out.println(err);
            }

            // secound
            s++;

            // minute
            if (s >= 60) {
                m += 1;
                s = 0;
            }

            // hourse
            if (m >= 60) {
                h += 1;
                m = 0;
            }  
        }
    }
}