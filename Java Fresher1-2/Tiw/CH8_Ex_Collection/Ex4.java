import java.util.Vector;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Ex4 obj = new Ex4();
    Vector<Double> score = new Vector<Double>();
    while (true) {
      obj.display(score);
      char menu = obj.inputMenu("Menu: ");
      if (menu == 'f') {
        obj.display(obj.addFirst(score));
      } else if (menu == 'l') {
        obj.display(obj.addLast(score));
      } else if (menu == 'b') {
        obj.display(obj.addBefore(score));
      } else if (menu == 'a') {
        obj.display(obj.addAfter(score));
      } else if (menu == 'd') {
        obj.display(obj.deleteData(score));
      } else if (menu == 'e') {
        obj.display(obj.editData(score));
      } else if (menu == 's') {
        obj.display(obj.searchData(score));
      } else if (menu == 'x') {
        obj.display("Exit...");
        break;
      } else {
        obj.display("Menu not found.");
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

  void display(Vector<Double> score) {
    System.out.print("\u001B[32m");
    for (int i = 0; i < score.size(); i++) {
      System.out.print(score.get(i) + "\t");
    }
    System.out.println("\u001B[0m");
  }

  double input(String prompt) {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print(prompt);
        return input.nextDouble();
      } catch (InputMismatchException err) {
        System.out.println(err);
      }
    }
  }

  char inputMenu(String prompt) {
    while (true) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print(prompt);
        return input.next().toLowerCase().charAt(0);
      } catch (Exception err) {
        System.out.println(err);
      }
    }
  }

  String addFirst(Vector<Double> score) {
    Double addScore = input("Add first: ");
    score.addFirst(addScore);
    return "Data add successfully";
  }

  String addLast(Vector<Double> score) {
    score.addLast(input("Add Last: "));
    return "Data add successfully";
  }

  String addBefore(Vector<Double> score) {
    Double addBefore = input("Location: ");
    int index = score.indexOf(addBefore);
    if (score.contains(addBefore)) {
      Double addScore = input("Add Score: ");
      score.add(index, addScore);
      return "Data add successfully.";
    } else {
      return "No Have";
    }
  }

  String addAfter(Vector<Double> score) {
    Double addBefore = input("Location: ");
    int index = score.indexOf(addBefore);
    if (score.contains(addBefore)) {
      Double addScore = input("Add Score: ");
      score.add(index + 1, addScore);
      return "Data add successfully.";
    } else {
      return "No Have";
    }
  }

  String deleteData(Vector<Double> score) {
    Double delete = input("Delete: ");
    if (score.contains(delete)) {
      score.remove(delete);
      return "Delete succfully.";
    } else {
      return "No Have";
    }
  }

  String editData(Vector<Double> score) {
    Double editAt = input("Edit At: ");
    if (score.contains(editAt)) {
      score.set(score.indexOf(editAt), input("Edit to: "));
      return "Edit successfully";
    } else {
      return "Edit not foud.";
    }
  }

  String searchData(Vector<Double> score) {
    double searchData = input("Search: ");
    int amount = 0;
    for (int i = 0; i < score.size(); i++) { 
      if (score.get(i) == searchData) {
        amount++;
      }
    }

    if (amount == 0) {
      return "Search not found.";
    } else {
      return "Search found " + amount;
    }
  }
}
