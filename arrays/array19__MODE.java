package arrays;
import java.util.*;
class array19__MODE
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,c,j,max=0,mode=0;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<n;i=i+c)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                mode=a[i];
            }
        }
            System.out.println("MODE="+mode);
        }
    }
