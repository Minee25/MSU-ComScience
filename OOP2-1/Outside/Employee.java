class Employee {
  // Attribute
  private String id;
  private String name;
  private Double salary;

  // Static Attribue
  static int minSalary = 12000;

  // Default Constructor
  public Employee(Object... args) {
    if (args.length == 0) {
      this.id = "unknown";
      this.name = "unknown";
      this.salary = 0.0;
    } else if (args.length == 2) {
      this.id = args[0] instanceof String ? (String) args[0] : "unknown";
      this.name = args[1] instanceof String ? (String) args[1] : "unknown";
      this.salary = 0.0;
    } else if (args.length == 3) {
      this.id = args[0] instanceof String ? (String) args[0] : "unknown";
      this.name = args[1] instanceof String ? (String) args[1] : "unknown";
      this.salary = args[2] instanceof Double ? (Double) args[2] : 0.0;
    } else {
      throw new IllegalArgumentException("Invalid number of arguments");
    }
  }

  // Method
  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public void displayEmployee() {
    System.out.println("Employee ID: " + this.id);
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Salary: " + this.salary);
  }

  public String getName() {
    return this.name;
  }

  public Double getSalary() {
    return this.salary;
  }
}