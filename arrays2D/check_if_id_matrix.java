package arrays2D;
import java.util.*;
class check_if_id_matrix
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j,c=0;
        System.out.println("enter n");
        int n=ob.nextInt();
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("print");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==j)&&(a[i][j]==1))
                {
                    c++;
                }
                else if((i!=j)&&(a[i][j]==0))
                {
                    c++;
                }
            }
        }
        if(c==(n*n))
        {
            System.out.println("IDENTITY MATRIX");
        }
        else
        {
            System.out.println("NOT AN IDENTITY MATRIX");
        }
    }
}