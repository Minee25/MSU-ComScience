import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Ex4 obj = new Ex4();
    String data = obj.input("Input: ");
    obj.display(obj.capitalization(data));
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String x) {
    System.out.println(x);
  }

  String capitalization(String data) {
    String[] wordSplits = data.split(" ");
    StringBuilder wordCapitalization = new StringBuilder();

    // String wordCapitalization = "";
    // for (int i = 0; i < wordSplits.length; i++) {
    // wordCapitalization += wordSplits[i].substring(0, 1).toUpperCase() +
    // wordSplits[i].substring(1) + " ";
    // }

    for (int i = 0; i < wordSplits.length; i++) {
      if (!wordSplits[i].isEmpty()) { // ป้องกัน error หากมีช่องว่างเกินมา
        wordCapitalization.append(Character.toUpperCase(wordSplits[i].charAt(0))) // ตัวแรกเป็นตัวพิมพ์ใหญ่
                          .append(wordSplits[i].substring(1)) // ที่เหลือคงเดิม
                          .append(" ");
      }
    }
    return wordCapitalization.toString().trim();
  }
}
