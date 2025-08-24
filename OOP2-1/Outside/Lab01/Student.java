class Student {
  String name;
  String id;
  Student classMate;

  // Constructor
  public Student(String Name, String Id, Student ClassMate) {
    this.name = Name;
    this.id = Id;
    setClassMate(ClassMate);
  }
  
  void setClassMate(Student sm) {
    this.classMate = sm;
  }

  Student getClassMate() {
    return this.classMate;
  }

  void displayStudent() {
    System.out.println("Name: " + name + "\nID: " + id + "\nClassMate: " + classMate.name);
  }
}
