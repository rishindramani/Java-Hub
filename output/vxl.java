package output;
import java.util.*;
class vxl
{
   int x,y;
   vxl()
   {
       x=5;
       y=10;
    }
    protected void access()
    {
        int a=50,b=100;
        vxl vin=new vxl();
        System.out.println("object created");
        System.out.println("I am X="+x);
        System.out.println("I am Y="+y);
    }
}