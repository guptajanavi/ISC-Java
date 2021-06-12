package DataStructures;
import java.util.*;
class staticStack{
    int a[], top;
    staticStack(){
        a = new int[1];
        top = -1;
    }

    staticStack (int size){
        a = new int[size];
        top = -1;
    }

    void push(int x){
        if (top == a.length - 1)
            System.out.println("Stack is full");
        else
            a[++top] = x;
    }

    void pop(){
        if (top == - 1)
            System.out.println("Stack is empty");
        else
            System.out.println("Number popped is "+ a[top--]);
    }

    void display(){
        if (top == -1)
            System.out.println("Stack is empty");
        else{
            for (int i =top; i>=0; i--)
                System.out.println(a[i]);
        }
    }
    
    int count(){
        return top+1;
    }

    void controller(){
        Scanner sc = new Scanner (System.in);
        int ch;
        do{
            System.out.print("Menu\n1. Push\n2. Pop\n3. Count\n4. Display\n5. Exit\n Enter choice");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                System.out.print("Enter a number");
                int n = sc.nextInt();
                push (n);
                break;
                case 2:
                pop();
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
        staticStack ss = new staticStack(5);
        ss.controller();
    }
}