public class MyStudent {
  public static void main(String[] args) {
    Student student1 = new Student("A", "100", null);
    Student student2 = new Student("B", "101", student1);
    student1.setClassMate(student2);

    student1.print();
    student2.print();
  }
}
