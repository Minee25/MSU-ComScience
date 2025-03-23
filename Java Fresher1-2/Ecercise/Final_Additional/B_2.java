import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class B_2 {
  public static void main(String[] args) {
    B_2 obj = new B_2();
    String fileName = "B_2_Input.txt";
    String fileNameOutput = "B_2_Output.txt";
    String text = obj.readFile(fileName);
    HashSet<String> animals = obj.eachAnimal(text);
    HashMap<String, Integer> animalsAmount = obj.animalCount(animals, text);
    obj.display(animals.size(), " Animals");
    obj.writeFile(fileNameOutput, animalsAmount, animals);
    for (String animal : animals) {
      obj.display(animal + ": " + animalsAmount.get(animal));
    }
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  String readFile(String fileName) {
    String textRead = "";
    try {
      Scanner read = new Scanner(new File(fileName));
      while (read.hasNextLine()) {
        textRead += read.nextLine() + " ";
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return textRead.trim();
  }

  HashSet<String> eachAnimal(String text) {
    HashSet<String> animals = new HashSet<String>();
    String[] textParts = text.split("\\s+");
    for (String string : textParts) {
      if (string.equalsIgnoreCase("stop")) {
        break;
      }
      animals.add(string);
    }
    return animals;
  }

  HashMap<String, Integer> animalCount(HashSet<String> animals, String text) {
    HashMap<String, Integer> animalsAmount = new HashMap<String, Integer>();
    String[] textParts = text.split("\\s+");

    for (String textP : textParts) {
      for (String animal : animals) {
        if (textP.equalsIgnoreCase(animal)) {
          animalsAmount.put(animal, animalsAmount.getOrDefault(animal, 0) + 1);
        }
      }
    }
    return animalsAmount;
  }

  void writeFile(String fileName, HashMap<String, Integer> animalAmount, HashSet<String> animals) {
    try {
      FileWriter fileWriter = new FileWriter(new File(fileName));
      fileWriter.write(animals.size() + " Animals" + "\n");
      for (String animal : animals) {
        fileWriter.write(animal + ": " + animalAmount.get(animal) + "\n");
      }
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}