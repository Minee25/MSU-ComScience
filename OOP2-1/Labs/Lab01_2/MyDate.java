class MyDate {
  int day;
  int month;
  int year;

  // Constructor
  MyDate() {
    day = 1;
    month = 1;
    year = 2025;
  }

  MyDate(int Day, int Month, int Year) {
    day = Day;
    month = Month;
    year = Year;
  }

  // Method
  void setDay(int d) {
    if (d > 31) {
      System.out.println("Error");
      return;
    }
    day = d;
  }

  void setMonth(int m) {
    if (m > 12) {
      System.out.println("Error");
      return;
    }
    month = m;
  }
  
  void setYear(int y) {
    year = y;
  }

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
