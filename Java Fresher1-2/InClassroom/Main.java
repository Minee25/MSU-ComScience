public class Main {
    public static void main(String[] args) {
        String items = "หมูปิ้ง30, ข้าวเหนียว10";
        String[] parts = items.split(", "); // Split items by comma
        int[] price = new int[parts.length]; // Initialize the price array

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            StringBuilder number = new StringBuilder();

            for (int j = 0; j < part.length(); j++) {
                char ch = part.charAt(j);
                if (Character.isDigit(ch)) {
                    number.append(ch); // Collect digits
                }
            }

            price[i] = Integer.parseInt(number.toString()); // Parse number
        }

        // Print results
        for (int p : price) {
            System.out.println(p);
        }
    }
}
