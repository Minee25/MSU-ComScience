import java.util.HashMap;
import java.util.Random;

public class Testt {
  public static void main(String[] args) {

    String[] animals = { "Elephant", "Horse", "Cow", "Buffalo", "Dog", "Cat", "Tiger", "Lion", "Bear" };
    Random random = new Random();

    // Repeat 20 times to get 20 random animals
    for (int i = 0; i < 20; i++) {
      int randomIndex = random.nextInt(animals.length);
      System.out.println(animals[randomIndex]);
    }
  }
}