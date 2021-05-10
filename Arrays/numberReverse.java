import java.util.*;
public class numberReverse
{
  int A [];
  int size = 10;
  public numberReverse()
  {
    A =  new int [size];
  } 
  public numberReverse(int x)
  {
    size = x;
    A = new int [size];
  }
  public void input()
  {
    Scanner sc = new Scanner (System.in);    
    System.out.println("Enter values");
    for ( int i = 0; i<A.length; i++)
    {
      A[i] = sc.nextInt();
    }
  }
  public int reverse(int a)
  {
    int num = 0;
    while (a!=0)
    {
      int ld = a%10;
      num = num * 10 + ld;
      a/=10;
    }
    return num;
  }
  public void print()
  {
    System.out.println("Original Array");
    for ( int i = 0; i<A.length; i++)
    {
      System.out.println(A[i]);
    }
    System.out.println("New Array");
    for ( int i = 0; i<A.length; i++)
    {
      A[i] = reverse(A[i]);
      System.out.println(A[i]+" ");
    }      
  }
  public static void main(String[] args)
  {
    numberReverse ob = new numberReverse(3);
    ob.input();
    ob.print();
  }
}