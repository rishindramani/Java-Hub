package arrays2D;


import java.util.*;
class sort_outer
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
        int b[]=new int[n*n];
        
        
        for(i=0;i<n;i++)//convert to 1d//////2
        {
         p=(int)Math.pow(-1,i);   
          for(j=0;j<(n-1);j++)
        {  
            c=c+(1*p);
            b[x]=a[r][c];x++;
        }
            
          for(j=0;j<(n-1-i);j++)
        {    
            r=r+(1*p);
           b[x]=a[r][c];
            x++;
        }
    }
        
    for(i=0;i<n;i++)
        {
             for(j=0;j<(n-1-i);j++)
             {
                 if(b[j]>b[j+1])
                 {
                     int t=b[j];
                     b[j]=b[j+1];
                     b[j+1]=t;
                    }
                }
            }
        for(i=0;i<n;i++)//convert to 1d//////2
        {
         p=(int)Math.pow(-1,i);   
          for(j=0;j<(n-1);j++)
        {  
            c=c+(1*p);
            a[r][c]=b[x];
            x++;
        }
            
          for(j=0;j<(n-1-i);j++)
        {    
            r=r+(1*p);
           a[r][c]=b[x];
            x++;
        }
    }
    
    for(i=0;i<n;i++)///printing
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

