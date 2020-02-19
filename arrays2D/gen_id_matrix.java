package arrays2D;
import java.util.*;
class gen_id_matrix
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter n");
        int n=ob.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
        System.out.println();
        }
    }
}