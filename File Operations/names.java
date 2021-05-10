import java.util.*;
import java.io.*;
public class names
{
  public static void main (String [] args) throws IOException
  {
    FileWriter fw = new FileWriter ("./name.txt");
    BufferedWriter bw = new BufferedWriter (fw);
    PrintWriter pw = new PrintWriter (bw);
    Scanner sc = new Scanner (System.in);
    for ( int i = 0; i<5; i++)
    {
      pw.println(sc.nextLine());
    }
    pw.close();
    bw.close();
    fw.close();
    sc.close();
  }
}