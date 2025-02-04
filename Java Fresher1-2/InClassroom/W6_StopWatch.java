public class W6_StopWatch {
    public static void main(String[] args) {
        int s = 0, m = 0, h = 0, d = 0, month = 0, y = 0, decade = 0, century = 0;
        System.out.println("Cen:\tDecade:\tYear:\tMonth\tDay:\tHours:\tMinute:\tSecound");
        while (true) {
            System.out.print("\r" + century + " \t"  + decade + " \t"  + y + " \t" + month + " \t" + d + " \t" + h + " \t" + m + " \t" + s + " ");
            // try {
            //     Thread.sleep(100);
            // } catch (InterruptedException err) {
            //     System.out.println(err);
            // }

            // secound
            s++;

            // minute
            if (s >= 60) {
                m += 1;
                s = 0;
            }

            // hourse
            if (m >= 60) {
                h += 1;
                m = 0;
            }

            // day
            if (h >= 24) {
                d += 1;
                h = 0;
            }

            // month
            if (d >= 30) {
                month += 1;
                d = 0;
            }

            // year
            if (month >= 12) {
                y += 1;
                month = 0;
            }

            // decade
            if (y > 10) {
                decade += 1;
                y = 0;
            }

            // century
            if (decade > 10) {
                century += 1;
                decade = 0;
            }

        }
    }
}
