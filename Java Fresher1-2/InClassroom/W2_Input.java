import java.util.Scanner;

public class W2_Input {
    public static void main(String[] args) {
        
        String firstName = รับค่า("ใส่ชื่อของคุณ: ");
        String lastName = รับค่า("ใส่ชื่อใส่นามสกุลของคุณ: ");
        long id = รับค่าตัวเลข("ใส่ชื่อใส่เลขไอดีของคุณ: ");
        String birth = รับค่า("ใส่ชื่อใส่ พ.ศ. เกิด ของคุณ: ");
        
        ปริ้น("Hello My name is " + firstName + " " + lastName + "\n");
        ปริ้น("ID " + id + "\n");
        ปริ้น("I was born " + birth + "I have " + (2567 - Integer.parseInt(birth)) + " years old.\n");
    }
//}







    static String รับค่า(String x) {
        Scanner input = new Scanner(System.in);
        System.out.print(x);
        return input.nextLine();
    }

    static int รับค่าตัวเลข(String x) {
        Scanner input = new Scanner(System.in);
        System.out.print(x);
        return input.nextInt();
    }
    static long รับค่าตัวเลขลอง(String x) {
        Scanner input = new Scanner(System.in);
        System.out.print(x);
        return input.nextLong();
    }

    static void ปริ้น(Object x) {
        System.out.print(String.valueOf(x));
    }
}
