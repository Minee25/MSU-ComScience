import java.util.ArrayList;

public class W14_ArrayListt {
  public static void main(String[] args) {
    ArrayList<Double> arls = new ArrayList<Double>();

    // เพิ่ม
    arls.add(101.1);
    arls.add(10.0);
    arls.add(999.99);
    arls.add(142.1);
    arls.add(12404.0);
    arls.add(111.1);

    // ลบข้อมูลที่ต้องการลบ
    arls.remove(111.1);
    arls.remove(3); // ลบตำแหน่งของ Index

    for (double num : arls) {
      System.out.println(num);
    }
    
    System.out.println("------");
    // for (int i = 0; i < arls.size(); i++) {
    //   System.out.println(arls.get(i));
    // }

    // // หาสิ่งที่ต้องการหา ถ้าเจอ True ไม่เจอ False
    // boolean found = arls.contains(12404.0);
    // System.out.println(found);

    // // หาตำแหน่งของ index
    // int location = arls.indexOf(111.1);
    // System.out.println(location);

    // Set แก้ไข
    arls.set(0, 15125.1);
    
    for (double num : arls) {
      System.out.println(num);
    }
  } 
}
