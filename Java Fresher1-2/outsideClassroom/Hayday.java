public class Hayday {
  public static void main(String[] args) {
    String location[] = {
        "28.8857 42.1606",
        "29.5245 58.6042",
        "39.8155 43.1166",
        "39.4606 58.6042",
        "50.0355 42.6386",
        "50.3194 57.935",
        "60.7523 42.3518",
        "61.1072 57.457",
        "71.4691 42.4474",
        "71.6111 58.2218"
    };

    for (int i = 0; i < location.length; i++) {
      System.out.println("#location sell");
      System.out.println("tap " + location[i]);
      System.out.println("wait 50");
      System.out.println("#exit");
      System.out.println("tap  27.6082 20.6501");
      System.out.println("wait 50");
      System.out.println("#locatoin sell");
      System.out.println("tap " + location[i]);
      System.out.println("wait 50");
      System.out.println("#ad");
      System.out.println("tap 56.423 49.3308");
      System.out.println("wait 50");
      System.out.println("#confirm ad");
      System.out.println("tap  50.3903 59.7514");
      System.out.println("wait 50");
      System.out.println("#exit");
      System.out.println("tap  27.6082 20.6501");
      System.out.println("wait 50");
      System.out.println("#location sell");
      System.out.println("tap " + location[i]);
      System.out.println("wait 50");
      System.out.println("#silo");
      System.out.println("tap  21.5756 38.1453");
      System.out.println("wait 50");
      System.out.println("#wheat");
      System.out.println("tap  30.873 36.5201");
      System.out.println("wait 50");
      System.out.println("#max");
      System.out.println("tap  69.0561 50.0956");
      System.out.println("wait 50");
      System.out.println("#ad");
      System.out.println("tap  61.3911 64.914");
      System.out.println("wait 50");
      System.out.println("#confirm sell ");
      System.out.println("tap  65.5075 73.5182");
      System.out.println("wait 50");
    }
  }
}
