import java.io.IOException;

public class W15_readInput {
  public static void main(String[] args) {
    String usrInput = "";
    while (true) {
      try {
        int x = System.in.read();
        System.out.print(x);
        System.out.print((char) x);
        if (x == -1 ) {
          break;
        }
        usrInput += (char) x;
      } catch (IOException err) {
        System.out.println(err);
      }
    }
    System.out.println(">> " + usrInput);
  }
}
