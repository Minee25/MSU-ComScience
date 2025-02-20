 
import java.util.Scanner; 
 
public class Ex4 { 
  public static void main(String[] args) {  
    Ex4 obj = new Ex4();
    String data = obj.input("Input: ");
    obj.display(obj.capitalization(data));
    
  } 
 
  String input(String x) { 
    Scanner input = new Scanner(System.in); 
    System.out.print(x); 
    return input.nextLine(); 
  } 
 
  void display(String x) { 
    System.out.println(x); 
  } 

  String capitalization(String data) {
    String[] words = data.split(" "); 
    String text = "";
    for (int i = 0; i < words.length; i++) {
      text += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
    }
    return text;
  }

  String capitalization2(String data) {
    String[] words = data.split(" ");
    StringBuilder text = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      text.append(Character.toUpperCase(words[i].charAt(0)))
        .append(words[i].substring(1))
        .append(" ");
    }
    return text.toString();
  }
} 
