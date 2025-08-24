public class Main {
  public static void main(String[] args) {
    MyDate date = new MyDate();
    date.setDay(22);
    date.setMonth(6);
    date.setYear(2025);
    date.displayDate();

    MyDate date2 = new MyDate(13, 5, 2019);
    date2.displayDate();
  }
}
