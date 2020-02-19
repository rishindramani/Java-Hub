package spacepatterns;

public class space6//eg1//
{
    public void main()
    {
        int i,j,k;
        int sp=4;
        for(i=1;i<=5;i++)
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
            sp--;
        }
    }
}           
                  