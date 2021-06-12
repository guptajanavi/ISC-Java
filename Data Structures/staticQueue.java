package DataStructures;
import java.util.*;
class staticQueue{
    int a[], front, rear;
    staticQueue(){
        a = new int[1];
        front = rear = -1;
    }

    staticQueue(int size){
        a = new int[size];
        front = rear = -1;
    }

    void addElement(int x){
        if (rear == a.length - 1)
            System.out.println("Queue is full");
        else{
            if(front == -1)
                front = rear = 0;
            else
                rear++;
        }
        a[rear] = x;
    }

    void removeElement(){
        if (front == 1)
            System.out.println("Queue is empty");
        else{            
            System.out.println("Number removed is "+ a[front++]);
            if (front>rear)
                front = rear = -1;
        }
    }

    void display(){
        if (rear == -1)
            System.out.println("Queue is empty");
        else{
            for (int i =front; i<=rear; i++)
                System.out.println(a[i]);
        }
    }

    int count(){
        if (front == -1)
            return 0;
        else
            return rear - front+1;
    }

    void controller(){
        Scanner sc = new Scanner (System.in);
        int ch;
        do{
            System.out.print("Menu\n1. Add element\n2. Remove element\n3. Count\n4. Display\n5. Exit\n Enter choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                System.out.print("Enter a number");
                int n = sc.nextInt();
                addElement(n);
                break;
                case 2:
                removeElement();
                break;
                case 3:
                System.out.println("Number of elements "+ count());
                break;
                case 4:
                display();
                break;
                case 5:
                System.out.println("Thank you\n");
                break;
                default:
                System.out.println("Invalid Choice\n");
            }
        }while (ch!= 5);
    }

    public static void main(){
        staticQueue ss = new staticQueue(5);
        ss.controller();
    }
}
