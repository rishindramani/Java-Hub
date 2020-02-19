package if_program;
public class mysalary
{
      public void main()
      {
          double salary=12000;
          double da=0.40*salary;
          double hra=0.15*salary;
          double pf=0.10*salary;
          double grosssalary=salary+da+hra;
          double netsalary=grosssalary-pf;
          System.out.println("gross salary="+grosssalary);
          System.out.println("net salary="+netsalary);
        }
    }