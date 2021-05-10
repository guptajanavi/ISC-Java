import java.io.*;
import java.util.*;
public class studentTextFileWrite 
{
  public static void main (String [] args) throws IOException
  {
    FileWriter fw = new FileWriter ("./names.txt",true);
    BufferedWriter bw = new BufferedWriter (fw);
    PrintWriter pw = new PrintWriter (bw);
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter name, age and marks for 3 students");
    String name;
    int age;
    double marks;
    for (int i = 0; i<3; i++)
    {
      name = sc.next();
      pw.println(name);
      age = sc.nextInt();
      pw.println(age);
      marks = sc.nextDouble();
      pw.println(marks);
    }
    pw.close();
    bw.close();
    fw.close();
  }
}