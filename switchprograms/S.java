package switchprograms;

import java.io.*;
public class S
{
   public static void main()throws IOException
   {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("1.volume of cube");
       System.out.println("2.volume of cuboid");
       int ch=Integer.parseInt(ob.readLine());
       double v=1.0;
       switch(ch)
       {
           case 1:
           System.out.println("enter side");
           double r=Double.parseDouble(ob.readLine());      
           v=r*r*r;
           System.out.println(v);
           break;
           case 2:
           System.out.println("enter l and b");
           double l=Double.parseDouble(ob.readLine());
           double b=Double.parseDouble(ob.readLine());
           double h=Double.parseDouble(ob.readLine());
           v=l*b*h;
           System.out.println(v);
           break;
           default:
        }
    }
}