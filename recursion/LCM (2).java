
package recursion;
import java.util.*;
public class LCM
{
    void lcm(int a,int b,int i)
    {
        if(i%a==0&&i%b==0)
        {
            System.out.println("lcm="+i);
        }
        else
        {
            lcm(a,b,++i);
        }
    }
    void main()
    {  Scanner ob=new Scanner(System.in);
        System.out.println("enter");
        int a1=ob.nextInt();
        int b1=ob.nextInt();
        lcm(a1,b1,a1);
    }
}