public class company
{
    public void main(double basicsalary)
    {
        double da,hra,pf,netsalary;
        if(basicsalary>=10000&&basicsalary<=15000)
        {
            hra=0.05*basicsalary;
            da=0.06*basicsalary;
            pf=0.02*basicsalary;
            netsalary=basicsalary+(hra+da+pf);
        }
        else if(basicsalary>15000)
        {
            hra=0.03*basicsalary;
            da=0.02*basicsalary;
            pf=0.01*basicsalary;
            netsalary=basicsalary+(hra+da+pf);
        }
        else if(basicsalary>=5000&&basicsalary<=10000)
        {
            hra=0.08*basicsalary;
            da=0.07*basicsalary;
            pf=0.09*basicsalary;
            netsalary=basicsalary+(hra+da+pf);
        }
        else if(basicsalary>10000)
        {
            hra=0.05*basicsalary;
            da=0.04*basicsalary;
            pf=0.03*basicsalary;
            netsalary=basicsalary+(hra+da+pf);
        }
        else
        {
            hra=0.0;
            da=0.0;
            pf=0.0;
            netsalary=basicsalary;
        }
        {
            System.out.println(hra);
            System.out.println(da);
            System.out.println(pf);
            System.out.println(netsalary);
        }
    }
}