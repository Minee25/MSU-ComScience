public class Op {
  // คลาส Student
  static class Student {
      private String name;
      private int age;
      private String job;

      // Constructor
      public Student(String name, int age, String job) {
          this.name = name;
          this.age = age;
          this.job = job;
      }

      // Getter Methods
      public String getName() {
          return name;
      }

      public int getAge() {
          return age;
      }

      public String getJob() {
          return job;
      }
  }

  public static void main(String[] args) {
      // สร้างอ็อบเจกต์
      Student student = new Student("Minee", 19, "Programmer");

      // ใช้ Getter แทน student.name
      System.out.println(student.getName());
      System.out.println(student.getAge());
      System.out.println(student.getJob());
  }
}
