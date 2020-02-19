package object;

import java.util.*;
public class Angle4
{
    int deg,min;
    Angle4()
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
        Angle4 sum(Angle4 t1)
        {
            Angle4 t3=new Angle4();
            t3.deg=t1.deg+deg;
            t3.min=t1.min+min;
            if(t3.min>=60)
            {
                t3.min=t3.min-60;
                t3.deg++;
            }
            return t3;
        }
        void main()
        {
            Angle4 ob1=new Angle4();
           Angle4 ob3=new Angle4();
            ob1.input();
            input();
            ob3=sum(ob1);
            ob3.display();
        }
    }