import java.util.Scanner;

public class C_A {
  public static void main(String[] args) {
    C_A obj = new C_A();
    String data = obj.input(">> ");
    obj.display(obj.sampleOutput(data));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String[][] data) {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        System.out.print(data[i][j] + "\t");
      }
      System.out.println();
    }
  }

  String[][] sampleOutput(String data) {
    String[] pairs = data.split("/");
    String[][] sampleOutput = new String[pairs.length][2];

    for (int i = 0; i < pairs.length; i++) {
      String[] numbers = pairs[i].split(",");
      if (numbers.length == 2) {
        sampleOutput[i][0] = numbers[0];
        sampleOutput[i][1] = numbers[1];
      }
    }
    return sampleOutput;
  }
}
