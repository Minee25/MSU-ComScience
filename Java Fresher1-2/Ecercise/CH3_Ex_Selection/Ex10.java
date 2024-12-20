import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    /*
     * 10. จากปฏิทินเดือนมิถุนายน 2555 จงเขียนโปรแกรมรับวันที่แล้วแสดงชื่อวัน
     * (ใช้โครง if-else และ switch-case)
     * Sunday Monday Tuesday Wednesday Thursday Friday Saturday
     * 1 2
     * 3 4 5 6 7 8 9
     * 10 11 12 13 14 15 16
     * 17 18 19 20 21 22 23
     * 24 25 26 27 28 29 30
     */

    Scanner input = new Scanner(System.in);

    int number = input.nextInt();

    // IF ELSE
    // if (number == 3 || number == 10 || number == 17 || number == 24) {
    // System.out.println("Sunday");
    // } else if (number == 4 || number == 11 || number == 18 || number == 25) {
    // System.out.println("Monday");
    // } else if (number == 5 || number == 12 || number == 19 || number == 26) {
    // System.out.println("Tuesday");
    // } else if (number == 6 || number == 13 || number == 20 || number == 27) {
    // System.out.println("Wednesday");
    // } else if (number == 7 || number == 14 || number == 21 || number == 28) {
    // System.out.println("Thursday");
    // } else if (number == 1 || number == 8 || number == 15 || number == 22 ||
    // number == 29) {
    // System.out.println("Friday");
    // }else if (number == 2 || number == 9 || number == 16 || number == 23 ||
    // number == 30) {
    // System.out.println("Saturday");
    // }

    // Switch case
    switch (number) {
      case 3, 10, 17, 24:
        System.out.println("Sunday");
        break;
      case 4, 11, 18, 25:
        System.out.println("Monday");
        break;
      case 5, 12, 19, 26:
        System.out.println("Tuesday");
        break;
      case 6, 13, 20, 27:
        System.out.println("Wednesday");
        break;
      case 7, 14, 21, 28:
        System.out.println("Thursday");
        break;
      case 1, 8, 15, 22, 29:
        System.out.println("Friday");
        break;
      case 2, 9, 16, 23, 30:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Not found day");
        break;
    }

    input.close();
  }
}
