import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Ex1 obj = new Ex1();
    HashSet<Integer> data = new HashSet<Integer>();

    while (true) {
      obj.showMenu();
      obj.showData(data);
      String menu = obj.input("Menu: ");
      if (menu.equalsIgnoreCase("x")) {
        System.out.println("Exit...");
        break;
      } else if (menu.equalsIgnoreCase("a")) {
        int addData = obj.inputNum("Add Data: ");
        obj.addData(data, addData);
      } else if (menu.equalsIgnoreCase("d")) {
        int deleteData = obj.inputNum("Delete Data: ");
        obj.deleteData(data, deleteData);
      } else if (menu.equalsIgnoreCase("e")) {
        int location = obj.inputNum("Location: ");
        if (data.contains(location)) {
          int edit = obj.inputNum("Edit to: ");
          obj.editData(data, location, edit);
        } else {
          System.out.println("Edit not found.");
        }
      } else if (menu.equalsIgnoreCase("s")) {
        int searchData = obj.inputNum("Search Data: ");
        obj.searchData(data, searchData);
      } else {
        System.out.println("Menu not found.");
      }
    }
  }

  void showData(HashSet<Integer> data) {
    Iterator<Integer> itt = data.iterator();
    System.out.print("->> ");
    while (itt.hasNext()) {
      System.out.print(itt.next() + ", ");
    }
    System.out.println();

    // for (Integer integer : data) {
    // System.out.print(integer + " ");
    // }

    // data.forEach(value -> System.out.print(value + " "));
  }

  void showMenu() {
    System.out.println("[A] Add data");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search data");
    System.out.println("[X] Exit...");
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  int inputNum(String prompt) {
    while (true) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
      } catch (InputMismatchException e) {
        System.out.println(e);
        System.out.println("Please a number!");
      }
    }
  }

  void addData(HashSet<Integer> data, int addData) {
    data.add(addData);
  }

  void deleteData(HashSet<Integer> data, int deleteData) {
    if (data.contains(deleteData)) {
      data.remove(deleteData);
    } else {
      System.out.println("Delete Data not found!");
    }
  }

  void editData(HashSet<Integer> data, int location, int edit) {
    data.remove(location);
    data.add(edit);
  }

  void searchData(HashSet<Integer> data, int searchData) {
    if (data.contains(searchData)) {
      System.out.println(searchData);
    } else {
      System.out.println("Search not found!");
    }
  }
} 