package date_and_time;
import java.util.*;
class count_days_of_dates_of_same_year
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
         System.out.println("enter date1");
        int d1=ob.nextInt();
        System.out.println("enter month1");
        int m1=ob.nextInt();
        System.out.println("enter year1");
        int y1=ob.nextInt();
        System.out.println("enter date2");
        int d2=ob.nextInt();
        System.out.println("enter month2");
        int m2=ob.nextInt();
        System.out.println("enter year2");
        int y2=ob.nextInt();
        int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y1%100==0)
        {
            if(y1%400==0)
            a[2]++;
            else
            {
            }
        }
        else if(y1%4==0)
        {
            a[2]++;
        }
        else
        {
        }
        int days1=0,days2=0,net;
        
        for(int i=1;i<m1;i++)
        {
            days+=a[i];
        }
        days=days+d;
        System.out.println(days);
    }
}