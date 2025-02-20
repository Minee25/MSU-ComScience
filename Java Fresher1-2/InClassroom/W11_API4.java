public class W11_API4 {
  public static void main(String[] args) {
    String str = "Horion";
    String str2 = "ri";
    boolean x = str.contains(str2);
    System.out.println(x);

    System.out.println("copyValueOf()");
    char[] text = { 'L', 'i', 'n', 'c', 'o', 'x' };
    String textCopy = String.copyValueOf(text, 2, text.length - 2);
    System.out.println(textCopy);

    System.out.println("-----");
    System.out.println("endsWith()");
    String email = "67011212030@msu.ac.th";
    if (email.endsWith(".ac.th")) {
      System.out.println("This education email");
    }

    System.out.println("-----");
    System.out.println("startsWith()");
    String name = "MISS.Thaksin Mualsuk";
    if (name.startsWith("MR.")) {
      System.out.println("He is a man");
    } else if (name.startsWith("MISS.")) {
      System.out.println("She is a woman");
    }

    System.out.println("-----");
    System.out.println("equals()");
    String lastName = "Master";
    System.out.println(lastName.equals("Master"));

    System.out.println("-----");
    System.out.println("indexOf()");
    String gg = "Horion client";
    System.out.println(gg.indexOf(("c")));

    System.out.println("-----");
    System.out.println("length()");
    String text2 = "Minee Master";
    System.out.println(text2.length());

    System.out.println("-----");
    System.out.println("replace()");
    String text3 = "Minee Master";
    System.out.println(text3.replace("Minee", "Horion"));

    System.out.println("-----");
    String text4 = "My.name.is.Thaksin.Mualsuk";
    String[] wordSplits = text4.split("\\.");
    for (int i = 0; i < wordSplits.length; i++) {
      System.out.println(wordSplits[i]);
    }
  }
}
