package InheritanceDemo;
class decToHexaDec extends numberDemo{
    void convert(int n)
    {
        String hex="";
        int r;
        while(n>0)
        {
            r=n%16;
            if ( r<= 9)
            {
                hex=r+hex;
            }
            else
            {
                hex=hex+(char) (r + 55);
            }
            n/=16;
        }
        System.out.println("Hexa decimal equivalent "+hex);
    }
}