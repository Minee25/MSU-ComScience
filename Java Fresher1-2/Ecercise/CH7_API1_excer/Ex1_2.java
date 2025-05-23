public class Ex1_2 {
  public static void main(String[] args) {
    Ex1_2 obj = new Ex1_2();
    String word = "You Character.isLetterOrDigit(word.charAt(i)).";

    obj.display("Numeric: ", obj.isdigit(word));
    obj.display("LowerCase: ", obj.lowerCase(word));
    obj.display("UpperCase: ", obj.upperCase(word));
    obj.display("Words: ", obj.word(word));
    obj.display("Symbol: ", obj.symbol(word));
    obj.display("--------------------");
    obj.display(obj.swapUppCaseAndLowerCase(word));
    obj.display("--------------------");
    obj.display(obj.capitalize(word));
  }

  // Other Method

  void display(Object... args) {
    StringBuilder message = new StringBuilder();
    for (Object arg : args) {
      message.append(arg);
    }
    System.out.println(message.toString().trim());
  }

  int lowerCase(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
      if (Character.isLowerCase(word.charAt(i))) {
        sum++;
      }
    }
    return sum;
  }

  int upperCase(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
      if (Character.isUpperCase(word.charAt(i))) {
        sum++;
      }
    }
    return sum;
  }

  int isdigit(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
      if (Character.isDigit(word.charAt(i))) {
        sum++;
      }
    }
    return sum;
  }

  int word(String word) {
    String[] space = word.trim().split(" ");
    return space.length;
  }

  String swapUppCaseAndLowerCase(String word) {
    String wordSwap = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == ' ') {
        wordSwap += ' ';
      } else if (Character.isLowerCase(word.charAt(i))) {
        wordSwap += String.valueOf(word.charAt(i)).toUpperCase();
      } else if (Character.isUpperCase(word.charAt(i))) {
        wordSwap += String.valueOf(word.charAt(i)).toLowerCase();
      } else if (Character.isDigit(word.charAt(i))) {
        wordSwap += word.charAt(i);
      }
    }
    return wordSwap;
  }

  String capitalize(String word) {
    String[] wordSplit = word.trim().split(" ");
    String wordCapitalize = "";
    for (int i = 0; i < wordSplit.length; i++) {
      wordCapitalize += wordSplit[i].substring(0, 1).toUpperCase() + wordSplit[i].substring(1);
    }
    return wordCapitalize;
  }

  int symbol(String word) {
    String word2 = word.replace(" ", "");
    int symbol = 0;
    for (int i = 0; i < word2.length(); i++) {
      if (!Character.isLetterOrDigit(word2.charAt(i))) {
        symbol++;
      }
    }
    return symbol;
  }
}
