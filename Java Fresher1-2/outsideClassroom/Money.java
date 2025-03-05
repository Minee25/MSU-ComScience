import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Money {
  public static void main(String[] args) {
    Double money = 1234567.9876543;
    String x = String.format("%,.2f", money);
    System.out.println(x);

    DecimalFormat df = new DecimalFormat("#,#0.000");
    df.setRoundingMode(RoundingMode.FLOOR);
    System.out.println(df.format(money));
  }
}
