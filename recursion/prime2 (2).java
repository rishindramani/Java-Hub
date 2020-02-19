
package recursion;
import java.util.*;
public class prime2
{   int c;
    void prime(int n,int i)
    {     if(i<=n)
        {
            if(n%i==0)
            {
                c++;
                  }
            prime(n,++i);
        }
        
                  else
    {
        return;
    }
}
        void main()
    {  c=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter");
         int n=ob.nextInt();
      prime(n,1);
        
    }
}