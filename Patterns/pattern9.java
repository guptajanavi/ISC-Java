public class pattern9 {
  public static void main(String[] args) {
    String s = "EDCBA";
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (6 - i); k++) {
        System.out.print(s.charAt(i - 1));
      }
      System.out.println();
    }
  }
}