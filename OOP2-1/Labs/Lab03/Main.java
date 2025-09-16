public class Main {
  public static void main(String[] args) {
    People beckham = new People("Backham", 'M', "Facebook");
    People victoria = new People("Victoria", 'F', "Google");
    Children brooklyn = new Children("Brooklyn", 'M', "MSU", beckham, victoria);
    Children harper = new Children("Sow", 'F', "KKU", beckham, victoria);

    System.out.println("---Name---");
    System.out.println(brooklyn.name);
    System.out.println(harper.name);

    System.out.println("---Gender---");
    System.out.println(brooklyn);
    System.out.println(harper);

    System.out.println("---Father, Mother---");

    System.out.println(brooklyn.getFather());
    System.out.println(brooklyn.getMother());

    System.out.println("---Workplace---");
    System.out.println(brooklyn.getFather().getWorkplace());
    System.out.println(brooklyn.getMother().getWorkplace());

    System.out.println(brooklyn.getWorkplace()); 
    System.out.println(harper.getWorkplace()); 

    System.out.println("---Mother's day---"); 
    if (harper.equals(victoria)) {
      System.out.println("Love mom, Happy mother's day");
    } else {
      System.out.println("Not my mom");
    }

    System.out.println(brooklyn.respectTo(beckham));
    System.out.println(brooklyn.respectTo(victoria));
    System.out.println(brooklyn.respectTo(harper));
  }
} 
