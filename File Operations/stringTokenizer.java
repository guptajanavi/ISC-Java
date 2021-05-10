import java.util.StringTokenizer;
class stringTokenizer
{
  public static void main (String args[])
  {
    String s = "this is my first program";
    String s1 = "this,is,still,my,first@program";
    StringTokenizer st = new StringTokenizer (s);
    StringTokenizer st1 = new StringTokenizer (s1, ",@");
    while (st.hasMoreTokens())
    {
      System.out.println(st.nextToken());
    }
   
    String A [] = new String [st1.countTokens()];
    int x = 0;
    while (st1.hasMoreTokens())
    {
      A[x++] = st1.nextToken();
    }
    for (int i = 0; i<A.length; i++)
    {
      System.out.println(A[i]);
    }
  }
}