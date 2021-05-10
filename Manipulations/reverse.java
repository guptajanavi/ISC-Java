import java.util.*;

public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s = sc.nextLine();
    String ns = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      ns += s.charAt(i);
    }
    System.out.println(ns);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int num = 0;
    while (n != 0) {
      int ld = n % 10;
      num = num * 10 + ld;
      n /= 10;
    }
    System.out.println(num);
  }
}