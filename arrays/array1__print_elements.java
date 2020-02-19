package arrays;
import java.util.*;
class array1__print_elements
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
              a[0]=10;
        System.out.println("PRINT");
        for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
}