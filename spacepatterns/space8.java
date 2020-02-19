package spacepatterns;

public class space8//q3//
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
            for(j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
    }
}           
                  