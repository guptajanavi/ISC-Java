//binary file write
//file out 
import java.io.*;
import java.util.*;
class studentBinaryFileWrite
{
	public static void main(String args[]) throws IOException
	{ 
		FileOutputStream fos = new FileOutputStream("./data.dar", true);
		DataOutputStream daros = new DataOutputStream(fos);
    Scanner sc = new Scanner (System.in);
		System.out.println("Enter name, age and marks for 3 students");
    String name;
    int age;
    double marks;
    for (int i = 0; i<3; i++)
    {
      name = sc.next();
      daros.writeUTF(name);
      age = sc.nextInt();
      daros.writeInt(age);
      marks = sc.nextDouble();
      daros.writeDouble(marks);
    }
    daros.close();
    fos.close();
  }
}