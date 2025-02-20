public class W11_API {
  public static void main(String[] args) {
    String age = "101";
    int a = Integer.parseInt(age, 16);
    System.out.println(a);

    String x = Integer.toBinaryString(5);
    System.out.println(x);

    String y = Integer.toHexString(55);
    System.out.println(y);

    int idCard = 26324040;
    String idCardStr = Integer.toString(idCard);
    System.out.println(idCardStr);

    int height = 175;
    String heightNum = Integer.toString(height, 16);
    System.out.println(heightNum.toUpperCase());
  }
}
