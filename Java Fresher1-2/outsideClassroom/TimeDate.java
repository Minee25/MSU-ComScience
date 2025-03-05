
import java.time.LocalDateTime;

public class TimeDate {
  public static void main(String[] args) {
    LocalDateTime dateTime = LocalDateTime.now();

    String day = dateTime.getDayOfWeek().toString();
    System.out.println(Character.toUpperCase(day.charAt(0)) + day.substring(1).toLowerCase());
    
  }
}
