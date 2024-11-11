import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File2 {
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader(new File("Scorew.txt"));
      BufferedReader br = new BufferedReader(reader);
      int data;
      // while ((data = reader.read()) != -1) {
      //   // System.out.printf("%c", data);
      //   System.out.print((char) data);
      // }
      String message = "";
      while ((message = br.readLine()) != null) {
        System.out.println(message);
      }
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
