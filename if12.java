
public class if12
{
   public static void main(double ap,char t)
   {
       double namt,d,d1,n2;
       if(t=='L')
       {
           if(ap<=25000)
           {
               d=0.0;
               namt=ap;
            }
            else if(ap>=25001&&ap<=57000)
            {
                d=0.05*ap;
                namt=ap-d;
            }
            else if(ap>=57001&&ap<=100000)
            {
                d=0.075*ap;
                namt=ap-d;
            }
            else
            {
                d=0.10*ap;
                namt=ap-d;
            }
            System.out.println("NET AMOUNT=Rs"+namt);
        }
        else if(t=='D')
        {
            if(ap<=25000)
           {
               d1=0.05*ap;
               namt=ap-d1;
            }
            else if(ap>=25001&&ap<=57000)
            {
                d1=0.075*ap;
                namt=ap-d1;
            }
            else if(ap>=57001&&ap<=100000)
            {
                d1=0.10*ap;
                namt=ap-d1;
            }
            else
            {
                d1=0.15*ap;
                namt=ap-d1;
            }
            System.out.println("NET AMOUNT=Rs"+namt);
        }
        else
        {
            System.out.println("WRONG INPUT");
        }
    }
}

                      