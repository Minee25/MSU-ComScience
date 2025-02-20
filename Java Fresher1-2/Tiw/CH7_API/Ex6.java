import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex6 {
  public static void main(String[] args) {
    Ex6 obj = new Ex6();

    int dayOfYear = obj.dayOfYear();
    int dayOfWeek = obj.dayOfWeek();
    int dayOfMonth = obj.dayOfMonth();
    String nameDayOfWeek = obj.nameDayOfWeek();
    String nameMonth = obj.nameMonth();
    int timeHour = obj.timeHour();
    int timeMinute = obj.timeMinute();
    int timeSecond = obj.timeSecond();  

    obj.display1(dayOfMonth, nameDayOfWeek, nameMonth, dayOfYear);
    obj.display2(dayOfWeek, dayOfMonth, dayOfYear);
    obj.display3(timeHour, timeMinute, timeSecond);
  }

  void display1(int day, String nameDayOfWeek, String nameMonth, int year) {
    System.out.print(day + " : " + nameDayOfWeek + " : " + nameMonth + " : " + year + "\n");
  }

  void display2(int dayOfWeek, int dayOfMonth, int dayOfYear) {
    System.out.print(dayOfWeek + " : " + dayOfMonth + " : " + dayOfYear + "\n");
  }

  void display3(int hour, int minute, int second) {
    System.out.print(hour + " : " + minute + " : " + second + "\n");
  }

  int day() {
    LocalDate date = LocalDate.now();
    int day = date.getDayOfMonth();
    return day;
  }

  int year() {
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    return year;
  }

  String nameDayOfWeek() {
    LocalDate date = LocalDate.now();
    String nameDayOfWeek = date.getDayOfWeek().toString();
    return nameDayOfWeek;
  }

  String nameMonth() {
    LocalDate date = LocalDate.now();
    String nameMonth = date.getMonth().toString();
    return nameMonth;
  }

  int dayOfWeek() {
    LocalDate date = LocalDate.now();
    int dayOfWeek = date.getDayOfWeek().getValue();
    return dayOfWeek;
  }

  int dayOfMonth() {
    LocalDate date = LocalDate.now();
    int dayOfMonth = date.getDayOfMonth();
    return dayOfMonth;
  }

  int dayOfYear() {
    LocalDate date = LocalDate.now();
    int dayOfYear = date.getDayOfYear();
    return dayOfYear;
  }

  int timeHour() {
    LocalDateTime date = LocalDateTime.now();
    int timeHour = date.getHour();
    return timeHour;
  }

  int timeMinute() {
    LocalDateTime date = LocalDateTime.now();
    int timeMinute = date.getMinute();
    return timeMinute;
  }

  int timeSecond() {
    LocalDateTime date = LocalDateTime.now();
    int timeSecond = date.getSecond();
    return timeSecond;
  }
}
