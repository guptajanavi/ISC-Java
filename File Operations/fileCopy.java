import java.io.*;
class fileCopy
{
  public static void main (String [] args) throws IOException
  FileInputStream fin = new FileInputStream ("abc.txt");
  FileOutputStream fout = new FileOutputStream ("xyz.txt");
  int c;
  while (c = fin.read() != -1)
  {
    fout.write(c);
  }
  fin.close();
  fout.close();
}