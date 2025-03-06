import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    LinkedList<String> data = new LinkedList<String>();

    while (true) {
      obj.showMenu();
      obj.showData(data);
      String menu = obj.input("Menu: ").toLowerCase();
      if (menu.equals("f")) {
        String addFirst = obj.input("Add First: ");
        obj.addFirst(data, addFirst);
      } else if (menu.equals("l")) {
        String addLast = obj.input("Add Last: ");
        obj.addLast(data, addLast);
      } else if (menu.equals("b")) {
        String location = obj.input("Location at: ");
        if (data.contains(location)) {
          String addBefore = obj.input("Add Before: ");
          obj.addBefore(data, location, addBefore);
        } else {
          System.out.println("Data not found!");
        }
      } else if (menu.equals("a")) {
        String location = obj.input("Location at: ");
        if (data.contains(location)) {
          String addAfter = obj.input("Add After: ");
          obj.addAfter(data, location, addAfter);
        } else {
          System.out.println("Data not found!");
        }
      } else if (menu.equals("d")) {
        String delete = obj.input("Delete: ");
        obj.deleteData(data, delete);
      } else if (menu.equals("e")) {
        String editAt = obj.input("Edit At: ");
        if (data.contains(editAt)) {
          String editTo = obj.input("Edit To: ");
          obj.editData(data, editAt, editTo);
        } else {
          System.out.println("Data not found!");
        }
      } else if (menu.equals("s")) {
        String search = obj.input("Search: ");
        obj.searchData(data, search);
      } else if (menu.equals("x")) {
        System.out.println("Exit...");
        break;
      } else {
        System.out.println("Menu not found");
      }
    }
  }

  void showData(LinkedList<String> data) {
    System.out.print(">>| ");
    for (int i = 0; i < data.size(); i++) {
      System.out.print(data.get(i) + " ");
    }
    System.out.println("|<<");
  }

  void showMenu() {
    System.out.println("[F] Add First");
    System.out.println("[L] Add Last");
    System.out.println("[B] Add Before");
    System.out.println("[A] Add After");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search data");
    System.out.println("[X] Exit ...");
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine().trim();
  }

  void addFirst(LinkedList<String> data, String addData) {
    data.addFirst(addData);
  }

  void addLast(LinkedList<String> data, String addData) {
    data.addLast(addData);
  }

  void addBefore(LinkedList<String> data, String location, String addData) {
    int index = data.indexOf(location);
    data.add(index, addData);
  }

  void addAfter(LinkedList<String> data, String location, String addData) {
    int index = data.indexOf(location);
    data.add(index + 1, addData);
  }

  void deleteData(LinkedList<String> data, String deleteData) {
    if (data.contains(deleteData)) {
      data.remove(deleteData);
    } else {
      System.out.println("Data not found!");
    }
  }

  void editData(LinkedList<String> data, String editAt, String editTo) {
    int index = data.indexOf(editAt);
    data.set(index, editTo);
  }

  void searchData(LinkedList<String> data, String search) {
    int amount = 0;
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i).contains(search)) {
        amount++;
      }
    }

    if (amount <= 0) {
      System.out.println("Not found!");
    } else {
      System.out.println(amount);
    }
  }
}