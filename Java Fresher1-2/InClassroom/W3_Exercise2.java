import java.util.Scanner;

public class W3_Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int change = 0;

        System.out.print("Input price: ");
        int price = input.nextInt();

        System.out.print("Input pay: ");
        int pay = input.nextInt();

        if (pay < pay) {
            change = pay - price;
            System.out.println("Change " + change);
        }

    }
}
