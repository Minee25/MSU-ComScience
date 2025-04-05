import java.util.Arrays;
import java.util.List;

public class FilterMethod {
  public static void main(String[] args) {
    String[] name = { "Minee", "Minecraft", "Master", "Thaksin", "Horion" };
    String[] name2 = { "Minee", "gg", "Master", "Thaksin", "Horion" };
    String[] result = Arrays.stream(name)
        .filter(n -> Arrays.asList(name2).contains(n))
        .toArray(String[]::new); // แปลงผลลัพธ์เป็น String[]
    
    // แสดงผลลัพธ์ที่กรองแล้ว
    System.out.println(Arrays.toString(result));
  }
}
