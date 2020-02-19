package object;

import java.util.*;
public class Angle1
{
    int deg,min;
    Angle1()
    {
        deg=0;
        min=0;
    }
     Scanner ob=new Scanner(System.in);
     void input()
     {
         System.out.println("enter degree");
         deg=ob.nextInt();
         System.out.println("enter minutes");
         min=ob.nextInt();
        }
        void display()
        {
            System.out.println("deg="+deg+"   "+"min="+min);
        }
        Angle1 sum(Angle1 t1,Angle1 t2)
        {
            Angle1 t3=new Angle1();
            t3.deg=t1.deg+t2.deg;
            t3.min=t1.min+t2.min;
            if(t3.min>=60)
            {
                t3.min=t3.min-60;
                t3.deg++;
            }
            return t3;
        }
        void main()
        {
            Angle1 ob1=new Angle1();
            Angle1 ob2=new Angle1();
            Angle1 ob3=new Angle1();
            ob1.input();
            ob2.input();
            ob3=sum(ob1,ob2);
            ob3.display();
        }
    }