import java.lang.*;

public class no4 {
  public static void main() {
    int a = 100;
    int b = 100;
    String max = "";
    String productNum = "";

    while (b < 1000) {
      while (a < 1000) {
        productNum = String.valueOf(a*b);
        StringBuffer sb = new StringBuffer(productNum);
        String rvs = sb.reverse().toString();
        if (productNum.equals(productNum.equals(rvs))) {
          max = productNum;
        }
        a++;
      }
      b++;
    }
    System.out.println(max);
  }
}
