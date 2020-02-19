package spacepatterns;

public class space7//q2//
{
    public void main()
    {
        int i,j,k;
        int sp=4;
        for(i=5;i>=1;i--)
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
            sp--;
        }
    }
}           
                  