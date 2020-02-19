package arrays2D;
import java.util.*;
class add_sub
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter n");
        int n=ob.nextInt();System.out.println("enter matrix 1");
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("enter matrix 2");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=ob.nextInt();
            }
            
        }
        System.out.println("ADD");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print((a[i][j])+(b[i][j]));
            }
            System.out.println();
        }
        System.out.println("SUB");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print((a[i][j])-(b[i][j]));
            }
            System.out.println();
        }
    }
}