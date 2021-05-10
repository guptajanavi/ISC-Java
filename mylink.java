class node{
  int data;
  node next;
}
public class mylink{
    node start;
    void addb (int x){
      node temp = new node ();
      temp.data = x;
      temp.next = null;
      if (start == null)
        start = temp;
      else{
        temp.next = start;
        start = temp;
      }
    }
    void traverse(){
      for (node ptr = start; ptr!=null; ptr = ptr.next){
        System.out.print(ptr.data + " ");
      }
      System.out.println();
    }
    void adde (int x){
      node temp = new node();
      temp.data = x;
      temp.next = null;
      node ptr;
      for (ptr = start; ptr.next!=null; ptr = ptr.next);
      ptr.next = temp;
    }
    int delete(int x){
      node prev;
      node ptr;
      for (prev = start, ptr = start.next; ptr.data != x; prev = ptr, ptr = ptr.next);
        prev.next = ptr.next;
      return ptr.data;    
    }
    int delPos (int pos){
      node ptr;
      node prev; 
      int ctr = 0;
      for (prev = start, ptr = start.next; ptr!=null, prev= start ){
        ctr++;
      }
    }
    public static void main (String [] args){
      mylink ob = new mylink();
      ob.addb(10);
      ob.traverse();
      ob.addb(20);
      ob.traverse();
      ob.addb(30);
      ob.traverse();
      ob.addb(40);
      ob.traverse();
      ob.adde(50);
      ob.addb(60);
      ob.traverse();
      ob.delete(50);
      ob.traverse();
    }
  }