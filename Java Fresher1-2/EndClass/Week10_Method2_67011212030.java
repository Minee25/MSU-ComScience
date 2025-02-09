import java.util.Scanner;

public class Week10_Method2_67011212030 {
  public static void main(String[] args) {
    Week10_Method2_67011212030 obj = new Week10_Method2_67011212030();
    Scanner input = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    System.out.print("N: ");
    int n = input.nextInt();
    String board[][] = new String[n][n];

    while (true) {
      obj.showBoard(board);
      System.out.print("O/X: ");
      String turn = inputStr.nextLine().toLowerCase();
      if (turn.equals("e")) {
        break;
      }
      obj.insertBoard(board, turn, obj.inputLocation("X: "), obj.inputLocation("Y: "));
    }
  }

  void showBoard(String x[][]) {
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        if (x[i][j] == null) {
          System.out.print("-\t");
        } else {
          System.out.print(x[i][j] + "\t");
        }
      }
      System.out.println();
    }
  }

  void insertBoard(String arr[][], String turn, int indexX, int indexY) {
    if (turn.equals("o")) {
      if (arr[indexY][indexX] == null || arr[indexY][indexX].equals("null")) {
        arr[indexY][indexX] = turn;
      } else {
        System.out.println("Please Try again!");
      }
    } else if (turn.equals("x")) {
      if (arr[indexY][indexX] == null || arr[indexY][indexX].equals("null")) {
        arr[indexY][indexX] = turn;
      } else {
        System.out.println("Please Try again!");
      }
    } else if (turn.equals("E")) {
    }
  }

  String inputTurn(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    String usrInput = input.nextLine();
    return usrInput;
  }

  int inputLocation(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    int usrInput = input.nextInt();
    return usrInput;
  }
}