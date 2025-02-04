import java.util.Arrays;
import java.util.Collections; 

public class test {
    public static void main(String[] args) {
        // ประกาศอาร์เรย์
        Integer nums[] = {1, 5, 3, 7, 4, 7, 3, 4, 78, 8};

        // เรียงลำดับจากน้อยไปมาก
        Arrays.sort(nums);
        System.out.println("เรียงลำดับจากน้อยไปมาก:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();

        // เรียงลำดับจากมากไปน้อย
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("เรียงลำดับจากมากไปน้อย:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
