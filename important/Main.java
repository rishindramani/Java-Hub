package important;

import java.util.*;
class Main
{
   public static void main(String args[])
  {
  Scanner ob=new Scanner(System.in);
  int t=ob.nextInt();
  int i,n,c=0;
  while(t>0)
  {
       n=ob.nextInt();
       i=1;
       for(i=1;i<=n;i++)
         {
             int sqrt = (int) Math.sqrt(i);
             int cu=(int)Math.pow(i,(1/3));
            if ((sqrt*sqrt==i)||(cu*cu*cu==i)) 
            {
                c++;
            }

        }
        t--;
         System.out.println(c);
    }
   
}
}