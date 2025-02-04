import java.io.IOException;

public class W2_InputOriginal {
    public static void main(String[] args) {
        
        try {
            int x = System.in.read();
            char ch = (char)x;
            System.out.println(ch);
        } catch (IOException err) {
            System.out.println(err);
        }
    }
}
