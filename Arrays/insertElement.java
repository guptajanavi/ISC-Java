import java.util.Scanner;

public class insertElement {
  public static void main(String[] args) {
    int n, pos, x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    n = sc.nextInt();
    int a[] = new int[n + 1];
    System.out.println("Enter array elements");
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println("Enter the position to insert element:");
    pos = sc.nextInt();
    System.out.println("Enter the element you want to insert:");
    x = sc.nextInt();

    for (int j= 0; j < pos - 1; j++) {
      a[j] = a[j + 1];
      a[pos - 1] = x;
      for (int k = 0; k < n; k++) {
        System.out.print(a[k] + " ");
      }
      System.out.print(a[n]);
    }
  }
}