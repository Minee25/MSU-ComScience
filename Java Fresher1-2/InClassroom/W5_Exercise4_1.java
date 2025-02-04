public class W5_Exercise4_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.floor(Math.random() * (5 + 1) + 65));
            System.out.print(random + " ");

            // if (random == 'A') {
            //     System.out.println((char) random + " Excellence");
            // } else if (random == 'B') {
            //     System.out.println((char) random + " Good");
            // } else if (random == 'C') {
            //     System.out.println((char) random + " Pass");
            // } else if (random == 'D') {
            //     System.out.println((char) random + " Fair");
            // } else if (random == 'E') {
            //     System.out.println((char) random + " Error");
            // } else if (random == 'F') {
            //     System.out.println((char) random + " Fail");
            // } else {
            //     System.out.println("Grade not found");
            // }

            switch (random) {
                case 'A':
                    System.out.println((char) random + " Excellence");
                    break;
                case 'B':
                    System.out.println((char) random + " Good");
                    break;
                case 'C':
                    System.out.println((char) random + " Pass");
                    break;
                case 'D':
                    System.out.println((char) random + " Fair");
                    break;
                case 'E':
                    System.out.println((char) random + " Error");
                    break;
                case 'F':
                    System.out.println((char) random + " Fail");
                    break;
                default:
                    System.out.println("Grade not found");
                    break;
            }
        }
    }
}