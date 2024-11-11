public class Method2 {
  public static void main(String[] args) {
    printf("Minee");
    int[] num = { 10, 35, 23, 5, 32, 53, 22 };
    int search = searchElement(num, 44);
    if (search!= -1) {
      System.out.println("Found is: " + search);
    } else {
      System.out.println("Not found");
    }
  }

  static void printf(String x) {
    System.out.println(x);
  }

  static int findMaxIndex(int[] arr) {
    int min = arr[0];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > min) {
        min = arr[i];
        index = i;
      }
    }
    return index;
  }

  static int[] copyArray(int[] x) {
    int[] newArr = new int[x.length];
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = x[i];
    }

    return newArr;
  }

  static int searchElement(int[] arr, int number) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == number) {
        return i;
      }
    }
    return -1;
  }
}
