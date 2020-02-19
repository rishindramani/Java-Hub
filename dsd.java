public class dsd
{
    public void main(int n)
    {
        int a,s=0;
        if(n>=100&&n<=999)
        {
            while(n!=0)
            {
                a=n%10;
                s=s+a;
                n=n/10;
            }
            System.out.println(s);
        }
        else
        System.out.println("invalid no");
    }
}