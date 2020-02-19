package arrays2D;
import java.util.*;
class spiral_inward
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter n");
        int n=ob.nextInt();
        int a[][]=new int[n][n];
        int r=0,c=-1,p;
        int x=0;
        for(i=0;i<n;i++)
        {
         p=(int)Math.pow(-1,i);   
          for(j=0;j<(n-i);j++)
        {  
            c=c+(1*p);
            a[r][c]=++x;
        }
            
          for(j=0;j<(n-1-i);j++)
        {    
            r=r+(1*p);
            a[r][c]=++x;
        }
    }
    for(i=0;i<n;i++)
        {
           
          for(j=0;j<n;j++)
        {  
            if(a[i][j]<10)
            {
                System.out.print(a[i][j]+"  ");
            }
        else
        {
            System.out.print(a[i][j]+" ");
        }
    }
    System.out.println();
}
}
}
            
            
            