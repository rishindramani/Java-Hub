package output;
import java.util.*;
class array1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double x[]={2.93,4.65,3.12,9.0,6};
        for(int i=0;i<=4;i++)
        {
            x[i]+=5;
            System.out.println(x[i]);
        }
    }
}