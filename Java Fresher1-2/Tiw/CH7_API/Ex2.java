import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Ex2 obj = new Ex2();
    String data = obj.input(">> ");
    String swap = obj.swap(data); 
    int x = obj.compare(data, swap);
    obj.display(obj.palinedrome(data, x));
    // obj.display(obj.palinedrome(data, obj.compare(data, swap)));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    Ex2 obj = new Ex2();
    return input.next();
  }

  void display(String x) {
    System.out.println(x);
  }

  String swap(String data) {
    char[] letters = data.toCharArray();
    String reverse = "";
    for (int i = letters.length - 1; i >= 0; i--) {
      reverse += letters[i];
    }
    return reverse;
  }

  int compare(String data, String reverse) {
    int compare = data.compareTo(reverse);
    return compare;
  }

  String palinedrome(String data, int x) {
    if (x == 0) {
      for (int i = 0; i < data.length(); i++) {
        if (Character.isDigit(data.charAt(i)) == false) {
          return data + " Is String palindrome.";
        }
      }
      return data + " Is Numeric palindrome.";
    } else {
      return data + " Is not palindrome.";
    }
  }
}
