class Student {
  String name;
  int id;
  Student classMate;

  Student(String Name, int Id, Student ClassMate) {
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
