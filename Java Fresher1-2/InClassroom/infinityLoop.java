D:\Minee\W7_StopWatch.javaimport java.util.concurrent.TimeUnit;

public class infinityLoop {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Hackerman ");
            for (int i = 0; i < 15; i++) {
           D:\Minee\W7_StopWatch.java     System.out.print("\u001B[32m\t" + (int) (Math.random() * 10) + " \u001B[0m");
            }

            System.out.println();
        }
    }
}
