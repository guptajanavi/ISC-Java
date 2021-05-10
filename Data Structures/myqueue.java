public class myqueue{
  int q [];
  int size;
  int front, rear;
  public myqueue(){
    size = 3;
    q = new int [size];
    front = rear = - 1;
  }
  public myqueue (int size){
    this.size = size;
    q = new int [size];
    front = rear = -1;
  }
  void insert (int val){
    if (rear == -1){
      rear++;
      front++;
      q [rear] = val;
    }
    else if (rear == size-1)
    System.out.println("Queue full");
    else{
      rear++;
      q [rear] = val;
    }
  }
  int remove (){
    int tmp;
    if (front == -1){
      System.out.println("Queue empty");
      return -999;
    }
    else if (front == rear){
      tmp = q[front];
      reset();
      return tmp;
    }
    else{
      tmp = q[front];
      front++;
      return tmp;
    }
  }
  void reset (){
    front = -1;
    rear = -1;
  }
  void traverse (){
    if (front > -1){
      for (int i = front; i<=rear; i++)
      System.out.print(q[i] + " ");
      System.out.println();
    }
  }
  public static void main (String [] args){
    myqueue ob = new myqueue(5);
    ob.insert(10);    
    ob.traverse();
    ob.insert(20);
    ob.traverse();
    ob.insert(30);
    ob.traverse();
    ob.insert(40);
    ob.traverse();
    ob.insert(50);
    ob.traverse();
    ob.insert(60);
    ob.traverse();
    System.out.println(ob.remove());
    System.out.println(ob.remove());
    System.out.println(ob.remove());
    System.out.println(ob.remove());
    System.out.println(ob.remove());
    System.out.println(ob.remove());
  }
}
