package if_program;
public class arithmetic
{
        public void calc(double p,int time)
        {
            double rate,si;
            if(time==1)
            {
                rate=0.10;
                si=(p*rate*time);
            }
            else if(time==2)
            {
                rate=0.11;
                si=(p*rate*time);
            }
            else
            {
                rate=0.12;
                si=(p*rate*time);
            }
            {
                System.out.println("simple interest="+si);
            }
        }
    }