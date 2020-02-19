package strings;

public class srting8
{
    public static void main()
    {
        String s1="SCHOOL";
        int t=s1.length();
        int i,k,sp=5;
        for(i=(t-1);i>=0;i--)
        {
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            System.out.print(s1.substring(i,t));
            System.out.println();
            sp--;
             }
    }
}
            