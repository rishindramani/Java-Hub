package sumandprinttheseries;
public class hub
{
    public void main(int n)
    {
        int i,s=0;                 //1-2+3-4+5-6......//
        for(i=1;i<=n;i++)
        if(i%2==0)
        {
            s=s-(i*i*i);
        }
        else
        {
            s=s+(i*i*i);
        }
        System.out.println(s);
    }
}


