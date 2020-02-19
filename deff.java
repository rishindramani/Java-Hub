public class deff
{
    public void main(int n)
    {
        int i,sef=0,sof=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            if(i%2==0)
            {
                   sef=sef+i;
                }
else
{
sof=sof+i;
}
System.out.println(sef);
System.out.println(sof);
}
}
}
