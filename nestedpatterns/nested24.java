package nestedpatterns;
public class nested24
{
    public static void main()
    {
        int x=1,i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(x);
                if(x==9)
                {
                    x=1;
                }
                else
                {
                    x=x+2;
                }
            }
            x=2*i+1;
            System.out.println();
        }
    }
}