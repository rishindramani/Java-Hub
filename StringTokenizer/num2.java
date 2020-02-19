package StringTokenizer;
import java.util.*;
public class num2
{
 public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int r=ob.nextInt();
        long a[]=new long[n];
        int i,k=0;
        
           for(i=1;i<=n;i+=2)
        {
            a[k]=i;
            k++;
        }
         for(i=2;i<=n;i+=2)
        {
            a[k]=i;
            k++;
        }
        System.out.println(a[r-1]);
    }
}