public class sumtillsingledigit
{
    public void main(int n)
    {
        while(n>9)
        {
            int s=0,a;
            while(n!=0)
            {
                a=n%10;
                s=s+a;
                n=n/10;
            }
            n=s;
        }
        System.out.println(n);
    }
}
                