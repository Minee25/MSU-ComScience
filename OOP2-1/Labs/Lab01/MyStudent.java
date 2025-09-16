class MyStudent {
  public static void main(String[] args) {
    Student std1 = new Student("AAA", 100, null);
    Student std2 = new Student("BBB", 101, std1);
    std1.setClassMate(std2);

    std1.print();
    std2.print();
  }
}
