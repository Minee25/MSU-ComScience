public class W5_Exercise4 {
    public static void main(String[] args) {
        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.floor(Math.random() * 11));

            System.out.print(random);
            if (random % 2 == 0) {
                System.out.println(" Even");
                sumEven++;
            } else {
                System.out.println(" Odd");
                sumOdd++;
            }
        }
        System.out.println("Sum Even: " + sumEven);
        System.out.println("Sum Odd: " + sumOdd);
    }
}