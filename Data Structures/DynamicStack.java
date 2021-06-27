package DataStructures;
import java.util.*;
class DynamicStack          //LIFO
{
    Node head;      //Reference variable
    DynamicStack()
    {
        head=null;
    }

    void push(String a,int b)
    {
        Node temp=new Node();   //an object
        if(temp==null)
            System.out.println("Not enough memory");
        else
        {
            temp.name=a;
            temp.age=b;
            temp.next=null;
            if(head==null)
                head=temp;
            else
            {
                temp.next=head;
                head=temp;
            }
        }
    }

    void pop()
    {
        if(head==null)
            System.out.println("Stack is Empty");
        else
        {
            Node ptr=head;
            System.out.println("Name\tAge");
            System.out.println(ptr.name+"\t"+ptr.age);
            head=head.next;
            ptr=null;
        }
    }

    int count()
    {
        Node ptr=head;
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
        if(head==null)
            System.out.println("Stack is Empty");
        else
        {
            Node ptr=head;
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
            System.out.print("Menu\n1.Push\n2.Pop\n3.Count\n4.Display\n5.Exit\nEnter Choice ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter a Name and Age ");
                String a=sc.next();
                int b=sc.nextInt();
                push(a,b);
                break;
                case 2:
                pop();
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
        DynamicStack ds=new DynamicStack();
        ds.controller();
    }
}