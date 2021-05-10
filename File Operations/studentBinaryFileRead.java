import java.io.*;
import java.util.*;
public class studentBinaryFileRead
{
  public static void main(String args[]) throws IOException
  { 
	  FileInputStream fos = new FileInputStream("./data.dar");
		DataInputStream daros = new DataInputStream(fos);
    String name;
    int age;
    double marks;
    boolean EOF=false;
    try
    {
      while(!EOF)
      {
        name = daros.readUTF();
        age = daros.readInt();
        marks = daros.readDouble();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("marks: " + marks);
      }
    }
    catch (Exception e)
    {      
      EOF=true;
    }
    daros.close();
    fos.close();
    System.out.println("age: hello " );
  }
}