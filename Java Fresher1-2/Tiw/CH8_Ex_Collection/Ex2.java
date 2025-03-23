import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Ex2 obj = new Ex2();
    LinkedList<String> data = new LinkedList<String>();

    while (true) {
      obj.showMenu();
      obj.showData(data);
      String menu = obj.input("Menu: ");

      if (menu.equalsIgnoreCase("x")) {
        System.out.println("Exit...");
        break;
      } else if (menu.equalsIgnoreCase("f")) {
        String addFirst = obj.input("Add First: ");
        obj.addFirst(data, addFirst);
      } else if (menu.equalsIgnoreCase("l")) {
        String addLast = obj.input("Add Last: ");
        obj.addLast(data, addLast);
      } else if (menu.equalsIgnoreCase("b")) {
        String addBeforeAt = obj.input("Add Before At: ");
        if (data.contains(addBeforeAt)) {
          String addData = obj.input("Add Data: ");
          obj.addBefore(data, addBeforeAt, addData);
        } else {
          System.out.println("Data not found!");
        }
      } else if (menu.equalsIgnoreCase("a")) {
        String addAfterAt = obj.input("Add After At: ");
        if (data.contains(addAfterAt)) {
          String addData = obj.input("Add Data: ");
          obj.addAfter(data, addAfterAt, addData);
        } else {
          System.out.println("Data not found!");
        }
      } else if (menu.equalsIgnoreCase("d")) {
        String deleteData = obj.input("Delete Data: ");
        obj.deleteData(data, deleteData);
      } else if (menu.equalsIgnoreCase("e")) {
        String editAt = obj.input("Edit At: ");
        if (data.contains(editAt)) {
          String editTo = obj.input("Edit To: ");
          obj.editData(data, editAt, editTo);
        } else {
          System.out.println("Edit not found!");
        }
      } else if (menu.equalsIgnoreCase("s")) {
        String searchData = obj.input("Search Data: ");
        obj.searchData(data, searchData);
      } else {
        System.out.println("Menu not found!");
      }
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  void showMenu() {
    System.out.println("[F] Add First");
    System.out.println("[L] Add Last");
    System.out.println("[B] Add Before");
    System.out.println("[A] Add After");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search data)");
    System.out.println("[X] Exit...");
  }

  void showData(LinkedList<String> data) {
    Iterator<String> itt = data.iterator();
    System.out.print("-->> ");
    while (itt.hasNext()) {
      System.out.print(itt.next() + ", ");
    }
    System.out.println();
  }

  void addFirst(LinkedList<String> data, String addFirst) {
    data.addFirst(addFirst);
  }

  void addLast(LinkedList<String> data, String addLast) {
    data.addLast(addLast);
  }

  void addBefore(LinkedList<String> data, String addBeforeAt, String addData) {
    data.add(data.indexOf(addBeforeAt), addData);
  }

  void addAfter(LinkedList<String> data, String addBeforeAt, String addData) {
    data.add(data.indexOf(addBeforeAt) + 1, addData);
  }

  void deleteData(LinkedList<String> data, String deleteData) {
    if (data.contains(deleteData)) {
      data.remove(deleteData);
    } else {
      System.out.println("Delete Not Found!");
    }
  }

  void editData(LinkedList<String> data, String deleteAt, String deleteTo) {
    data.set(data.indexOf(deleteAt), deleteTo);
  }

  void searchData(LinkedList<String> data, String searchData) {
    // if (data.contains(searchData)) {
    // int amount = 0;
    // for (int i = 0; i < data.size(); i++) {
    // if (data.get(i).contains(searchData)) {
    // amount++;
    // }
    // }
    // System.out.println("Search found = " + amount);
    // } else {
    // System.out.println("Search data not found!");
    // }

    int amount = Collections.frequency(data, searchData);
    if (amount > 0) {
      System.out.println("Search found = " + amount);
    } else {
      System.out.println("Search data not found!");
    }
  }
}
