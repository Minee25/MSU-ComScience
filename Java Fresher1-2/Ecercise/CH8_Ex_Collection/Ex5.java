import java.util.LinkedList;
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Ex5 obj = new Ex5();
    LinkedList<String> user = new LinkedList<String>();

    while (true) {
      obj.showMenu();
      obj.showUser(user);
      String cmd = obj.input("CMD: ").toLowerCase();
      if (cmd.equals("a")) {
        String add = obj.input("Add: ");
        obj.addData(user, add);
      } else if (cmd.equals("d")) {
        String delete = obj.input("Delete: ");
        obj.deleteData(user, delete);
      } else if (cmd.equals("e")) {
        String editAt = obj.input("Edit At: ");
        if (user.contains(editAt)) {
          String editTo = obj.input("Edit To: ");
          obj.editData(user, editAt, editTo);
        } else {
          obj.display("Not Found user!");
        }
      } else if (cmd.equals("s")) {
        String search = obj.input("Search: ");
        obj.searhData(user, search);
      } else if (cmd.equals("x")) {
        obj.display("Exit...");
        break;
      }
    }
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  void showUser(LinkedList<String> data) {
    System.out.println("-");
    for (String string : data) {
      System.out.println(string);
    }
    System.out.println("-");
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine().trim();
  }

  void showMenu() {
    System.out.println();
    System.out.println("[A] Add data");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search");
    System.out.println("[X] Exit");
  }

  void addData(LinkedList<String> data, String addData) {
    if (data.contains(addData)) {
      System.out.println("Data aready add");
    } else {
      data.add(addData);
    }
  }

  void deleteData(LinkedList<String> data, String deleteData) {
    if (data.contains(deleteData)) {
      data.remove(deleteData);
    } else {
      System.out.println("Not found user!");
    }
  }

  void editData(LinkedList<String> data, String editAt, String editTo) {
    if (data.contains(editAt)) {
      data.remove(editAt);
      data.add(editTo);
    } else {
      System.out.println("Not found user!");
    }
  }

  void searhData(LinkedList<String> data, String search) {
    if (data.contains(search)) {
      System.out.println(search);
    } else {
      System.out.println("Not Found user!");
    }
  }
}