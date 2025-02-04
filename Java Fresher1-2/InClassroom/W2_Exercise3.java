import java.util.Scanner;

public class W2_Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Product: ");
        String product = input.nextLine();

        System.out.print("Price: ");
        int price = input.nextInt();

        System.out.print("Amount; ");
        int amount = input.nextInt();

        System.out.print("Pay; ");
        int pay = input.nextInt();

        int cost = amount * price;
        int change =pay- cost ;

        System.out.println("OUTPOUT");
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Amount: " + amount);
        System.out.println("Pay: " + pay); 
        System.out.println("Cost: " + cost); 
        System.out.println("Change: " + change);
    }
}
