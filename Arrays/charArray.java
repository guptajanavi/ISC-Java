public class charArray
{
  public static void main (String [] args)
  {
    char A [] = new char [26];
    char j = 'a';
    for ( int i = 0; i<A.length; i++)
    {
      A[i] = j;
      j++;
      if ( i%2 == 0)
      A[i] = Character.toUpperCase(A[i]);
    }
    for ( int i = 0; i<A.length; i++)
    System.out.println(A[i]);
  }
}//scanner sc = new scanner (system.in); filewriter fw = new filewriter (system.in); bufferedwriter bw = new bufferedwriter (fw);