import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startDay = input.nextInt();
        int day=0;

        System.out.println("Sun\tMon\tTue\tWeb\tThr\tFri\tSat");

        for (int i = 1; i <= 30; i++) {
            if (i <= startDay) {
                System.out.print("\t");
            }
            else if (day % 7 == startDay) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
    }
}