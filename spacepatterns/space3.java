package spacepatterns;

public class space3//q4//
{
    public void main()
    {
        int i,j,k;
        int sp=0;
        for(i=1;i<=5;i++)
            {
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp++;
        }
    }
}           
                  