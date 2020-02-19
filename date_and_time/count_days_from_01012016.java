package date_and_time;
import java.util.*;
class count_days_from_01012016
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
         System.out.println("enter date");
        int d=ob.nextInt();
        System.out.println("enter month");
        int m=ob.nextInt();
        System.out.println("enter year");
        int y=ob.nextInt();
        int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%100==0)
        {
            if(y%400==0)
            a[2]++;
            else
            {
            }
        }
        else if(y%4==0)
        {
            a[2]++;
        }
        else
        {
        }
        int days=0;
        
        for(int i=1;i<m;i++)
        {
            days+=a[i];
        }
        days=days+d;
        System.out.println(days);
    }
}