class Mymain {
  public static void main(String[] args) {
    MyDate date1 = new MyDate();
    MyDate date2 = new MyDate(1, 10, 100);

    date1.setDay(209);
    date1.setMonth(4);
    date1.setYear(2021);
    date1.print();

    date2.print();
  }  
}
