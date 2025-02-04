import java.util.Scanner;

public class ExMethodGrade {
  public static void main(String[] args) {
    ExMethodGrade obj = new ExMethodGrade();
    int midScore = obj.input("Midterm: ");
    int finalScore = obj.input("Final: ");
 
    obj.display(obj.calGrade(midScore, finalScore));
  }

  int input(String msg) {
    Scanner input = new Scanner(System.in);
    System.out.print(msg);
    int x = input.nextInt();
    return x;
  }

  char calGrade(int mid, int fin) {
    char grade = 'U';
    int sumScore = mid + fin;
    if (sumScore >= 70) {
      grade = 'S';
    }
    return grade;
  }

  void display (char x) {
    System.out.println(x);
  }
}