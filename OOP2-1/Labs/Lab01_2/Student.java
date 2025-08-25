class Student {
  String name;
  int id;
  Student classMate;

  // Constructor
  Student(String Name, int Id, Student ClassMate) {
    name = Name;
    id = Id;
    classMate = ClassMate;
  }

  // method
  void setClassMate(Student sm) {
    classMate = sm;
  }

  void print() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Class mate: " + classMate.name);
  }
}