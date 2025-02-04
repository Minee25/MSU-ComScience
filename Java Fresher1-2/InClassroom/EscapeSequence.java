public class EscapeSequence {
    public static void main(String[] args) {
        System.out.println("ABCD\b");
        System.out.println("ABCD\bX");

        System.out.println("ABCD\b\b\bs");
        System.out.println("ABCDEFGHIJK\rMinee");
    }
}
