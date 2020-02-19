package arrays;
import java.util.*;
class array11__B_minus_A
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter limit 1");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array 1");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter limit 2");
        int m=ob.nextInt();
        int b[]=new int[m];
        System.out.println("enter elements in array 2");
        for(i=0;i<m;i++)
        {
            b[i]=ob.nextInt();
        }
        int c[]=new int[n];
        int k=0,flag;
        for(i=0;i<m;i++)
        {
            flag=0;
            for(j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                c[k]=b[i];
                k++;
            }
        }
        System.out.println("B-A ELEMENTS ARE");
        for(i=0;i<k;i++)
        {
          System.out.println(c[i]);
        }
    }
}
            