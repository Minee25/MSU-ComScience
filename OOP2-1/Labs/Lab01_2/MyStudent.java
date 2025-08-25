class MyStudent {
  public static void main(String[] args) {
    Student student1 = new Student("AAA", 670, null);
    Student student2 = new Student("BBB", 672, student1); 
    student1.setClassMate(student2);
    student1.print();
    student2.print();

  }
}
