package arrays2D;
import java.util.*;
class index_of_primes
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j,f=0;
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
        System.out.println("print");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        
        
        System.out.println("index of primes");
        
        
        
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {    f=0;
                int x=a[i][j];
                
               for(int k=1;k<=x;k++)
        { 
            if(x%k==0)
            {
                f++;
            }
        }
                if(f==2)
            {
            System.out.println("="+"("+(i+1)+","+(j+1)+")");
        }
                 }
    }
}
}

    

