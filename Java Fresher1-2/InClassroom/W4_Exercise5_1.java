import java.util.Scanner;

public interface W4_Exercise5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double priceBottom = 0,
            priceUnit = 0,
            priceWater = 0,
            sumPrice = 0
        ; 

        System.out.print("Size: ");
        char size = input.next().charAt(0); 
        String sizeStr = Character.toString(size).toLowerCase();
        size = sizeStr.charAt(0);

        if (size == 's') {
            System.out.println("Small");
            System.out.println("Price Bottom: " + 0.75);
            priceBottom = 1;
            priceUnit = 0.75;
        } else if (size == 'm') {
            System.out.println("Medium");
            System.out.println("Price Bottom: " + 1.50);
            priceBottom = 1.50;
            priceUnit = 1;
        } else if (size == 'l') {
            System.out.println("Larg");
            System.out.println("Price Bottom: " + 1.75);
            priceBottom = 1.75;
            priceUnit = 1.5;
        } else if (size == 'j') {
            System.out.println("Jumbo");
            System.out.println("Price Bottom: " + 2.50);
            priceBottom = 2.50;
            priceUnit = 2.5;
        } else {
            System.out.println("Nothing");
            input.close();
            return;
        }

        priceWater = priceUnit * 8.25 ;
        sumPrice = priceWater + priceBottom;

        System.out.println("Price Bottom: " + priceBottom);
        System.out.println("PriceWater: " + priceWater);
        System.out.println("Sum Price: " + sumPrice);
        input.close();
    }
}
