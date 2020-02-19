public class factorialseries
{
   public void main(double x,int n)
   {
       double s=0.0;
       int i,j,f;
       for (i=1;i<=n;i++)
       {
           double t=Math.pow(x,i);
           f=1;
           for(j=1;j<=i;j++)
           {
              f=f*j;
            }
            s=s+t/f;
        }
        System.out.println(s);
    }
}