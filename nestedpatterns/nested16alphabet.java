package nestedpatterns;

public class nested16alphabet//q6//
{
    public void main()
    {
         int i,j;
         for(i=65;i<=69;i++)
         {
             for(j=69;j>=i;j--)
             {
                 System.out.print((char)j);
                }
                System.out.println();
            }
        }
    }
                