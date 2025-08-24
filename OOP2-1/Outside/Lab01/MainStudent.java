public class MainStudent {
  public static void main(String[] args) {
    Student student1 = new Student("Minee", "1234", null);
    Student student2 = new Student("Master", "1234", student1);
    student1.setClassMate(student2);
    student1.displayStudent();
    student2.displayStudent(); 
  }
}
