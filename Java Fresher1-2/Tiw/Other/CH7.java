import java.util.Scanner;

public class CH7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    CH7 obj = new CH7();
    System.out.print(">> ");
    String text = input.nextLine();

    obj.display("Numeric: ", obj.numeric(text));
    obj.display("Lowercase: ", obj.lowercase(text));
    obj.display("Uppercase: ", obj.uppercase(text));
    obj.display("Words: ", obj.words(text));
    System.out.println("---------------------");
    obj.display(obj.swapLowerCaseAndUpperCase(text));
    System.out.println("---------------------");
    obj.display(obj.capitalization(text));
  }

  void display(String x, int num) {
    System.out.println(x + num);
  }

  void display(String x) {
    System.out.println(x);
  }

  int numeric(String x) {
    int numeric = 0;
    // isDigit()
    for (int i = 0; i < x.length(); i++) {
      if (Character.isDigit(x.charAt(i))) {
        numeric++;
      }
    }
    return numeric;
  }

  int lowercase(String x) {
    int lowercase = 0;
    for (int i = 0; i < x.length(); i++) {
      if (Character.isLowerCase(x.charAt(i))) {
        lowercase++;
      }
    }
    return lowercase;
  }

  int uppercase(String x) {
    int uppercase = 0;
    for (int i = 0; i < x.length(); i++) {
      if (Character.isUpperCase(x.charAt(i))) {
        uppercase++;
      }
    }
    return uppercase;
  }

  int words(String x) {
    int words = 0;
    words = x.split(" ").length;
    return words;
  }

  String swapLowerCaseAndUpperCase(String x) {
    String textSwap = "";
    for (int i = 0; i < x.length(); i++) {
      if (Character.isLowerCase(x.charAt(i))) {
        textSwap += Character.toUpperCase(x.charAt(i));
      } else {
        textSwap += Character.toLowerCase(x.charAt(i));
      }
    }
    return textSwap;
  }

  String capitalization(String x) {
    String[] wordSplits = x.trim().split(" ");
    String wordCapitalization = "";
    for (int i = 0; i < wordSplits.length; i++) {
      wordCapitalization += wordSplits[i].substring(0, 1).toUpperCase() + wordSplits[i].substring(1);
    }
    return wordCapitalization;
  }
}