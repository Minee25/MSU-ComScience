import java.util.Arrays;
import java.util.Collections;

public class test {public static void main(String[] args) {
  String text = "ข้าวกล่อง35, น้ำปั่น30, ไก่ป็อป20, ขนมจีบ20, กระเพราไข่ดาว30";
   
  String[] words = text.split(", "); 
  int count = words.length;
  for (int i = 0; i < words.length; i++) {
    System.out.print(words[i] + " ");
  }
}
}