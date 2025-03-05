import java.util.*;

public class Ex1 {
  
  public static void main(String[] args) {
    LinkedHashSet<String> user = new LinkedHashSet<String>();
    new Ex1().run(user);
  }

  private void run(LinkedHashSet<String> user) {
    while (true) {
      showMenu();
      display("\n", user);
      String usrInput = input("Menu: ").toLowerCase();
      if (usrInput.equals("a")) {
        add(user);
      } else if (usrInput.equals("d")) {
        delete(user);
      } else if (usrInput.equals("e")) {
        edit(user);
      } else if (usrInput.equals("s")) {
        search(user);
      } else if (usrInput.equals("x")) {
        display("Exit...");
        break;
      } else {
        display("Menu not found!");
      }
    }
  }

  private void showMenu() {
    System.out.println("[A] Add Data");
    System.out.println("[D] Delete Data");
    System.out.println("[E] Edit Data");
    System.out.println("[S] Search Data");
    System.out.println("[X] Exit...");
  }

  private void add(LinkedHashSet<String> user) {
    user.add(input("Add: "));
  }

  private void delete(LinkedHashSet<String> user) {
    String delete = input("Delete: ");
    if (user.contains(delete)) {
      user.remove(delete);
    } else {
      display("Delete not found");
    }
  }

  private void edit(LinkedHashSet<String> user) {
    String oldUser = input("Edit: ");
    if (user.remove(oldUser)) {
      user.add(input("Edit To: "));
    } else {
      display("User not found.");
    }
  }

  private void search(LinkedHashSet<String> user) {
    String search = input("Search: ");
    display(user.contains(search) ? search : "Search not found");
  }

  private String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine().trim();
  }

  private void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }
}
