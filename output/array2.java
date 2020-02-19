package output;
import java.util.*;
class array2
{
    public static void main()
    {
        int x[]=new int[5];
        for(int i=0;i<5;i++)
        {
            x[i]+=i;
            System.out.println(x[i]);
        }
    }
}