package arrays;
import java.util.*;
class array7__MEAN
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,c,j,s=0;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=s+a[i];
        }
        double mean=s/(double)n;
         System.out.println("MEAN="+mean);
        }
    }