import java.util.*;

public class insertArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A[] = new int[10];
    int i, j;
    for (i = 0; i < 5; i++) {
      j = 10;
      A[i] = j;
      j += 10;
    }
    int num = 0;
    int pos = 0;

    for (i = 0; i < 5; i++) {
      System.out.println("Enter a number");
      num = sc.nextInt();
      for (j = 1; j < A.length; j++) {
        if (num <= A[j] && num >= A[j - 1])
          pos = j;
        else
          continue;
        for (i = 8; i > pos; i--) {
          A[i] = A[i + 1];
        }
        A[pos] = num;
      }
    }
    for (i = 0; i < A.length; i++)
      System.out.println(A[i]);
  }
} 