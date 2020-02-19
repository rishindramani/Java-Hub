package spacepatterns;

public class space15alphabet//q12//
{
      public void main()
    {
        int i,j,k;
        int sp=0;
        for(i=69;i>=65;i--)
            {
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j>=65;j--)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  