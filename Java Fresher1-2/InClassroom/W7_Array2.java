import java.util.Scanner;

public class W7_Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = 8;
        char score[] = new char[n];
        score[0] = 'S';
        score[1] = 'P';
        score[2] = 'e';
        score[3] = 'M';
        score[4] = 'p';
        score[5] = 'l';
        score[6] = 'e';
        score[7] = 'H';
    
        for (int i = 0; i < n; i++) {
            System.out.print(score[i] + " ");
        }
    }
}
