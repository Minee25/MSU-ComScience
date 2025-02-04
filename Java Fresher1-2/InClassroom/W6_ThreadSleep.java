public class W6_ThreadSleep {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.print(i + "\r");
            i++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException err) {
                System.out.println(err);
            }
        }
    }
}
