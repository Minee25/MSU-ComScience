import java.util.Scanner;

public class W3_Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double vat = 0; 

        System.out.print("จำนวนไร้: ");
        double ri = input.nextDouble();

        double sumRi = ri * 2500;

        if (ri <= 10) {
            vat = sumRi * 0.5 / 100;

            System.out.println("ไร้: " + ri);
            System.out.println("ชดเชย: " + sumRi);
            System.out.println("ภาษี: " + vat);
            System.out.println("เหลือ: " + (sumRi - vat));
        } else {
            vat = sumRi * 1.5 / 100;

            System.out.println("ไร้: " + ri);
            System.out.println("ชดเชย: " + sumRi);
            System.out.println("ภาษี: " + vat);
            System.out.println("เหลือ: " + (sumRi - vat));
        }
    }
}
