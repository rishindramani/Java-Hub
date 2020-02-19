package arrays;
import java.util.*;
class array15__traversal_1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<(n-1);i+=2)
        {
           int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
        }
        System.out.println();
         for(i=0;i<n;i++)
         {
           System.out.println(a[i]);
        }
    }
}


