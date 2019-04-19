package object;

public class Angle2 extends Mytime
{
    int deg,min;
    Angle2()
    {
        deg=0;
        min=0;
    }
    Angle2(int d1,int m1)
    {
        deg=d1;
        min=m1;
    }
        void display()
        {
            System.out.println("deg="+deg+"   "+"min="+min);
        }
        Angle2 sum(Angle2 t1,Angle2 t2)
        {
            Angle2 t3=new Angle2(0,0);
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
            Angle2 ob1=new Angle2(40,18);
            Angle2 ob2=new Angle2(50,58);
            Angle2 ob3=new Angle2(0,0);
             ob3=sum(ob1,ob2);
            ob3.display();
        }
    }