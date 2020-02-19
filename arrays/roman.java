package arrays;
import java.util.*;
class roman
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int b=1;
        while(b==1)
            {
               System.out.println("enter number");
        int n=ob.nextInt();int th,h,t,u;
        if(n>0&&n<4000)
        {
             
        String thou[]={"","M","MM","MMM"};
        String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
                String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        th=n/1000;
        h=(n/100)%10;;
        t=(n/10)%10;;
        u=(n%10);
       System.out.println("roman equivalent="+thou[th]+hund[h]+ten[t]+unit[u]);
    System.out.println("to continue press 1");
     b=ob.nextInt();
}
    else
    {
        System.out.println("out of range");
    }
}
}
}