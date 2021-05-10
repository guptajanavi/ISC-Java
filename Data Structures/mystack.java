import java.util.*;
public class mystack{
  int st [];
  int size;
  int top;
  public mystack (){
    size = 3;
    st = new int [size];
    top = -1;
  }
  public mystack (int size){
    this.size = size;
    st = new int [size];
    top = -1;
  }
  void push (int x){
    if (top < size-1){
      top++;
      st[top] = x;
    }
    else
    System.out.println("Stack overflow");
  }
  int pop (){
    if (top == -1)
    return -99999;
    else 
    return st[top--];
  }
  void traverse(){
    for (int i = 0; i <= top; i++)
    System.out.print(st[i] + " ");
    System.out.println();
  }
  public static void main (String [] args){
    mystack ob = new mystack ();
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter array elements");
    for (int i = 0; i<5; i++){      
    ob.push(sc.nextInt());
    ob.traverse();
    }
    for (int i = 4; i>=0; i--)
    ob.pop();
  }
}