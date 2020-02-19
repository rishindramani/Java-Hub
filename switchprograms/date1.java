package switchprograms;
import java.util.*;
public class date1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter date between 1 to 31");
        int d=ob.nextInt();
        System.out.println("enter month");
        int m=ob.nextInt();
        System.out.println("enter year");
        int y=ob.nextInt();String s="",s1="";int e;
        switch(m)
        {
            case 1:
            s="JAN";
            break;
            case 2:
            s="FEB";
            break;
            case 3:
            s="MAR";
            break;
            case 4:
            s="APR";
            break;
            case 5:
            s="MAY";
            break;
            case 6:
            s="JUN";
            break;
            case 7:
            s="JUL";
            break;
            case 8:
            s="AUG";
            break;
            case 9:
            s="SEP";
            break;
            case 10:
            s="OCT";
            break;
            case 11:
            s="NOV";
            break;
            case 12:
            s="DEC";
            break;
            default:
            System.out.println("WRONG CHOICE");
        }
        if(d>=11&&d<=20||d>=24&&d<=30||d>=4&&d<=10)
        {
             s1="th";
        }
        
        else 
        {  e=d%10;
            if(e==1)
            {
               s1="st"; 
            }
            else if(e==2)
            {
               s1="nd"; 
            }
            else if(e==3)
            {
               s1="rd"; 
            }
            else
            {}
        }
          System.out.println(d+s1+" "+s+" "+y);      
        }
    }