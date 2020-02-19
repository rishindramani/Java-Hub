package sumandprinttheseries;
public class tribonacci__till_n
{
    public void main(int n)
    {
        int a=0,b=1,c=2,i;
        System.out.print(a);
        System.out.print(","+b);
        System.out.print(","+c);
        for(i=4;i<=n;i++)
        {
            int d=a+b+c;
            if(d>n)
            {
                break;
            }
            else
            {
            System.out.print(","+d);
            a=b;
            b=c;
            c=d;
        }
    }
}
 }           
         
     
        
    