package object;

public class number
{
    private int x;
   void setnum(int y)
   {
   x=y;
}
     void shownum()
        {
            System.out.println(x);
        }
        number hcf(number t1)
        {
            number t2=new number();
            for(int i=1;i<=t1.x;i++)
            {
            if((t1.x%i==0)&&(x%i==0))
            {
                t2.x=i;
            }
        }
        return t2;
    }
        number lcm(number t3)
        {
            number t4=new number();
             t4.x=(t3.x*x)/(t2.x);
             return t4;
            }
          void main()
        {
            number ob1=new number();
            number ob2=new number();
            number ob3=new number();
            ob1.setnum(4);
            setnum(3);
             ob2=hcf(ob1);
             ob3=lcm(ob1);
            ob3.shownum();
        }
    }