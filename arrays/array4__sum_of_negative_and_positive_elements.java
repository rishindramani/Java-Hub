package arrays;
import java.util.*;
class array4__sum_of_negative_and_positive_elements
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,s1=0,s2=0;
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
                s1=s1+a[i];
            }
            else
            {
                s2=s2+a[i];
            }
        }
        System.out.println("sum of positive no's="+s1);
        System.out.println("sum of positive no's="+s2);
    }
}