package strings;

public class srting5
{
    public static void main()
    {
        String s1="SCHOOL";
        int t=s1.length(),sp=0,k;
        int i;
        for(i=t;i>=1;i--)
        {   for(k=1;k<=sp;k++)
            {
              System.out.print(" ");
            }
            System.out.print(s1.substring(0,i));
            System.out.println();
            sp++;
        }
    }
}
            