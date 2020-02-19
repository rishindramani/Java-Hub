package sumandprinttheseries;

public class sumseries1
{
    public static void main(int n)
    {
        int i,s=0;
        for(i=1;i<=n;i++)
        {
            s=s+(i*i*i);
        }
       { 
           System.out.println(s);
        }
    }
}