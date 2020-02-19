package nestedpatterns;
public class nested27
{
    public static void main()
    {
        int i,j;
        for(i=1;i<=9;i+=2)
        {
            for(j=i;j<=(i+8);j+=2)
            {   if(j<10)
                {
                System.out.print(j);
            }
            else
            {
                System.out.print(j-10);
            }}
            System.out.println();
        }
    }
}
