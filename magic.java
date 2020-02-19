
public class magic
{
   public static void main(int n)
   {
       int i,s=0,a;
        while(n!=0)
           {
               a=n%10;
               s=s+a;
               n=n/10;}
            if(s==10)
            {
                System.out.println("magic");
            }
           
                    }
    }
