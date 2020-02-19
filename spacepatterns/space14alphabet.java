package spacepatterns;

public class space14alphabet//q11//
{
      public void main()
    {
        int i,j,k;
        int sp=4;
        for(i=69;i>=65;i--)
            {
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=69;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp--;
        }
    }
}           
                  