import java.io.File;

public class FilesList {

  public static void main(String[] args) {
    File driveC = new File("C:\\");

    System.out.println("รายการใน: " + driveC);

    if (driveC.isDirectory()) {
      String[] files = driveC.list();
 
      if (files != null) {
        for (String file : files) {
          File fileObject = new File(driveC, file);   
          if (fileObject.isFile()) { 
            System.out.println(file);
          } else if (fileObject.isDirectory()) {
            System.out.println(file);
          }
        }
      } else {
        System.out.println("ไม่สามารถดึงรายการไฟล์ได้ หรือไม่มีไฟล์ในไดเร็กทอรีนี้");
      }
    } else {
      System.out.println(driveC + " ไม่ใช่ไดเร็กทอรี");
    }
  }
}
