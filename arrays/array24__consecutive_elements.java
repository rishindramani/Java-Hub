package arrays;
import java.util.*;
class array24__consecutive_elements
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
        }System.out.println();
        for(i=0;i<n-1;i++)
        {
            if(a[i+1]-a[i]==1)
            {
               System.out.println(a[i]+" "+(a[i+1]));
            }
        }
    }
}
                