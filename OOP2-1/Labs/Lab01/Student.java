public class Student {
  String name;
  String id;
  Student classMate;

  // Constructor
  Student(String Name, String Id, Student ClassMate) {
    name = Name;
    id = Id;
    classMate = ClassMate;
  }

  void setClassMate(Student sm) {
    classMate = sm;
  }

  void print() {
    System.out.println(name + " " + id + " " + classMate.name);
  }
}
