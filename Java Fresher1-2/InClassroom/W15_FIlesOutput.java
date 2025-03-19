import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class W15_FIlesOutput {
  public static void main(String[] args) {
    String fileName = "W15_F11.txt";
    try {
      FileOutputStream fileOut = new FileOutputStream(fileName);
      while (true) {
        int usrInput = System.in.read();
        if (usrInput == -1) {
          break;
        }
        fileOut.write(usrInput);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
