package spacepatterns;

public class space18alphabet//q15//
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
            for(j=i;j<=69;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  