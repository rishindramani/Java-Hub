
package recursion;
import java.util.*;
public class print_factors
{  int c;
    void factor(int n,int i)
    {     if(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i);
                  }
            factor(n,++i);
        }
        
                  else
    {
        return;
    }
}
        void main()
    {  Scanner ob=new Scanner(System.in);
        System.out.println("enter");
         int n=ob.nextInt();
        factor(n,1);
    }
}