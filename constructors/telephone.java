package constructors;
import java.util.*;
public class telephone
{
   String name,add;
   long telno;
   int n;
   double amt;
   Scanner ob=new Scanner(System.in);
   public telephone()
   {
       name="";
       add="";
       telno=0;
       n=0;amt=0.0;
    }
    public telephone(String na1,String add1,long tel1,int n1)
    {
        name=na1;
        add=add1;
        telno=tel1;
        n=n1;
    }
    void calculate()
    {
        if(n<=150)
        {
            amt=500;
        }
        else if(n>150&&n<=300)
        {
            amt=500+(n-150)*1.5;
        }
        else
        {
            amt=500+(150*1.5)+(n-300)*4.2;
        }
        amt=amt+0.12*amt;
    }
    void display()
    {
        System.out.println("name="+name);
        System.out.println("add="+add);
        System.out.println("no of calls="+n);
      System.out.println("Amt bill="+amt);
    }
    static void main(String args[])
    {
        telephone t=new telephone("kalu","chor gali",420840,1600);
       t.calculate();
        t.display();
    }
}
            
    
    
    
    