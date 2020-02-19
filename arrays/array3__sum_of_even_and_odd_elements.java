package arrays;
import java.util.*;
class array3__sum_of_even_and_odd_elements
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
            if(a[i]%2==0)
            {
                s1=s1+a[i];
            }
            else
            {
                s2=s2+a[i];
            }
        }
        System.out.println("even no's sum="+s1);
        System.out.println("odd no's sum="+s2);
    }
}