import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class B {
  public static void main(String[] args) {
    B obj = new B();
    String fileName = "B_Input.txt";
    String read = obj.readFile(fileName);
    LinkedHashMap<String, Integer> sumAnimals = obj.findAnimal(read);

    obj.printHashMap(sumAnimals);
    obj.writeFile(sumAnimals);
  }

  void printHashMap(LinkedHashMap<String, Integer> sumAnimal) {
    System.out.println(sumAnimal.size() + " Animals");
    Set<String> set = sumAnimal.keySet();
    Iterator<String> itt = set.iterator();
    while (itt.hasNext()) {
      String animal = itt.next();
      System.out.println(animal + ": " + sumAnimal.get(animal));
    }
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  String readFile(String fileName) {
    StringBuilder resultText = new StringBuilder();
    try (BufferedReader buff = new BufferedReader(new FileReader(fileName))) {
      String read;
      while ((read = buff.readLine()) != null) {
        resultText.append(read).append(" ");
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO Error: " + e.getMessage());
    }
    return resultText.toString();
  }

  LinkedHashMap<String, Integer> findAnimal(String read) {
    LinkedHashMap<String, Integer> sumAnimals = new LinkedHashMap<>();
    String[] animals = { "cat", "bird", "butterfly", "ant", "termite" };
    String[] readParts = read.split("\\s+");

    for (String word : readParts) {
      if (word.equalsIgnoreCase("stop")) {
        break;
      }
      for (String a : animals) {
        if (word.equalsIgnoreCase(a)) {
          sumAnimals.put(a, sumAnimals.getOrDefault(a, 0) + 1);
        }
      }
    }
    return sumAnimals;
  }

  void writeFile(LinkedHashMap<String, Integer> sumAnimal) {
    try {
      FileWriter fw = new FileWriter("B_Output.txt");
      fw.write(sumAnimal.size() + " Animals\n");
      Set<String> set = sumAnimal.keySet();
      Iterator<String> itt = set.iterator();
      while (itt.hasNext()) {
        String animal = itt.next();
        fw.write(animal + ": " + sumAnimal.get(animal) + "\n");
      }
      fw.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
