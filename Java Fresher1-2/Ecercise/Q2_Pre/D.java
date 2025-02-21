import java.util.Scanner;

public class D {
  public static void main(String[] args) {
    D obj = new D();
    String data = obj.input(">> ");
    String num = obj.ASCII(data);
    obj.display(num); 
  }

  String input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    return input.nextLine();
  }

  void display(String data) {
    System.out.println(data);
  }

  String ASCII(String data) {
    if (data.matches("[A-Z ]+")) {
      String num = "";
      for (int i = 0; i < data.length(); i++) {
        if (Character.isLetter(data.charAt(i))) {
          num += (int) (data.charAt(i));
        } else {
          num += "+";
        }
      }
      return num;
    } else if (data.matches("[\\d+]+")) {
      String text = "";
      String[] dataSplit = data.split("\\+");
      for (int i = 0; i < dataSplit.length; i++) {
        String dataArr = dataSplit[i];
        for (int j = 0; j < dataArr.length(); j += 2) {
          text += (char) Integer.parseInt(dataArr.substring(j, j + 2));
        }
        text += " ";
      }
      return text;
    } else {
      return "Error";
    }
  } 
}
