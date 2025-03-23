import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankHistory {
  public static void main(String[] args) {
    BankHistory obj = new BankHistory();
    String fileName = "BankHistory.txt";

    String textReaded = obj.readFile(fileName);
    String name = obj.findName(textReaded);
    int money = obj.findMoney(textReaded);
    int bank = obj.findBank(textReaded);

    obj.display("Hi " + name + " This your bank");
    while (true) {
      obj.display("\u001B[33mMoney: ", money + "\u001B[0m");
      obj.display("\u001B[32mBank: ", bank + "\u001B[0m");
      obj.display("w = Withdraw\nd = Deposit");
      String menu = obj.input("Menu: ");
      if (menu.equalsIgnoreCase("x")) {
        obj.display("Exit...");
        break;
      } else if (menu.equalsIgnoreCase("w")) {
        int amount = obj.inputNum("Amount Withdraw: ");
        if (amount > bank) {
          obj.display("Your balance is lower than the withdrawal!");
        } else {
          money += amount;
          bank -= amount;
          obj.writeFile(fileName, name, money, bank);
        }
      } else if (menu.equalsIgnoreCase("d")) {
        int amount = obj.inputNum("Amount Deposit: ");
        if (amount > money) {
          obj.display("Your balance is lower than the deposit amount!");
        } else {
          money -= amount;
          bank += amount;
          obj.writeFile(fileName, name, money, bank);
        }
      } else {
        obj.display("Menu not found!");
      }
    }
  }

  void display(Object... args) {
    StringBuilder output = new StringBuilder();
    for (Object object : args) {
      output.append(object);
    }
    System.out.println(output.toString());
  }

  String input(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }

  int inputNum(String prompt) {
    Scanner input = new Scanner(System.in);
    while (true) {
      try {
        System.out.print(prompt);
        return input.nextInt();
      } catch (NumberFormatException e) {
        System.out.println(e);
        input.next();
      }
    }
  }

  String readFile(String fileName) {
    String readFile = "";
    try {
      Scanner read = new Scanner(new FileReader(fileName));
      while (read.hasNext()) {
        readFile += read.nextLine() + "\n";
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
    return readFile;
  }

  int findMoney(String text) {
    String[] textParts = text.split("\n");
    int money = 0;
    for (String string : textParts) {
      if (string.toLowerCase().contains("money:")) {
        try {
          money = Integer.parseInt(string.substring(string.indexOf(":") + 1, string.length()).trim());
        } catch (NumberFormatException e) {
          System.out.println(e.getMessage());
          System.out.println("Please a Number Only");
        }
      }
    }
    return money;
  }

  String findName(String text) {
    String[] textParts = text.split("\n");
    String name = "";
    for (String string : textParts) {
      if (string.toLowerCase().contains("name:")) {
        name = string.substring(string.indexOf(":") + 1, string.length()).trim();
      }
    }
    return name;
  }

  int findBank(String text) {
    String[] textParts = text.split("\n");
    int bank = 0;
    for (String string : textParts) {
      if (string.toLowerCase().contains("bank:")) {
        try {
          bank = Integer.parseInt(string.substring(string.indexOf(":") + 1, string.length()).trim());
        } catch (NumberFormatException e) {
          System.out.println(e.getMessage());
          System.out.println("Please a Number Only");
        }
      }
    }
    return bank;
  }

  void writeFile(String fileName, String name, int money, int bank) {
    try {
      FileWriter fileWriter = new FileWriter(fileName);
      fileWriter.write("name: " + name + "\n");
      fileWriter.write("money: " + money + "\n");
      fileWriter.write("bank: " + bank + "\n");
      fileWriter.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}