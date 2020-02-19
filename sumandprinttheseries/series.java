package sumandprinttheseries;
public class series
{
    public void main(int n)
    {
        int i,c=0;
       for(i=1;i<=n;i=i+2)
        {
            c=c+1;
            if(c%2==0)
            {
                System.out.println(-i);
            }
            else
            {
                System.out.println(i);
        }
    }
}
}
                
        
        
        
       