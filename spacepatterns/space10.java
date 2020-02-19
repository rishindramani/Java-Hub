package spacepatterns;

public class space10//q10//
{
    public void main()
    {
        int i,j,k,m;
        int sp=7;
        for(i=1;i<=5;i++)
            {
                for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
                for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            if(i==5)
            {
                m=i-1;
            }
            else
            {
                m=i;
            }
            for(j=m;j>=1;j--)
            {
                System.out.print(j);
               }
            System.out.println();
            sp=sp-2;
        }
    }
}           
                  