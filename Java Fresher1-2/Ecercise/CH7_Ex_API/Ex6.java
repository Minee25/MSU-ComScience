import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex6 {
  public static void main(String[] args) {
    // สร้าง Calendar instance เพื่อดึงวันที่และเวลา
    Calendar calendar = Calendar.getInstance();

    // กำหนดรูปแบบวันที่
    SimpleDateFormat dateFormat = new SimpleDateFormat("d : EEEE : MMMM : yyyy");
    SimpleDateFormat timeFormat = new SimpleDateFormat("H : mm : ss");

    // แสดงผลลัพธ์
    System.out.println(dateFormat.format(calendar.getTime())); // วันที่ : ชื่อวัน : ชื่อเดือน : ปี
    System.out.println(
        calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " : " +
        (calendar.get(Calendar.DAY_OF_MONTH) + 1) + " : " + 
        calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println(timeFormat.format(calendar.getTime())); // ชั่วโมง (0-23) : นาที : วินาที
  }
}
