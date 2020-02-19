public class threedno
{
    public static void main(int n)
    {
        int i,s,sum=0,t;
        if(n>=100&&n<=999)
        {
        i=n/100;
        t=n%10;
        s=(n/10)%10;
        sum=sum+(i+s+t);
        System.out.println(sum);
    }
    else
    System.out.println("invalid no");
}
}
    