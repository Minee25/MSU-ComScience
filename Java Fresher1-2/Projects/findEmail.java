import java.util.Scanner;

public class findEmail {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    /*
     * Lorem Ipsum is simply dummy minee25.love+you@gmail.com text of the noting
     * minee25.love+you@gmail.com
     * 
     * Lorem My email is ->minee25.love+you@p1xin.com<- text of the noting
     * minee25.love+you@p1xin.com
     * 
     * สามารถส่งอีเมลมาที่minee.p1xin@msu.ac.thได้เลยครับ
     * minee.p1xin@msu.ac.th
     * 
     * Lorem Ipsum is minee@gmail.com simply dummy text 67011212030@msu.ac.th of the printing and typesetting industry. Lorem minee.ggameing@gmail.com Ipsum has been the industry's standard dummy text ever since the 1500s,
     */

    System.out.print("Text: ");
    String text = input.nextLine();

    System.out.println(findEmaile(text));
  }

  // Method
  static String findEmaile(String text) {
    Integer findIndex = null;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == '@') {
        findIndex = i;
      }
    }

    if (findIndex != null) {
      // Find before @
      String beforeAt = "";
      for (int i = -1; findIndex + i >= 0 && text.charAt(findIndex + i) != ' '; i--) {
        int ascii = (int) text.charAt(findIndex + i);
        if ((ascii < 66 && ascii != 46 && ascii != 43 || ascii > 121 && ascii != 46) && !(ascii >= 49 && ascii <= 57)) {
          break;
        }
        beforeAt += String.valueOf(text.charAt(findIndex + i));
      }
      // Reverse
      String reverseBeforeAt = "";
      for (int i = beforeAt.length(); i > 0; i--) {
        reverseBeforeAt += String.valueOf(beforeAt.charAt(i - 1));
      }

      // Find after @
      String afterAt = "";
      for (int i = 1; findIndex + i < text.length() && text.charAt(findIndex + i) != ' '; i++) {
        int ascii = (int) text.charAt(findIndex + i);
        if ((ascii < 64 && ascii != 46 || ascii > 121 && ascii != 46) && !(ascii >= 49 && ascii <= 57)) {
          break;
        }
        afterAt = afterAt.concat(String.valueOf(text.charAt(findIndex + i)));
      }

      String email = reverseBeforeAt + "@" + afterAt;
      return email;
    } else {
      return "Email not found!";
    }
  } 
}
