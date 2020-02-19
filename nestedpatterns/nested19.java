package nestedpatterns;

public class nested19
{
   public static void  main()
   {
       int i,j,k,sp=3;
       for(i=1;i<=4;i++)
       {
           for(k=1;k<=sp;k++)
           {
               System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
              System.out.print("A"+" ");
            }
            System.out.println();
            sp--;
        }
    }
}