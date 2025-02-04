public class W6_Exercise6 {
    public static void main(String[] args) {
        int letterF = 0;
        while (true) {
            char letter = (char) ((Math.random() * 6) + 65);
            System.out.print(letter);

            if (letter == 'F') {
                letterF += 1;
                System.out.println(" This is F = " + letterF);
            } else {
                System.out.println();
            }
            if (letterF >= 3) { 
                System.out.println();
                break;
            }
        }
    }
}
