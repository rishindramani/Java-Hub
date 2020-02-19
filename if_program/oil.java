package if_program;
public class oil
{
   public void calc(int t)
   {
       double p;
       if(t>=0&&t<=3)
       {
           p=5+(3*t);
        }
        else
        {
            p=(t-2.5)*(t-2.5)+14;
        }
        {
            System.out.println("production in millions of barrels="+p);
        }
    }
}