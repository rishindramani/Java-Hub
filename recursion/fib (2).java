package recursion;

import java.util.*;
public class fib
{
    public int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    
        public void main()
    {   Scanner ob=new Scanner(System.in);
        int i;
        System.out.println("enter limit");
     int l=ob.nextInt();
     for(i=1;i<=l;i++)
     {
         int t=fibo(i);
         System.out.println(t);
        }
    }
}
         
        