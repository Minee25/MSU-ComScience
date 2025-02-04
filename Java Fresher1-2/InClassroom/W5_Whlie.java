public class W5_Whlie {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 10) {
            System.out.print(n + " + ");
            sum += n;
            n -= -1;
        }
 
        double avg = (double) sum / (n - 1);
        System.out.println("\b\b\b = " + sum);
        System.out.println(n);
        System.out.println("Avg = " + avg);
    }
}
