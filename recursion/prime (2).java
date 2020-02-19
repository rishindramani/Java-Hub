
package recursion;
import java.util.*;
public class prime
{  int c;
    void prime(int n,int i)
    {     if(i<=n)
        {
            if(n%i==0)
            {
                c++;
            }
            prime(n,++i);
        }
        
                if(c==2)
        {
            System.out.println("prime");
    }
    else
    {
        System.out.println("not prime");
    }
}
        void main()
    {  Scanner ob=new Scanner(System.in);
        System.out.println("enter");
         c=0;
        int n=ob.nextInt();
        prime(n,1);
    }
}