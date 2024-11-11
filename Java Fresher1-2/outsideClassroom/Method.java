public class Method {
  public static void main(String[] args) {
    int[] numberA = { 58, 32, 87, 14, 77, 62, 53, 81, 21, 47, 18, 36, 11, 64, 49, 72, 93, 68, 55 };
    double[] price = {1.1, 2.2, 412.42, 12.1212};
    
    displayArray2(numberA);

  }

  // ********** Create method
  // static void display(String message) {
  // System.out.println(message);
  // }

  // static void display(int number) {
  // System.out.println(number);
  // }

  // static void display(String text, String message) {
  // System.out.println(text + message);
  // }

  // static void display(String text, int number) {
  // System.out.println(text + number);
  // }
  static void display(Object... args) {
    StringBuilder message = new StringBuilder();
    for (Object arg : args) {
      message.append(arg).append(" ");
    }
    System.out.println(message.toString().trim());
  }

  static int mpow(int number, int power) {
    int result = 1;
    for (int i = 0; i < power; i++) {
      result *= number;
    }
    return result;
  }

  static int mplus(int... nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  static void printf(String message) {
    System.out.print(message);
  }

  static void printf(int number) {
    System.out.print(number);
  }

  static void printf(String text, String message) {
    System.out.print(text + message);
  }

  static void printf(String text, int number) {
    System.out.print(text + number);
  }

  static void displayArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static void displayArray2(int[] arr) {
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("}");
  }

  static int findMaxArray(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
