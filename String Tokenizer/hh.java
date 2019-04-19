package StringTokenizer;
import java.util.*;
public class hh
{
 public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        String s;
        s=ob.nextLine();
         int i,j,n;
         StringTokenizer str=new StringTokenizer(s,"+");
         n=str.countTokens();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(str.nextToken());
        }
                  
        for(i=0;i<n;i++)
        {
             for(j=0;j<(n-1-i);j++)
             {
                 if(a[j]>a[j+1])
                 {
                     int t=a[j];
                     a[j]=a[j+1];
                     a[j+1]=t;
                    }
                }
            }
             for(i=0;i<n;i++)
        {
            if(i!=n-1)
            System.out.print(a[i]+"+");
            else
            System.out.print(a[i]);
    }
}
}
            
           