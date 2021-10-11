
package DataStructures;
import java.util.*;
public class LinkedList
{       
    Node head;      //Reference variable
    Node head2;
    LinkedList()
    {
        head=null;
    }

    void addAtBegin(String a,int b)
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

    void addAtEnd(String a,int b)
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
                Node ptr=head;
                while(ptr.next!=null)   //Moving to Last Node
                    ptr=ptr.next;

                ptr.next=temp;      //Adding the new node at the end
            }
        }
    }

    void insertByPosition(String a,int b,int pos)
    {
        int c=count();
        if(pos<1 || pos>c+1)
            System.out.println("Invalid Position");        
        else
        {
            if(pos==1)
                addAtBegin(a,b);
            else if(pos==c+1)
                addAtEnd(a,b);
            else
            {
                Node temp=new Node();   //an object
                if(temp==null)
                    System.out.println("Not enough memory");
                else
                {
                    temp.name=a;
                    temp.age=b;
                    temp.next=null;

                    Node ptrPrev=head,ptrCur=head;
                    for(int i=1;i<pos;i++)
                    {
                        ptrPrev=ptrCur;
                        ptrCur=ptrCur.next;
                    }
                    temp.next=ptrCur;
                    ptrPrev.next=temp;
                }
            }
        }
    }

    void removeFirstNode(){
        if(head==null) System.out.println("Linked List is empty"); 
        else {
            Node ptr=head;
            System.out.println("Name\tAge");
            System.out.println(ptr.name+"\t"+ptr.age);
            head=head.next;
            ptr=null;
        }
    }

    void removeLastNode(){
        if(head==null) System.out.println("Linked List is empty");
        else if(head.next==null) { 
            head=null; 
            System.out.println("Linked List is now empty"); 
        }
        else{
            Node temp = head;
            while(temp.next.next !=null){temp = temp.next;}
            temp.next=null;
        }
    }

    void removeByPos(int n){
        if(n>=count()) System.out.println("Enter number in range");
        else if(head==null) System.out.println("Linked List is empty");
        else if(n==0) {removeFirstNode();}
        else{
            Node temp = head;
            for(int i = 1; i<n && temp!=null; i++){
                temp = temp.next;
            }
            Node nexttonextnode = temp.next.next;
            temp.next = nexttonextnode;
        }
    }

    boolean search(String n){
        Node temp = new Node();
        if (head==null) System.out.println("Linked list is empty");
        else {
            temp = head;
            while (temp != null){
                if (temp.name.equalsIgnoreCase(n))
                    return true;
                temp = temp.next;
            }
            return false;
        }
        return false;
    }

    int count(){
        if(head==null) System.out.println("Linked List is empty");
        Node temp = head;
        int c= 1;
        while(temp.next!=null){
            temp = temp.next;
            c++;
        }    
        return c;
    }
    void display(Node head)
    {   
        System.out.println("\n");System.out.println("\n");
        if(head==null)
            System.out.println("Link List is Empty");
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

    void findLargest(){
        if(head==null) System.out.println("Linked List is empty");
        Node largest = head;
        Node temp = head;
        while(temp!=null){
            if(temp.age>largest.age) largest = temp; 
            temp=temp.next;
        }
        System.out.println("Largest age is " + largest.age);
        System.out.println("Largest person's name is " + largest.name); 
    }


    void findSmallest(){
        /* if(head==null) System.out.println("Linked List is empty");
        else{f
            int smallest = head.age;
            Node temp = head;
            while(temp.next!=null){
                if(temp.age<smallest) smallest = temp.age;
                temp = temp.next;
            }
            System.out.println("Smallest age is " + smallest);
        } */

        if(head==null) System.out.println("Linked List is empty");
        Node smallest = head;
        Node temp = head;
        while(temp!=null){
            if(temp.age<smallest.age) smallest = temp; 
            temp=temp.next;
        }
        System.out.println("Chintu age is " + smallest.age);
        System.out.println("Chintu person's name is " + smallest.name); 
    }

    void split(int n){
        
        Node temp = head;
        int c = 0;
        while(c<n){
            temp = temp.next;
            c++;
        }
        head2 = temp.next;
        temp.next = null;

        display(head); display(head2);
    }

    void merge(){
        Node temp = head;
        while(temp.next !=null){temp = temp.next;} 
        temp.next = head2;
        display(head);  
        head2 = null;
    }

    void controller()
    {
        Scanner sc = new Scanner(System.in);
        String a;
        int ch,b,c;
        do
        {
            System.out.println("Link List\nMENU\n1. To add at beginning \n2. Add at end \n3. Insert by position \n4. Delete from beginning\n5. Delete from End\n6. Delete by position\n7. Search \n8. Display \n9. Count\n10. Find largest \n11. Find Smallest\n12. Split list \n13. merge list \n14. Exit");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                System.out.print("Enter a Name and Age ");
                a=sc.next();
                b=sc.nextInt();
                addAtBegin(a,b);
                break;
                case 2:
                System.out.print("Enter a Name and Age ");
                a=sc.next();
                b=sc.nextInt();
                addAtEnd(a,b);
                break;
                case 3:
                System.out.print("Enter a Name and Age ");
                a=sc.next();
                b=sc.nextInt();
                System.out.print("Enter Position ");
                c=sc.nextInt();
                insertByPosition(a,b,c);
                break;
                case 4: removeFirstNode();
                break;
                case 5: removeLastNode();
                break;
                case 6: System.out.println("Enter position to be deleted"); int n = sc.nextInt(); removeByPos(n);
                break;
                case 7: 
                    System.out.println("Enter name to search");
                    String name = sc.nextLine();
                    if (search(name) == true)
                        System.out.println("It exists");
                    else
                        System.out.println("It does not exist");
                break;
                case 8:
                display(head); display(head2);
                break;
                case 9:
                System.out.println("Number of Elements "+count());
                break;
                case 10: findLargest();
                break;
                case 11: findSmallest();
                break;
                case 12: System.out.println("Enter where to split"); int k = sc.nextInt(); split(k);
                break;
                case 13: merge();
                break;
                case 14: System.out.println("Exit successfully ");
                break;
                default:
                System.out.println("Invalid Choice");
            }
        }while (ch!=14);
    }

    public static void main(String[] args)
    {
        LinkedList obj=new LinkedList();
        obj.controller();
    }
}