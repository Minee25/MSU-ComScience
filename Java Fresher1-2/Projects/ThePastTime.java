import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThePastTime {
  public static void main(String[] args) {
    ThePastTime obj = new ThePastTime();
    int hour = obj.input("Hour: ");
    int minute = obj.input("Minute: ");
    int second = obj.input("Second: ");

    obj.display(obj.calculatePastTime(hour, minute, second));
  }

  void display(String result) {
    System.out.println(result);
  }

  int input(String prompt) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
      } catch (Exception err) {
        System.out.println(err);
        System.out.println("Number only!");
        scanner.nextLine();
      }
    }
  }

  String calculatePastTime(int hour, int minute, int second) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime past = now.withHour(hour).withMinute(minute).withSecond(second);

    int hourPast = now.getHour() - past.getHour();
    int minutePast = now.getMinute() - past.getMinute();
    int secondPast = now.getSecond() - past.getSecond();

    // ตรวจสอบการยืมค่าเมื่อผลลบ
    if (secondPast < 0) {
      secondPast += 60;
      minutePast--;
    }
    if (minutePast < 0) {
      minutePast += 60;
      hourPast--;
    }
    if (hourPast < 0) {
      hourPast += 24;
    }

    // จัดรูปแบบวันที่ปัจจุบัน
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedNow = now.format(formatter);

    return "Current Date: " + formattedNow +
        "\nElapsed Time: " + hourPast + ":" + minutePast + ":" + secondPast;
  }
}
