import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class w12_test {
  public static void main(String[] args) {
    String str = "Hello StringBuffer for String procress";
    StringBuffer stBf = new StringBuffer(str);

    StringBuffer x = stBf.reverse();// กลับด้านจากหลังไปหน้า

    /*
     * String pm =
     * "\"C:\\Program Files (x86)\\Steam\\Steam.exe\"";//ใส่ลิงค์แอพที่ต้องการเเสดง
     * Runtime rtm = Runtime.getRuntime();//
     * try{
     * rtm.exec(pm);
     * }
     * catch(IOException er){
     * 
     * }
     */

    String str1 = "Hello CS@MSU Thailand and the WORLD";
    // StringTokenizer(String str)
    StringTokenizer stk = new StringTokenizer(str1);
    int count = stk.countTokens();

    Date dtt = new Date();
    int date = dtt.getDate();
    int day = dtt.getDay();
    int month = dtt.getMonth();
    int year = dtt.getYear();// 2025-1900

    Calendar cld = Calendar.getInstance();
    // int y = Calendar.DATE;
    int cal = cld.get(Calendar.DAY_OF_MONTH);
    int calmonth = cld.get(Calendar.WEEK_OF_MONTH);
    int calyear = cld.get(Calendar.WEEK_OF_YEAR);

    Date pt = new Date();
    Locale lo = new Locale("th");// แปลงภาษา***th ja en Latn
    String ptt = "EEEE:MMMM:yyyy";
    // SimpleDateFormat smpDt = new SimpleDateFormat(ptt);//แปลงอักษร
    SimpleDateFormat smpDt = new SimpleDateFormat(ptt, lo);// lo = ภาษา
    // StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos)
    String sm = smpDt.format(new Date());// ประกาศได้

    double d1 = 123456789.123456789;
    double d2 = 123456789.987654321;
    String patt = "0.00";// #,##0.0 #,##,###,####" //เอาถึง9.12,9.98
    DecimalFormat dcFm = new DecimalFormat(patt);
    String m = dcFm.format(d1);
    String m2 = dcFm.format(d2);

    // output
    System.out.println(str);
    System.out.println(stBf);
    System.out.println(x);
    for (int i = 0; i < count; i++) {
      String next = stk.nextToken();
      System.out.println(next);
    }
    while (stk.hasMoreTokens()) {
      System.out.println(stk.nextToken());
    }
    System.out.println(dtt);
    System.out.println(date);
    System.out.println(day);
    System.out.println(month);
    System.out.println(year);
    System.out.println(cld);
    System.out.println(cal);
    System.out.println(calmonth);
    System.out.println(calyear);
    System.out.println(sm);
    System.out.println(m);
    System.out.println(m2);
  }
}
