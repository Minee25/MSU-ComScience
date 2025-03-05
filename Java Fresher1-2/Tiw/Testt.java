import java.util.Scanner;

public class Testt {
  public static void main(String[] args) {
    Testt opj = new Testt();
    String input = opj.scan("input something : ");
    String InToOut = opj.InputToOutput(input);
    String OutToIn = opj.OutputToInput(input); 
    opj.printMet("Output to Input : " + OutToIn);
  }

  String scan(String promt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(promt);
    return sc.nextLine();
  }

  String InputToOutput(String input) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == ' ') {
        result += "+";
      } else {
        result += (int) ch;
      }
    }
    return result;
  }

  String OutputToInput(String InToOut) {
    return InToOut;
  }

  void printMet(String result) {
    System.out.println(result);
  }
}