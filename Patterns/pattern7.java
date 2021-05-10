public class pattern7
{
  public static void main(String[] args)
  {
    int i, j;
    for ( i = 1; i<=5; i++)
    {
      for ( j = 5; j>=i; j++)
      {
        if(j<= i)
        System.out.print(" * ")
        else 
        System.out.print();
      }
      System.out.println();
    }
    
  }
}