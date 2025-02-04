public class W4_MathMethod {
    public static void main(String[] args) {
        double x = Math.pow(5, 3);
        double x2 = Math.ceil(2.11); // ปัดเศษขึ้น 
        double x3 = Math.round(3.98); // ปัดเศษ (>= 0.5 ปัดเศษขึ้น, < 0.5 ปัดเศษลง)
        double x4 = Math.floor(3.98); // ปัดเศษลง

        System.out.println(x3);
    }
}
