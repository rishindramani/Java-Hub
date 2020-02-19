package strings;

public class srting2
{
    public static void main()
    {
        String s1="LOOHCS";
        int t=s1.length(),sp=5,k;
        int i;
        for(i=1;i<=t;i++)
        {   for(k=1;k<=sp;k++)
            {
              System.out.print(" ");
            }
            System.out.print(s1.substring(0,i));
            System.out.println();
            sp--;
        }
    }
}
            