package arrays2D;
import java.util.*;
class transpose_matrix__N_BY_N_MATRIX
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
        System.out.println("PRINT");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int temp;
        System.out.println("TRANSPOSE");
        for(i=0;i<r;i++)
        {
            for(j=(i+1);j<c;j++)
            {   
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
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