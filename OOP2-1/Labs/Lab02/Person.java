public class Person {
  public String name;
  public char gender;
  private String telno;
  public Person fan;
  private Person gig[] = new Person[2];

  // Contructor
  Person(String name) {
    this.name = name;
    this.gender = 'M';
    this.telno = "099";
    this.fan = null;
  }

  Person(String name, char gender, String telno) {
    this.name = name;
    this.gender = gender;
    this.telno = telno;
  }

  // Setter
  void setTelno(String telno) {
    this.telno = telno;
  }

  void setFan(Person fan) {
    if (this.fan != null) {
      System.out.println("เปลี่ยนแฟนตอนนี้ไม่ได้นะ");
      return;
    }

    if (fan.gender == this.gender) {
      System.out.println("เดี๋ยวฟ้าผ่า!!! เป็นแฟนกันไม่ได้นะ");
      return;
    }
    this.fan = fan;
  }

  void setGig(Person request) {
    for (int i = 0; i < gig.length; i++) {
      if (gig[i] == null) {
        gig[i] = request;
        return;
      }
    }
    System.out.println("แค่ 2 คนพอแล้ว ดูและไม่ไหว");
  }

  // Getter
  String getPhone(Person gender) {
    if (gender.gender != this.gender) {
      return telno;
    }
    return "ม่ายบอก";
  }

  String getFan(Person person) {
    if (person.fan == this.fan) {
      return "สุดที่รักไงละจ๊ะ";
    }
    return "ยังไม่มีแฟนจ้า";
  }

  void getGig(Person request) {
    if (request.gender == this.gender) {
      for (int i = 0; i < gig.length; i++) {
        System.out.println((i + 1) + " " + gig[i]);
      }
    } else {
      System.out.println("ไม่มีกิ๊กซักคนเลย");
    }
  }

  // overloading
  public void removeGig() {
    for (int i = 0; i < gig.length; i++) {
      gig[i] = null;
    }
  }

  public void removed(Person request) {
    for (int i = 0; i < gig.length; i++) {
      if (gig[i] == request) {
        gig[i] = null;
      }
    }
  }

  public void getPersonInfo() {
    String genderString = "";
    if (this.gender == 'M') {
      genderString = "Male";
    } else {
      genderString = "Female";
    }
    System.out.println("Name: " + this.name +
                      "\nGender : " + genderString + 
                      "\nNumber PHone : " + this.telno + 
                      "\nFan : " + this.fan.name + 
                      "\nGig1 : " + this.gig[0].name + 
                      "\nGig2 : " + this.gig[1].name
                      );    
  }

  public String toString() {
    return name;
  }
}
