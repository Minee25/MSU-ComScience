public class Person {
  String name;
  char gender;
  String telno;
  Person fan;

  Person(String name) {
    this.name = name;
    gender = 'F';
    telno = "0998887777";
    fan = null;
  }

  Person(String name, char gender, String telno, Person fan) {
    this.name = name;
    this.gender = gender;
    this.telno = telno;
    this.fan = fan;
  } 
}
