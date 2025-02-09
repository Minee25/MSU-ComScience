import java.util.Scanner;

public class InputArray {
  public static void main(String[] args) {
    Week10_Method1_67011212030 obj = new Week10_Method1_67011212030();
    int arr2[][] = new int[5][6];
    obj.printOut(arr2);
    System.out.println(); 
    obj.setO(arr2, obj.input("X: "), obj.input("Y: "), obj.input("Value: "));
    obj.printOut(arr2);
  }

  // int startG([][]) {

  // }

  void printOut(int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + ", ");
      }
      System.out.println();
    }
  }

  void setO(int arr[][], int indexX,int indexY, int value) {
    arr[indexX][indexY] = value;
  }
  
  int input(String x) {
    Scanner input = new Scanner(System.in);
    System.out.print(x);
    int usrInput = input.nextInt(); 
    return usrInput;
  }
}
