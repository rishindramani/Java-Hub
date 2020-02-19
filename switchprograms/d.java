package switchprograms;
import java.util.*;
public class dec
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
         int n=ob.nextInt();
       int a,i=0;String b[]={"A","B","C","D","E","F"};
       int x=n;String s1="",s2="";
       while(n!=0)
       {
           a=n%16;
           String a1=String.valueOf(a);
           if(a==10)
           {
               s1=b[0];
            }
            else if(a==11)
           {
               s1=b[1];
            }
            else if(a==12)
           {
               s1=b[2];
            }
            else if(a==13)
           {
               s1=b[3];
            }
           else if(a==14)
           {
               s1=b[4];
            }
            else if(a==15)
           {
               s1=b[5];
            }
            else
            {
                s1=a1;}
           int t=(int)Math.pow(10,i);int q=a*t;
           i++;
           s2=s1+q+s2;
           
           n=n/16;
        }
        System.out.println(s2);
    }
}
