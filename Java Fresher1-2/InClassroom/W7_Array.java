public class W7_Array {
    public static void main(String[] args) {
        int n;
        n = 5;
        double score[] = new double[n];
        score[0] = 57.3;
        score[1] = 6.27;
        score[2] = 34.6;
        score[3] = 8.33;
        score[4] = 9.67;
        score[5] = 7.96;

        for (int i = 0; i < n; i++) {
            System.out.print(score[i] + " ");
        }
    }
}
