package arrays;
import java.util.*;
class array10__A_minus_B
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
        for(i=0;i<n;i++)
        {
            flag=0;
            for(j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                c[k]=a[i];
                k++;
            }
        }
        System.out.println("A-B ELEMENTS ARE");
        for(i=0;i<k;i++)
        {
          System.out.println(c[i]);
        }
    }
}
            