import java.util.Scanner;

public class w4_StringCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (name.equals("Minee")) {
            System.out.println("What!, Who is Minee");
        } else if (name.equals("Thaksin")) {
            System.out.println("Yes i'm Thaksin");
        } else {
            System.out.println("GG");
        }
    }
}
