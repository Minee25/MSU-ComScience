public class MyDate {
  int day;
  int month;
  int year;

  // Constructor
  MyDate() {
    setDay(22);
    setMonth(6);
    setYear(2025);
  }

  MyDate(int Day, int Month, int Year) {
    setDay(Day);
    setMonth(Month);
    setYear(Year);
  }

  // ******************** Setter
  void setDay(int day) {
    if (day < 1 || day > 31) {
      System.out.println("Error day");
      this.day = 0;
    } else {
      this.day = day;
    }
  }

  void setMonth(int month) {
    if (month < 1 || month > 12) {
      System.out.println("Error month");
      this.month = 0;
    } else {
      this.month = month;
    }
  }

  void setYear(int year) {
    if (year < 0) {
      System.out.println("Error year");
      this.year = 2000;
    } else {
      this.year = year;
    }
  }

  // ******************** Getter
  int getDay() {
    return day;
  }

  int getMonth() {
    return month;
  }

  int getYear() {
    return year;
  }

  // ******************** Display
  void displayDate() { 
    System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
  }
}
