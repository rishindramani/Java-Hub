
public class PALLANDROME
{
   public static void main(int n)
   {
       int i,t;
       if(n>=100&&n<=999)
       {
           i=n/100;
           t=n%10;
           if(i==t)
           {
               System.out.println("pallandrome");
            }
            else
            {
                System.out.println("not pallandrome");
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}