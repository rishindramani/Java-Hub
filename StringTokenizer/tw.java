package StringTokenizer;
import java.util.*;
public class tw
{
 public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int flag=0,i,d;
        for(i=1;i<=n;i++)
        {
            d=n-i;
            if(i%2==0&&d%2==0)
            {
                System.out.println("YES");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("NO");
        }
    }
}
            
           
            
            
        
        
        