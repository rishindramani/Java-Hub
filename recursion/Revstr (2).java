package recursion;
import java.util.*;
public class Revstr
{
  static String str,Revst;
    Revstr()
    {
        str="";
        Revst="";
    }
    void getstr()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter string");
         str=ob.nextLine();
        }
        void recrev(int i)
        {
            if(i==0)
            return;
            else
            {
                Revst= Revst+str.charAt(i-1);
            recrev(i-1);
        }
    }
    void check()
    {
        System.out.println(Revst);
    }
    void main()
    {
        Revstr e=new Revstr();
        e.getstr();
        e.recrev(str.length());
        e.check();
    }
}
        



            
        
    
    