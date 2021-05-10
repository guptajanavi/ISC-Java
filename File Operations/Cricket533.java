package FileHandling;
import java.io.*;
import java.util.*;
class Cricket533
{
    public static void main() throws IOException  
    {
        FileReader fr=new FileReader("Friends.Txt");
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(System.in);
        String s,n;
        int r,i;
        double avg;
        String[] name = new String[6];
        int[] runs = new int[6];
        int[] innings = new int[6];
        int[] average = new int[6];

        System.out.println("Name\tRuns\tInnings\tAverage");
        int k = 0;
        do
        {
            s=br.readLine();    
            if(s!=null)
            {
                StringTokenizer st=new StringTokenizer(s,"~");
                n=st.nextToken();
                r=Integer.parseInt(st.nextToken());
                i=Integer.parseInt(st.nextToken());
                avg=(double)r/i;
                name[k] = n;
                runs[k] = r;
                innings[k] = i;
                average[k] = r/i;
                k++;
            }
        }while(s!=null);   
        br.close();

        int temp;
        String tmp;
        for( i = 0; i<runs.length; i++)
        {

            for(int j = 0; j<runs.length - i - 1; j++)
            {
                if(runs[j]<runs[j+1])
                {
                    temp = runs[j];
                    runs[j] = runs[j+1];
                    runs[j+1] = temp;

                    temp = innings[j];
                    innings[j] = innings[j+1];
                    innings[j+1] = temp;

                    tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    temp = average[j];
                    average[j] = average[j+1];
                    average[j+1] = temp;
                }

            }
        }
        for( i = 0; i<runs.length; i++)
            System.out.println(name[i]+"\t"+runs[i]+"\t"+innings[i]+"\t"+average[i]);
    }
}