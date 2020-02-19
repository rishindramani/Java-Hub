package arrays;
import java.util.*;
class array18__MEDIAN
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
        int x1,x2;
        double median;
        if(n%2==0)
        {
            x1=n/2;
            x2=(n/2)-1;
            median=(a[x1]+a[x2])/2.0;
        }
        else
        {
            x1=(n-1)/2;
            median=a[x1];
        }
        System.out.println("MEDIAN="+median);
    }
}