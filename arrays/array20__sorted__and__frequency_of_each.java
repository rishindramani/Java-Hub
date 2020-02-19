package arrays;
import java.util.*;
class array20__sorted__and__frequency_of_each
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
        int k=0,d=0;int j;
        for(i=0;i<n;i++)
        {
        for(j=0;j<(n-1-i);j++)
             {
                 if(a[j]>a[j+1])
                 {
                     int t=a[j];
                     a[j]=a[j+1];
                     a[j+1]=t;
                    }
                }
            }
            for(i=0;i<n;i++)
            {
                b[k]=a[i];
                k++;
            }
            int m,l,c;
            for(m=0;m<n;m+=c)
            {
                d++;
                c=0;
            for(l=0;l<n;l++)
            {
                if(b[m]==b[l])
                {
                    c++;
                }
            }
            System.out.println("frequency of"+" "+b[m]+" "+"is"+" "+c);
        }
        System.out.println(d);
    }
}
            