import java.util.*;
class pattern1
{
  public static void main(String[] args) 
  {   
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("You entered "+num);   
    for(int i=0;i<num;i++) //rows
    {
      for(int j=0;j<num;j++)//columns
      {
        System.out.print(j+1 + " ");
      }
      System.out.println();
    }    
  }
}
