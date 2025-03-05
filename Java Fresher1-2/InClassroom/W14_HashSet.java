import java.util.HashSet;
import java.util.Iterator;

public class W14_HashSet {
  public static void main(String[] args) {
    HashSet<Integer> hset = new HashSet<Integer>();
    hset.add(1251);
    hset.add(11);
    hset.add(00);
    hset.add(999);
    hset.add(555);
    hset.add(555);
    System.out.println(hset);

    // for (int item : hset) {
    //   System.out.println(item);
    // }

    Iterator<Integer> x = hset.iterator(); 
    for (int i = 0; i < hset.size(); i++) {
      System.out.println(x.next());
    }
  }
}