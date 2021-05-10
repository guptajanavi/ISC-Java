// to check the working of bitwsie operators
public class bitwiseOperators {
  public static void main(String args[]) {
    byte bb;
    int a = 5;
    int b = 3;
    double d = 1.5;
    double c = d + b / a;
    bb = (byte) d;
    int k = (int) (d * a + b);
    int m = (int) ((a++) * d + a);
    char aa[] = { 'a', 'b', 'c', 'd' };
    String str[] = { "hello", "welcome" };
    System.out.println(c);
    System.out.println(k);
    System.out.println(str);
    System.out.println(aa);
    System.out.println(60 >> b);
    System.out.println(60 << b);
    System.out.println(7 & 3);
    System.out.println(7 | 3);
    System.out.println(7 ^ 3);
    int e = (int) Math.pow(2, 10);
  }
}