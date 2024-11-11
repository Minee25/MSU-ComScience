import java.io.*;

public interface File1 {
  public static void main(String[] args) {
    File f = new File("Minee.txt");
    try {
      FileWriter writer = new FileWriter(new File("1ff.txt"));
      BufferedWriter bw = new BufferedWriter(writer);
      bw.write("Hello\n");
      bw.write("Minee");
      for (int i = 0; i < 100; i++) {
        bw.write("(" + i + ") Hello Universe\n");
      }

      bw.close();
      System.out.println("Write File Successfully");
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
