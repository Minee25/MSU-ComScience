import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class W14_HashMap {
  public static void main(String[] args) {
    HashMap<Integer, String> hmp = new HashMap<Integer, String>();
    hmp.put(1, "Minee");
    hmp.put(5, "Master");
    hmp.put(31, "Thaksin");
    hmp.put(4, "GG");
    System.out.println(hmp);
    // hmp.remove(1); // ลบ index
    // System.out.println(hmp);
    // for (int i = 1; i <= hmp.size(); i++) {
    // System.out.println(hmp.get(i));
    // }

    // // ปริ้นแบบ Foreach
    // for (Map.Entry<Integer, String> entry : hmp.entrySet()) {
    // System.out.println("Key: " + entry.getKey() + ", Value: " +
    // entry.getValue());
    // }

    hmp.replace(5, "Mineeeeeeeeeeeeeeeeeee"); // แทนที่ key

    // วิธีหา key hashmap 
  }
}
