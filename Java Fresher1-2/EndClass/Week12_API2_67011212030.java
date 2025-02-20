import java.util.Scanner;

public class Week12_API2_67011212030 {
  public static void main(String[] args) {
    Week12_API2_67011212030 obj = new Week12_API2_67011212030();
    String id = obj.input(">> ");
    String idCut = obj.cut(id);

    if (obj.check(idCut) && idCut.length() == 13) {
      int[] dataSplit = obj.split(idCut);
      int[] dataMultiply = obj.multiply(dataSplit);
      int sum = obj.sum(dataMultiply);
      int mod = obj.mod(sum);
      int minus = obj.minus(mod);
      boolean isValid = obj.compare(dataSplit, minus);
      System.out.println(isValid);
    } else {
      System.out.println("false");
    }
  }

  String input(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(message);
    return scanner.nextLine();
  }

  String cut(String data) {
    return data.replace("-", "").replace(" ", "");
  }

  boolean check(String data) {
    return data.matches("\\d+");
  }

  int[] split(String data) {
    int[] digits = new int[data.length()];
    for (int i = 0; i < data.length(); i++) {
      digits[i] = Character.getNumericValue(data.charAt(i));
    }
    return digits;
  }

  int[] multiply(int[] data) {
    int[] multiplied = new int[data.length - 1];
    for (int i = 0, weight = 13; i < data.length - 1; i++, weight--) {
      multiplied[i] = data[i] * weight;
    }
    return multiplied;
  }

  int sum(int[] data) {
    int sum = 0;
    for (int num : data) {
      sum += num;
    }
    return sum;
  }

  int mod(int data) {
    return data % 11;
  }

  int minus(int data) {
    int result = 11 - data;
    return (result >= 10) ? result - 10 : result;
  }

  boolean compare(int[] dataArr, int checkDigit) {
    return dataArr[12] == checkDigit;
  }
}
