package arrays2D;
import java.util.*;
class sort
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
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
        int c[]=new int[n*n];
        int k=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
              c[k]=a[i][j];
        k++;
    }
}


     for(i=0;i<k;i++)
        {
             for(j=0;j<(k-1-i);j++)
             {
                 if(c[j]>c[j+1])
                 {
                     int t=c[j];
                     c[j]=c[j+1];
                     c[j+1]=t;
                    }
                }
            }
    System.out.println("sorted 2D");
    int f=0;
for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[f]);
                f++;
            }
            System.out.println();
        }
    }
}

    
    
    
    