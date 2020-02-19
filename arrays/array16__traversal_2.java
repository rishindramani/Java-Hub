package arrays;
import java.util.*;
class array16__traversal_2
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
        int t;
        for(i=0;i<mid;i++)
        {
            t=a[i];
            a[i]=a[mid+i];
            a[mid+i]=t;
        }
        System.out.println();
         for(i=0;i<n;i++)
         {
           System.out.println(a[i]);
        }
    }
}



