package sumandprinttheseries;
public class series1//1  11  111 1111 11111-----n terms
{
   public static void main(int n)
   {
       int i,s=0;
       for(i=1;i<=n;i++)
       {
           s=(s*10)+1;
           System.out.print(s+"  ");
        }
    }
}
