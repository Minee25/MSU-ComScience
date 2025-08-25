public class DemoPerson {
  public static void main(String[] args) {
    Person dome = new Person(null);
    Person ken = new Person("Ken", 'M', "012");
    Person ploy = new Person(null);
    Person may = new Person("May", 'F', "014");
    Person ann = new Person("Ann", 'F', "015");
    Person fon = new Person("Fon", 'F', "016");

    dome.name = "Dome";
    dome.gender = 'M';
    dome.setTelno("011");

    ploy.name = "Ploy";
    ploy.gender = 'F';
    ploy.setTelno("012");

    // dome.setFan(ploy);
    dome.setFan(ann);

    // System.out.println(dome.getPhone(ken));
    System.out.println(dome);
    System.out.println(dome.getFan(ploy));

    System.out.println();
    dome.getGig(may);
    dome.setGig(ann);
    dome.setGig(fon);
    dome.setGig(ken);

    System.out.println();
    dome.getGig(ploy);
    dome.getGig(fon);
    dome.getGig(ann);
    dome.getGig(may);

    System.out.println();
    // dome.removeGig(ann);
    dome.getGig(may);

    System.out.println();
    dome.getPersonInfo();

  }
}
