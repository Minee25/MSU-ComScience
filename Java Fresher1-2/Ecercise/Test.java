import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {
  public static void main(String[] args) {

    LinkedHashMap<String, Integer> data = new LinkedHashMap<String, Integer>();
    String[] animal = { 
      "Elephant",
      "Lion",
      "Dolphin",
      "Tiger",
      "Giraffe",
      "Kangaroo",
      "Panda",
      "Gorilla",
      "Wolf",
      "Hedgehog"
    };

    data.put("Minee", 1);
    data.put("Master", 4);
    data.put("Thaksin", 5);
    data.put("Mualsuk", 10);
    data.put("Horion", 7);
    data.put("Cheat", 41);
    
    data.forEach((key, value) -> {
      System.out.println(key + ": " + value);
    });

    for (String user : data.keySet()) {
      System.out.println(user + ": " + data.get(user));
    }
  }
}
