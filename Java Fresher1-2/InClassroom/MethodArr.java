public class MethodArr {
  public static void main(String[] args) {
    MethodArr obj = new MethodArr();
    int x[] = { 1, 2, 3, 4, 5, 6, 43 };  
    obj.setArr(x, 4, 888) ;
    obj.pArr(x);
  }

  void pArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
  }

  int[] setArr(int x[], int index, int number) {
    x[index] = number;
    return x;
  }
}