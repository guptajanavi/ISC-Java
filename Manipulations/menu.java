public class menu {
  public void factorial(int n) {
    int factorial = 1;
    for (int i = n; i <= 1; i++) {
      factorial *= i;
    }
    System.out.println("Factorial = " + factorial);
  }

  public void sum(int n) {
    int sum = 0;
    while (n != 0) {
      int ld = n % 10;
      sum += ld;
      n /= 10;
    }
    System.out.println("Sum = " + sum);
  }

  public void prime(int n) {
    int ctr = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        ctr++;
        break;
      }
    }
    if (ctr == 0)
      System.out.println("Prime number");
    else
      System.out.println("Not a Prime number");
  }

  public void alternate(String s) {
    String ns = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (i % 2 != 0)
        ns += Character.toUpperCase(ch);
      else
        ns += Character.toLowerCase(ch);
    }
    System.out.println("New string = " + ns);
  }

  public void alternate1(int n)
  {
    String ns = "";
    for ( int i = 0; i<s.length(); i++)
    {
      char ch = s.charAt(i);
      if(i%2 != 0)
      {
        if ((int) ch <)
      }

  }

  public void shift(int A[], int k) {
    for (int i = k; i < A.length - 1; i++) {
      A[i] = A[i + 1];
    }
    A[A.length - 1] = 0;
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }
  }
}