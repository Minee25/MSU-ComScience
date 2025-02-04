public class W4_Random {
    public static void main(String[] args) {
        // int rand = (int) Math.floor(Math.random() * 10) + 10;
        char x;
        try {
            for (int i = 1; i <= 100; i++) {
                x = (char) (Math.floor(Math.random() * 26) + 'A');
                System.out.println(i + " " + x);
                Thread.sleep(200);
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
