package spacepatterns;

public class space2//q1//
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
            
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
    }
}           
                  