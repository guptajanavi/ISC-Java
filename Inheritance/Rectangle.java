package InheritanceDemo;
public class Rectangle
{
    int length, breadth;
    Rectangle(int len, int bre)
    {
        length=len;
        breadth=bre;
    }
    public void printArea()
    {
        System.out.println("Area: " + length*breadth);
    }
    public void printPeri()
    {
        System.out.println("Perimeter: "+2*(length+breadth));
    }
}