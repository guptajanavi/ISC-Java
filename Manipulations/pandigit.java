import java.util.*;
public class pandigit
{
  public boolean isPandigit (String str)
  {
    if (str.length()!=9)
    return false;
    char ch [] = str.toCharArray();
    Arrays.sort(ch);
    return new String(ch).equals ("123456789");
  }
  public boolean generatePandigit ()
  {
    for (int i = 1; i<=100; i++) 
    {
      for ( int j = 100; j<=500; j++)
      {
        int product = i*j;
      String s = ""+i+j+product;      
      if (isPandigit(s))
      System.out.println(i + " , " + j + " , " + product);  
      }       
    }
    return false;
  }
  public static void main(String[] args)
  {
    pandigit ob = new pandigit();
    ob.generatePandigit();
  }
}