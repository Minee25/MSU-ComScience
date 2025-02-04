import java.util.Scanner;

public class W7_ArrayLength {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
         
        int[][] result = getKeyValuePairs(arr);
         
        for (int[] pair : result) {
            System.out.println("Key (Index): " + pair[0] + ", Value: " + pair[1]);
        } 
    }

    
    public static int[][] getKeyValuePairs(int[] arr) {
        int[][] keyValuePairs = new int[arr.length][2]; // Array to hold key-value pairs
        
        for (int k = 0; k < arr.length; k++) {
            keyValuePairs[k][0] = k;      // Store index as the key
            keyValuePairs[k][1] = arr[k]; // Store value
        }
        
        return keyValuePairs;
    }
}
