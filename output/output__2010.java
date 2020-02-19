package output;

public class output__2010
{
      void num(int n)
      {
             if(n>0)
            { 
                  System.out.print(n+" ");
                     num(n-2);
                 System.out.print(n+" ");
                }
            }
                 
      String num2(int n)
      {
             if(n<=0)
             
            return"";
                 return(num2(n-1)+n+" ");
                }
        }
    
    