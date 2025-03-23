import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class B {
  public static void main(String[] args) {
    B obj = new B();
    String fileName = "B_Input.txt";

    String text = obj.readFile(fileName);
    HashSet<String> animals = obj.animals(text);
    HashMap<String, Integer> animalAmount = obj.animalAmount(animals, text);

    obj.display(animals.size() + " Aminals");
    Set set = animalAmount.keySet();
    Iterator<String> itt = set.iterator();
    while (itt.hasNext()) {
      String key = itt.next();
      System.out.println(key + " " + animalAmount.get(key));
    } 
  }

  void display(Object... args) {
    String output = "";
    for (int i = 0; i < args.length; i++) {
      output += args[i];
    }
    System.out.println(output);
  }

  String readFile(String fileName) {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNextLine()) {
        textRead += read.nextLine() + " ";
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textRead.trim();
  }

  HashSet<String> animals(String text) {
    HashSet<String> animals = new HashSet<String>();
    String[] textParts = text.split("\\s+");
    for (int i = 0; i < textParts.length; i++) {
      if (textParts[i].equals("stop")) {
        break;
      }
      animals.add(textParts[i]);
    }
    return animals;
  }

  HashMap<String, Integer> animalAmount(HashSet<String> animals, String text) {
    HashMap<String, Integer> animalAmount = new HashMap<String, Integer>();
    String[] textParts = text.split("\\s+");

    for (String textP : textParts) {
      for (String animal : animals) {
        if (textP.equalsIgnoreCase(animal)) {
          animalAmount.put(animal, animalAmount.getOrDefault(animal, 0) + 1);
        }
      }
    }
    return animalAmount;
  }
}
