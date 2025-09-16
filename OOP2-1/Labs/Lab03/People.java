public class People {
  public String name;
  public char gender;
  private String workplace;

  People(String name, char gender) {
    this.name = name;
    this.gender = gender;
  }

  People(String name, char gender, String workplace) {
    this(name, gender);
    this.workplace = workplace;
  }

  public String getWorkplace() {
    return this.workplace;
  }

  @Override
  public String toString() {
    return this.name;
  }
}

class Children extends People implements GoodChild {
  private People father;
  private People mother;
  private String school;

  public Children(String name, char gender, People father, People mother) {
    super(name, gender);
    this.father = father;
    this.mother = mother;
  }

  public Children(String name, char gender, String school, People father, People mother) {
    this(name, gender, father, mother);
    this.school = school;
  }

  @Override
  public String toString() {
    if (this.gender == 'M') {
      return this.name + " (Boy)";
    } else {
      return this.name + " (Girl)";
    }
  }

  // getter
  public People getFather() {
    return father;
  }

  public People getMother() {
    return mother;
  }

  @Override
  public String getWorkplace() {
    return "I'm studying at " + this.school;
  }

  // setter
  public void setFahter(People father) {
    this.father = father;
  }

  private void setMother(People mother) {
    this.mother = mother;
  }

  @Override
  public boolean equals(Object requester) {
    if (this.mother != (People) requester) {
      return false;
    }
    return true;
  }

  @Override
  public String respectTo(People people) {
    String who = "";
    if (this.father == people) {
      who = "Father";
    } else if (this.mother == people) {
      who = "Mother";
    }

    if (this.gender == 'M') {
      return "Sawasdee Krub " + who;
    } else if (this.gender == 'F') {
      return "Sawasdee Ka " + who;
    } else {
      return "Sawassdee Ja " + who;
    }
  }
}

interface GoodChild {
  String respectTo(People people);

}