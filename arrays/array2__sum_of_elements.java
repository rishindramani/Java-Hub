package arrays;
import java.util.*;
class array2__sum_of_elements
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,s=0;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[5];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("SUM");
        for(i=0;i<n;i++)
        {
         s=s+a[i];
        }
        System.out.println(s);
    }
}