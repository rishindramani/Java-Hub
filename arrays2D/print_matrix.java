package arrays2D;
import java.util.*;
class print_matrix
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter rows");
        int r=ob.nextInt();
        System.out.println("enter columns");
        int c=ob.nextInt();
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}