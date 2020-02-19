package spacepatterns;

public class space4//q5//
{
    public void main()
    {
        int i,j,k;
        int sp=0;
        for(i=5;i>=1;i--)
            {
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  