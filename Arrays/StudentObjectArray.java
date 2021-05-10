package ArrayDemo;
import java.util.*;
public class StudentObjectArray
{
    String name;
    int age;
    char gen;
    double science, computer;
    double total;
    public StudentObjectArray()
    {
        name = "";
        gen = ' ';
        age = 0;
        science = computer = 0.0;
    }
    
    public StudentObjectArray(String name, char gen, int age, double science, double computer)
    {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.science = science;
        this.computer = computer;
    }
    
    public StudentObjectArray input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name, age, gender, marks in science and computer");
        name = sc.nextLine();
        age = sc.nextInt();
        gen = sc.next().charAt(0);
        science = sc.nextDouble();
        computer = sc.nextDouble();
        total = science + computer;
        return this;
    }
    
    public void display( StudentObjectArray s)
    {
        System.out.println(s.name+"\t"+s.age+"\t"+s.gen+"\t"+s.science+"\t"+s.computer+"\t"+s.total);        
    }
    
    public boolean searchName(String key, StudentObjectArray s)
    {
        if ( s.name.equalsIgnoreCase(key))
        return true;
        return false;
    }
    
    public boolean searchAge(int key1, StudentObjectArray s)
    {
        if ( s.age == key1)
        return true;
        return false;
    }
    

    

}