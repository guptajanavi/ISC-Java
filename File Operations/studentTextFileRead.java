import java.io.*;
public class studentTextFileRead
{
  public static void main(String [] args) throws IOException
  {
    FileReader fr = new FileReader ("./names.txt");
    BufferedReader br = new BufferedReader (fr);
    String s;
    int age;
    double marks;
    while (true)
    {
      s = br.readLine();
      age = Integer.parseInt(br.readLine());
      marks = Double.parseDouble(br.readLine());
      System.out.println("name: " + s);
      System.out.println("age: " + age);
      System.out.println("marks: " + marks);
    }
    br.close();
    fr.close();
  }
}