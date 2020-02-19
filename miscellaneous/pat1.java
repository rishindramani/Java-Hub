public class pat1
{
   public void mnj()
   {
       int i,j,k,sp=3;
       for(i=1;i<=4;i++)
       {
           for(k=1;k<=sp;k++)
           {
               System.out.print(" ");
            }
           for(j=1;j<=i;j++)
           {
               System.out.print("A ");
            }
                   System.out.println();
               sp--;    
                }
                sp=1;
        for(i=3;i>=1;i--)
       {
           for(k=1;k<=sp;k++)
           {
               System.out.print(" ");
            }
           for(j=1;j<=i;j++)
           {
               System.out.print("A ");
            }
                   System.out.println();
               sp++;    
                }
           }
        }
    
