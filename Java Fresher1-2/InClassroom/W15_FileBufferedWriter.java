import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class W15_FileBufferedWriter {
  public static void main(String[] args) {
    try {
      String fileName = "W15_F16.xls"; // .doc .xls
      PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
      String txt = "NAME\tSCORE\tGRADE";
      printWriter.write(txt);
      printWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
