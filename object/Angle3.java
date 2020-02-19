package object;

public class Angle3
{
    int deg,min;
   void input(int d1,int m1)
   {
   deg=d1;
   min=m1;
}
     void display()
        {
            System.out.println("deg="+deg+"   "+"min="+min);
        }
        Angle3 sum(Angle3 t1,Angle3 t2)
        {
            Angle3 t3=new Angle3();
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
            Angle3 ob1=new Angle3();
            Angle3 ob2=new Angle3();
            Angle3 ob3=new Angle3();
            ob1.input(40,18);
            ob2.input(32,10);
             ob3=sum(ob1,ob2);
            ob3.display();
        }
    }