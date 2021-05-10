package ArrayDemo;
import java.util.*;
public class ObjectArray
{
    Scanner sc = new Scanner (System.in);    
    StudentObjectArray ob1 = new StudentObjectArray ();
    ArrayList <StudentObjectArray> A = new ArrayList <StudentObjectArray>();    
    public void input()
    {        
        System.out.println("Enter number of students");
        int num = sc.nextInt();
        for ( int i = 0; i<num; i++)
        {
            A.add(ob1.input());
            ob1.display(A.get(i));
        }        
    } 

    public void add()
    {
        A.add(ob1.input());
    }

    public void edit()
    {
        System.out.println("Enter index pos of student to be edited");
        A.set(sc.nextInt(), ob1.input());        
    }

    public void delete()
    {
        System.out.println("Enter index pos of student to be removed");
        A.remove(sc.nextInt());
    }

    public void view()
    {
        System.out.println("Name \t Age \t Gender \t Science \t Computer \t Total");
        for ( int i = 0; i<A.size(); i++)
        ob1.display(A.get(i));
    }

    public void search()
    {
        System.out.println("Enter 1. to search by name, 2. to search by age");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: 
            System.out.println("Enter search key");
            String key;
            key = sc.nextLine(); 
            key = sc.nextLine(); 
            for ( int i = 0; i<A.size(); i++)
            {
                if (ob1.searchName(key, A.get(i)) == true)
                    ob1.display(A.get(i)); 
            }  
            break;
            case 2: 
            System.out.println("Enter search key");
            int key1 = sc.nextInt(); 
            for ( int i = 0; i<A.size(); i++)
            {
                if (ob1.searchAge(key1, A.get(i)) == true)
                    ob1.display(A.get(i));
            }          
        } 
    }

    public void sort()
    {
        System.out.println("Enter 1. to sort by name, 2. for age, 3. for total");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: 
            for ( int i = 0; i<A.size(); i++)
            {
                for ( int j = 0; i<A.size()-i-2; j++)
                {
                    StudentObjectArray s = A.get(j);
                    StudentObjectArray s1 = A.get(j+1);
                    if (s.name.compareToIgnoreCase(s1.name) > 0)
                    {
                        StudentObjectArray tmp = s;
                        StudentObjectArray tmp1 = s1;
                        A.set(j, s1);
                        A.set(j+1, s);
                    }                    
                }      
            }
            break;
            case 2:
            for ( int i = 0; i<A.size(); i++)
            {
                for ( int j = 0; i<A.size()-i-2; j++)
                {
                    StudentObjectArray s = A.get(j);
                    StudentObjectArray s1 = A.get(j+1);
                    if (s.age > s1.age)
                    {
                        A.set(j, s1);
                        A.set(j+1, s);
                    }                    
                }      
            }
            break;
            case 3:
            for ( int i = 0; i<A.size(); i++)
            {
                for ( int j = 0; i<A.size()-i-2; j++)
                {
                    StudentObjectArray s = A.get(j);
                    StudentObjectArray s1 = A.get(j+1);
                    if (s.total < s1.total)
                    {
                        A.set(j, s1);
                        A.set(j+1, s);
                    }                    
                }      
            }
            
        }
    }

    public static void main()
    {
        ObjectArray obj = new ObjectArray();
        Scanner sc = new Scanner (System.in);   
        obj.input();
        int ch = 0;
        do
        {
            System.out.println("Enter 1. to add, 2. to edit, 3. to delete, 4. to view, 5. to search, 6. to sort and 7. to exit");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1: obj.add();
                break;
                case 2: obj.edit();
                break;
                case 3: obj.delete();
                break;
                case 4: obj.view();
                break;
                case 5: obj.search();
                break;
                case 6: obj.sort();
                break;
                case 7: System.out.println("Thank you");
                break;
                default: System.out.println("Wrong choice");
            } 
        }while (ch != 7);
    }
}

