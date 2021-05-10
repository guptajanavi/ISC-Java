import java.util.Scanner;

class binarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int i, n, c = 0, u = 10, l = 0, m = 0, j,t;
    System.out.println("Enter 10 numbers");
    for (i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (i = a.length - 1; i > 0; i--) {
      for (j = 0; j < i; j++) {
        if (a[j] > a[j + 1]) {
          t = a[j];
          a[j + 1] = t;
        }
      }
    }
    System.out.println("Enter a number to Search");
    n = sc.nextInt();
    while (u > l) {
      m = (l + u) / 2;
      if (a[m] == n) {
        c = 1;
        break;
      } else if (a[m] > n) {
        u = m;
      } else if (a[m] < n) {
        l = m + 1;
      }
    }
    if (c == 0)
      System.out.println("Number " + n + " is not found");
    else
      System.out.println("Number " + n + " is found");
  }
}
