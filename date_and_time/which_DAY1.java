package date_and_time;
import java.util.*;
class which_DAY1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter month");
        String month=ob.nextLine();
        System.out.println("enter date");
        
        int date=ob.nextInt();
        System.out.println("enter year");
        int year=ob.nextInt();
        String mo[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        int daysmo[]={31,28,31,30,31,30,31,31,30,31,30,31};
          String day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int t=year-1;//2015-1=2014
         int r=t/4;//503
        int x=t-r;//1511
        int z=x+r+r;//2517
            
       int f,sum=0,sum1,sum2,e,g; 
        
        for(i=0;i<12;i++)
        {
            if(month.equals(mo[i]))
            {
                break;
            }
        }f=i;
         for(i=0;i<f;i++)
        {
           sum=sum+daysmo[i];
        }
        sum1=sum+(date-1);
        if(year%4==0&&year%400==0&&f>1)
        {
            ++sum1;
        }
       else if(year%4==0&&year%400!=0&&f>1)
        {
            ++sum1;
        }
        else
        {
            sum1=sum1;
        }
       sum2=sum1+z;
       e=sum2%7;
       
        System.out.println("Day is="+day[e]);
    }
}

        