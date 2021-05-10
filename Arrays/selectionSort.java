import java.util.*;
class selectionSort
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t,p;
        System.out.println("Enter 5 numbers ");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }                                           
                                                    
                                                           
        for(i=0;i<a.length;i++){                                          p=i;                                           
            for(j=i+1;j<a.length;j++){                                    if(a[p]>a[j])                            
                p=j; 
            }                                          
            t=a[i];                                 
            a[i]=a[p];                                     
            a[p]=t;                                     
        }                                                  
        System.out.println("In Ascending order: ");  
        for(i=0;i<a.length;i++)                            
        {                                                  
            System.out.println(a[i]);                      
        }
    }
}
