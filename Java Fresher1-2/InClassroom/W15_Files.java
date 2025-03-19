import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class W15_Files {
  public static void main(String[] args) {
    String textFileRead = "";
    try {
      // String fileName = "C:\\Users\\oakmu\\Downloads\\gg.txt";
      // String fileName = "C:\\Users\\oakmu\\Documents\\GitHub\\MSU-ComScience\\Java
      // Fresher1-2\\InClassroom\\W15_f1.txt";
      String fileName = "W15_Files.java";
      FileInputStream fStream = new FileInputStream(fileName);
      while (true) {
        int x = fStream.read();
        if (x == -1) {
          break;
        }
        // System.out.print(x);
        textFileRead += (char) x;
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
      System.out.println("Files not found!");
    } catch (IOException e) {
      System.out.println(e);
      System.out.println("Files not found!");
    }
    System.out.println(textFileRead);
  }
}

// echo FF & echo 999 & echo 99 & echo 99 & echo 66

// color 0A
// echo    _____________     __________      ____    ___
// & echo /   _______   \   /  ______  \    /    \   [  [
// & echo [  [       [  [  [  [      [  [   [  __[   [  [
// & echo [  [ ___   [  [   \_[      [  [   \  \     [  [
// & echo [  [/ _[   [  [           _[  [    /  \    [  [
// & echo [    /     [  [          [    [   /  /_____[  [
// & echo [___/      [__[          [___/   [___________/