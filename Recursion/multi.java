import java.util.*;

public class multi {
  public int function(int m, int n) {
    if (m <= 1)
      return n;
    else
      return (n + function(m - 1, n));
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    multi ob = new multi();
    System.out.println("Enter a number and multiple");
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(ob.function(m, n));
  }
}

// can also be written like this
/*
 * public int function (int n, int i) { if (i< 1) return 0; else return (n +
 * function (n, i-1)); }
 */
