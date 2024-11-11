public class MethodReturn {
  public static void main(String[] args) {
    connectServer(200);
  }

  public static void connectServer(int ping) {
    if (ping > 100) {
      return;
    }
    System.out.println("Connect Server");
  }
}
