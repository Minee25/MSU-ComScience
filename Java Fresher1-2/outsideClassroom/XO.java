import java.util.Scanner;

public class XO {
  public static void main(String[] args) {
    XO obj = new XO();
    String board[][] = obj.inputN("N: ");

    while (true) {
      obj.showBoard(board);
      String turn = obj.inputTurn("Turn: ");
      int x = obj.inputLocation("X: ");
      int y = obj.inputLocation("Y: ");
      if (turn.equals("e")) {
        break;
      }
      if (x >= board.length || y >= board.length) {
        System.out.println("Out of board!!!");
        continue;
      }
      obj.insertBoard(board, turn, x, y);
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

  void insertBoard(String arr[][], String turn, int x, int y) {
    if (turn.equals("o")) {
      if (arr[y][x] == null || arr[y][x].equals("null")) {
        arr[y][x] = turn;
      } else {
        System.out.println("Please Try again!");
      }
    } else if (turn.equals("x")) {
      if (arr[y][x] == null || arr[y][x].equals("null")) {
        arr[y][x] = turn;
      } else {
        System.out.println("Please Try again!");
      }
    } else if (turn.equals("e")) {

    }
  }

  String[][] inputN(String x) {
    Scanner input = new Scanner(System.in); 
    System.out.print(x);
    int n = input.nextInt();
    String board[][] = new String[n][n];
    return board;
  }

  String inputTurn(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    String turn = String.valueOf(input.nextLine().trim().charAt(0)).toLowerCase();
    return turn;
  }

  int inputLocation(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    int location = input.nextInt();
    return location;
  }
}
