import java.util.Scanner;

public class W7_ArrayGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("N: ");
		int n = input.nextInt();

		double score[] = new double[n];
		char grade[] = new char[n];

		for (int i = 0; i < n; i++) { 
			System.out.print("Score: ");
			while (!input.hasNextDouble()) {
				System.out.print("Score: ");
				input.next();
			}
			score[i] = input.nextDouble();
		}

		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 80) {
				grade[i] = 'A';
			} else if (score[i] >= 70 && score[i] <= 79) {
				grade[i] = 'B';
			} else if (score[i] >= 60 && score[i] <= 69) {
				grade[i] = 'C';
			} else if (score[i] >= 50 && score[i] <= 59) {
				grade[i] = 'D';
			} else if (score[i] < 50) {
				grade[i] = 'F';
			} else {
				grade[i] = 'X';
			}
		}

		/*
		 * for (int i = 0; i < grade.length; i++) {
		 * System.out.print(grade[i]);
		 * if (i < grade.length - 1) {
		 * System.out.print(", ");
		 * }
		 * }
		 */

		for (char c : grade) {
			System.out.println(c);
		}
	}
}
