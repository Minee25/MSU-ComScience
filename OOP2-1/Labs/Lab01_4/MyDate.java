public class MyDate {
  int day;
  int month;
  int year;

  // Setter
  void setDay(int d) {
    day = d;
  }

  void setMonth(int m) {
    month = m;
  }

  void setYear(int y) {
    year = y;
  }

  // Getter
  int getDay() {
    return day;
  }

  int getMonth() {
    return month;
  }

  int getYear() {
    return year;
  }

  void print() {
    System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
  }
}
