package DataStructures;
import java.util.Scanner;
class DynamicQueue          //FIFO
{
    Node front,rear;      //Reference variable
    DynamicQueue()
    {
        front=rear=null;
    }
    void addElement(String a,int b)
    {
        Node temp=new Node();   //an object
        if(temp==null)
            System.out.println("Not enough memory");
        else
        {
            temp.name=a;
            temp.age=b;
            temp.next=null;
            if(front==null)
                front=temp;
            else
                rear.next=temp;
            
            rear=temp;
        }
    }
    void removeElement()
    {
        if(front==null)
            System.out.println("Queue is Empty");
        else
        {
            Node ptr=front;
            System.out.println("Name\tAge");
            System.out.println(ptr.name+"\t"+ptr.age);
            front=front.next;
            ptr=null;
            if(front==null)
                rear=null;
        }
    }
    int count()
    {
        Node ptr=front;
        int c=0;
        while(ptr!=null)
        {
            c++;
            ptr=ptr.next;
        }        
        return c;
    }
    void display()
    {
        if(front==null)
            System.out.println("Queue is Empty");
        else
        {
            Node ptr=front;
            System.out.println("Name\tAge");
            while(ptr!=null)
            {
                System.out.println(ptr.name+"\t"+ptr.age);
                ptr=ptr.next;
            }        
        }
    }
    void controller()
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.print("Menu\n1.Add Element\n2.Remove Element\n3.Count\n4.Display\n5.Exit\nEnter Choice ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter a Name and Age ");
                String a=sc.next();
                int b=sc.nextInt();
                addElement(a,b);
                break;
                case 2:
                removeElement();
                break;
                case 3:
                System.out.println("Number of Elements "+count());
                break;
                case 4:
                display();
                break;
                case 5:
                System.out.println("Thank You\n");
                break;
                default:
                System.out.println("INVALID CHOICE\n");
            }
        }while(ch!=5);
    }
    public static void main()
    {
        DynamicQueue dq=new DynamicQueue();
        dq.controller();
    }
}