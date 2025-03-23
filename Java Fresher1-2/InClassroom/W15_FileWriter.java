import java.io.FileWriter;
import java.io.IOException;

public class W15_FileWriter {
  public static void main(String[] args) {
    String fileName = "W15_f16.txt";
    try {
      String txt = "";
      while (true) {
        int x = System.in.read();
        if (x == -1) {
          break;
        }
        txt += (char) x;
      }
      FileWriter fileWriter = new FileWriter(fileName, true);
      fileWriter.write(txt);
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
