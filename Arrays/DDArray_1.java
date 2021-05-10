package DDArrayDemo;
class DDArray_1
{
    public static void main()
    {
        int A[] [] = new int [] []{{10,20,30,35,40,50,60,65,70,80,90,95}};
        int r, c;
        System.out.println("Original Array is ");
        for ( r=0; r<A.length; r++)
        {
            for ( c=0; c<A[r].length; c++)
            {
                System.out.print(A[r][c]  + "\t");
            }
            System.out.println();
        }
        System.out.println("Reversed array is ");
        for ( r=A.length-1; r>=0; r--)
        {
            for ( c=A[r].length-1; c>=0; c--)
            {
                System.out.print(A[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println("Reversed array is ");
    }
}