public class handsome
{
    public static void main(int n)
    {
        int a,x=n,i,r=0,y,b,s=0;
        while(n!=0)
        {
            a=n%10;
            r=r=(r*10)+a;
            n=n/10;
        }
        y=r;
        
            while(y!=0)
        {  int u;
            for(i=1;i<=3;i++)
           {
            b=y%10;
            s=s+b;
            y=y/10;
            if(i==2)
            {
                break;
            }
        }
       int t=y%10; u=t;
    if(s==u)
    {System.out.println("h");break;}
    else
   { System.out.println("n");break;}
}}}