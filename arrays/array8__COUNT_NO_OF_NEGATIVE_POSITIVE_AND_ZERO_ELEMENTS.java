package arrays;
import java.util.*;
class array8__COUNT_NO_OF_NEGATIVE_POSITIVE_AND_ZERO_ELEMENTS
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,c=0,d=0,e=0;
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
            if(a[i]>0)
            {
                c++;
            }
            if(a[i]<0)
            {
                d++;
            }
            if(a[i]==0)
            {
                e++;
            }
        }
        System.out.println("no of positive terms="+c);
        System.out.println("no of negative terms="+d);
        System.out.println("no of ZEROS="+e);
    }
}