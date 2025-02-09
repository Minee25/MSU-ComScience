public class GuessWord {
  public static void main(String[] args) {
    GuessWord obj = new GuessWord();
    String[] word = { "Minee", "Master" };
    obj.welcome();
    String wordRandom = obj.randomWord(word);
    obj.show(wordRandom);
  }

  void welcome() {
    System.out.println("Welcome in the Guess word game!");
  }

  void show(String x) {
    for (int i = 0; i < x.length(); i++) {
      System.out.print(x.charAt(i));
    }
  }

  String randomWord(String x[]) {
    String wordRandomSuccess = x[(int) (Math.random() * x.length)];
    return wordRandomSuccess;
  }

  int[] letterHide(String x) {
    int locationHide[] = new int[x.length()];
    for (int i = 0; i < 2; i++) {
      locationHide[(int) (Math.random() * x.length())] = 1;
    }
    return locationHide;
  }
}
