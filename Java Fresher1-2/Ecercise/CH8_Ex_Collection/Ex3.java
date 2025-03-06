import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Ex3 obj = new Ex3();
    ArrayList<String> data = new ArrayList<String>();

    while (true) {
      obj.showMenu();
      obj.display(">>| ", data);
      String cmd = obj.input("Menu: ").toLowerCase();
      if (cmd.equals("f")) {
        obj.addFirst(data, obj.input("Add first: "));
      } else if (cmd.equals("l")) {
        obj.addLast(data, obj.input("Add last: "));
      } else if (cmd.equals("b")) {
        String addBeforeAt = obj.input("Add before at: ");
        if (data.contains(addBeforeAt)) {
          obj.addBefore(data, obj.input("Add Data: "), addBeforeAt);
        } else {
          obj.display("Data not found...");
        }
      } else if (cmd.equals("a")) {
        String addAfterAt = obj.input("Add After at: ");
        if (data.contains(addAfterAt)) {
          obj.addAfter(data, obj.input("Add Data"), addAfterAt);
        } else {
          obj.display("Data not found...");
        }
      } else if (cmd.equals("d")) {
        obj.deleteData(data, obj.input("Delete: "));
      } else if (cmd.equals("e")) {
        String editAt = obj.input("Edit At: ");
        if (data.contains(editAt)) {
          obj.editData(data, obj.input("Edit data: "), editAt);
        } else {
          obj.display("Data not found...");
        }
      } else if (cmd.equals("s")) {
        obj.searchData(data, obj.input("Search: "));
      } else if (cmd.equals("x")) {
        obj.display("Exit...");
        break;
      } else {
        obj.display("Menu not found...");
      }
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine().trim();
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

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  void addFirst(ArrayList<String> data, String addData) {
    data.addFirst(addData);
  }

  void addLast(ArrayList<String> data, String addData) {
    data.addLast(addData);
  }

  void addBefore(ArrayList<String> data, String addData, String addBeforeAt) {
    int indexAt = data.indexOf(addBeforeAt);
    data.add(indexAt, addData);
  }

  void addAfter(ArrayList<String> data, String addData, String addAfterAt) {
    int indexAt = data.indexOf(addAfterAt);
    data.add(indexAt + 1, addData);
  }

  void deleteData(ArrayList<String> data, String deleteData) {
    if (data.contains(deleteData)) {
      data.remove(deleteData);
    } else {
      System.out.println("Data not found...");
    }
  }

  void editData(ArrayList<String> data, String editData, String editAt) {
    if (data.contains(editAt)) {
      data.set(data.indexOf(editAt), editData);
    } else {
      System.out.println("Data not found...");
    }
  }

  void searchData(ArrayList<String> data, String searchData) {
    int amount = 0;
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i).contains(searchData)) {
        amount++;
      }
    }

    // long amount = data.stream().filter(item -> item.contains(searchData)).count();

    if (amount != 0) {
      System.out.println("Search found: " + amount);
    } else {
      System.out.println("Search not found...");
    }
  }
}
