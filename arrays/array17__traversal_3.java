package arrays;
import java.util.*;
class array17__traversal_3
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,mid;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        if(n%2==0)
        {
            mid=n/2;
        }
        else
        {
            mid=(n+1)/2;
        }
        for(i=0;i<mid;i++)
        {
           int t=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=t;
        }
        System.out.println();
         for(i=0;i<n;i++)
         {
           System.out.println(a[i]);
        }
    }
}


