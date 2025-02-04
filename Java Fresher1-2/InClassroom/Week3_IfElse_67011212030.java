import java.util.Scanner;

public class Week3_IfElse_67011212030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Market: ");
        int market = input.nextInt();

        System.out.print("Sell (T): ");
        double sell = input.nextDouble();

        double allMoney = 0;
        double compensate = 0;

        double kk = sell * 1000;
        double moneyForSell = kk * market;
        if (market < 15) {
            compensate = kk * 3.25;
            allMoney = moneyForSell + compensate;
            System.out.println("Sell rice: " + moneyForSell);
            System.out.println("Compensate: " + compensate);
            System.out.println("All money: " + allMoney);
        } else {
            compensate = kk * 0.0073;
            allMoney = moneyForSell + compensate;
            System.out.println("Sell rice: " + moneyForSell);
            System.out.println("Compensate: " + compensate);
            System.out.println("All money: " + allMoney);
        }
    }
}