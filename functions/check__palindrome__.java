package functions;
import java.util.*;
public class check__palindrome__
{     public  static int pal(int n)
    {  int r=0,x=n;
        while(n!=0)
            {    
                int a=n%10;
                r=(r*10)+a;
                n=n/10;
            }
          return r;
        }
    public static void sum()
    {    Scanner ob=new Scanner(System.in);
       
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
            int t=pal(a[i]);
            if(t==a[i])
            {
            System.out.println("pal");
            }
            else
            {
                System.out.println("not pal");
            }
    }
}
}
 