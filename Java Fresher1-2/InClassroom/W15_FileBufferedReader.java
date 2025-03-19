import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class W15_FileBufferedReader {
  public static void main(String[] args) {
    String txtFileRead = "";
    try {
      String fileName = "W15_f1.txt";
      BufferedReader buff = new BufferedReader(new FileReader(fileName));
      while (true) {
        String x = buff.readLine();
        if (x.equals("null")) {
          break;
        } 
        txtFileRead += x + " ";
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }  catch (NullPointerException e) {
      System.out.println(e);
    }
    System.out.println(txtFileRead);
  }
}
