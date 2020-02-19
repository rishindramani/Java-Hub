package spacepatterns;

public class space16alphabet//q13//
{
      public void main()
    {
        int i,j,k;
        int sp=0;
        for(i=65;i<=69;i++)
            {
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=69;j>=i;j--)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  