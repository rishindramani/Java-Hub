package arrays;
import java.util.*;
class array13__first_all_negative_then_all_positive
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
        int b[]=new int[n];
        int k=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                b[k]=a[i];
                k++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>=0)
            {
                b[k]=a[i];
                k++;
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
           System.out.println(b[i]);
        }
    }
}