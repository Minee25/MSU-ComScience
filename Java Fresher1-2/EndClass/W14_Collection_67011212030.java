import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class W14_Collection_67011212030 {
  public static void main(String[] args) {
    W14_Collection_67011212030 obj = new W14_Collection_67011212030();

    HashMap<Integer, String> uid = new HashMap<Integer, String>();
    HashMap<Integer, Integer> score = new HashMap<Integer, Integer>();
    HashMap<Integer, String> grade = new HashMap<Integer, String>();

    while (true) {
      obj.showMenu();
      obj.showUser(uid, score, grade);
      String menu = obj.input("Menu: ").trim().toLowerCase();
      if (menu.equals("x")) {
        System.out.println("Exit...");
        break;
      } else if (menu.equals("a")) {
        uid.put(uid.size(), obj.input("UID: "));
        while (true) {
          try {
            int scoreInput = obj.inputScore("Score: ");
            score.put(uid.size(), scoreInput);
            grade.put(uid.size(), obj.calGrade(scoreInput));
            break;
          } catch (InputMismatchException err) {
            obj.display("Please number!");
            obj.display(err);
          }
        }
      } else if (menu.equals("d")) {
        while (true) {
          String deleteUid = obj.input("UID: ");
          Integer targetKey = null;
          for (Map.Entry<Integer, String> entry : uid.entrySet()) {
            if (entry.getValue().equals(deleteUid)) {
              targetKey = entry.getKey();
              break;
            }
          }

          if (targetKey != null) {
            uid.remove(targetKey);
            score.remove(targetKey);
            grade.remove(targetKey);
            break;
          } else {
            obj.display("UID Not found! please try again");
          }
        }
      } else if (menu.equals("e")) {

        while (true) {
          String editUid = obj.input("UID: ");
          Integer targetKey = null;
          for (Map.Entry<Integer, String> entry : uid.entrySet()) {
            if (entry.getValue().equals(editUid)) {
              targetKey = entry.getKey();
              break;
            }
          }

          if (targetKey != null) {
            uid.replace(targetKey, obj.input("New UID: "));
            while (true) {
              try {
                int newScore = obj.inputScore("New Score: ");
                score.replace(targetKey + 1, newScore);
                grade.replace(targetKey + 1, obj.calGrade(newScore));
                break;
              } catch (InputMismatchException err) {
                obj.display("Please number!");
                obj.display(err);
              }
            }
            break;
          } else {
            obj.display("UID Not found! please try again");
          }
        }
      } else if (menu.equals("s")) {
        while (true) {
          String searchUid = obj.input("UID: ");
          Integer targetKey = null;
          for (Map.Entry<Integer, String> entry : uid.entrySet()) {
            if (entry.getValue().equals(searchUid)) {
              targetKey = entry.getKey();
              break;
            }
          }

          if (targetKey != null) {
            obj.display(uid.get(targetKey) + " " + score.get(targetKey + 1) + " " + grade.get(targetKey + 1));
            break;
          } else {
            obj.display("UID Not found! please try again");
          }
        }
      } else {
        obj.display("Menu not found!");
      }
    }
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object item : args) {
      output.append(item);
    }
    System.out.println(output.toString());
  }

  void showUser(HashMap<Integer, String> id, HashMap<Integer, Integer> score, HashMap<Integer, String> grade) {
    Iterator<Integer> ittId = id.keySet().iterator();
    Iterator<Integer> ittSetScore = score.keySet().iterator();
    Iterator<Integer> ittSetGrade = grade.keySet().iterator();
    System.out.println();
    if (!id.isEmpty()) {
      System.out.println("\u001B[32m--------------------");
      while (ittId.hasNext()) {
        int keyId = ittId.next();
        int keyScore = ittSetScore.next();
        int keyGrade = ittSetGrade.next();
        System.out.println(id.get(keyId) + " " + score.get(keyScore) + " " + grade.get(keyGrade));
      }
      System.out.println("--------------------\u001B[0m");
    }
  }

  void showMenu() {
    System.out.println("\u001B[33m[A] Add data");
    System.out.println("[D] Delete data");
    System.out.println("[E] Edit data");
    System.out.println("[S] Search data");
    System.out.println("[X] Exit...\u001B[0m");
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  int inputScore(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextInt();
  }

  String calGrade(int score) {
    if (score >= 80) {
      return "A";
    } else if (score >= 75) {
      return "B+";
    } else if (score >= 70) {
      return "B";
    } else if (score >= 65) {
      return "C+";
    } else if (score >= 60) {
      return "C";
    } else if (score >= 55) {
      return "D+";
    } else if (score >= 50) {
      return "D";
    } else {
      return "F";
    }
  }
}