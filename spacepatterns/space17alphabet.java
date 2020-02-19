package spacepatterns;

public class space17alphabet//q14//
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
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  