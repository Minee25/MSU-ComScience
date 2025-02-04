import java.util.Scanner;

public class Week5_Loop1_67011212030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumUnit = 0;
        int sumGradeAndUnit = 0;

        while (!input.hasNextInt()) {
            System.out.println("Please enter a number"); 
            input.next();
        }
        
        System.out.print("N: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Grade: ");
            char grade = input.next().charAt(0);

            System.out.print("Unit: ");
            int unit = input.nextInt();

            // Validate
            String gradeValidate = String.valueOf(grade).trim().toLowerCase();

            if (gradeValidate == "" || gradeValidate == null) {
                continue;
            }

            // Process
            int gradeNumber = 0;
            switch (gradeValidate) {
                case "a":
                    gradeNumber = 4;
                    break;
                case "b":
                    gradeNumber = 3;
                    break;
                case "c":
                    gradeNumber = 2;
                    break;
                case "d":
                    gradeNumber = 1;
                    break;
                case "f":
                    gradeNumber = 0;
                    break;
                default:
                    unit = 0;
                    break;
            }

            sumUnit += unit;
            int gradeAndUnit = gradeNumber * unit;
            sumGradeAndUnit += gradeAndUnit;
        }

        System.out.println("\nSumUnit: " + sumUnit);
        System.out.println("SumGradeAndUnit: " + sumGradeAndUnit);

        // Output
        double avg = (double) sumGradeAndUnit / sumUnit;
        System.out.println("\nAvg: s" + avg);
    }
}
