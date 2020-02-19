package switchprograms;

import java.io.*;
public class calculator
{
   public static void main(String[] args)throws IOException
   {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("MENU"+'\n');
       System.out.println("1.ADDITION OF TWO NUMBERS");
       System.out.println("2.SUBSTRACTION OF TWO NUMBERS");
       System.out.println("3.MULTIPLICATION OF TWO NUMBERS");
       System.out.println("4.DIVISION OF TWO NUMBERS");
       System.out.println("5.TO SWAP VALUES OF TWO NUMBERS");
       System.out.println("6.TO CONVERT A BINARY NUMBER TO A DECIMAL NUMBER");
       System.out.println("7.TO CONVERT A DECIMAL NUMBER TO A BINARY NUMBER");
       System.out.println("8.TO FIND HCF AND LCM OF TWO NUMBERS");
       System.out.println("9.TO PRINT TABLE OF A NUMBER");
       System.out.println("10.TO CHECK IF THE NUMBER ENTERED IS PERFECT OR NOT");
       System.out.println("11.TO FIND SQUARE ROOT OF A NUMBER");
       System.out.println("12.SUM TILL SINGLE DIGIT IS ACQUIRED BY THE NUMBER");
       System.out.println("13.TO PRINT TRIBONACCI SERIES");
       System.out.println("14.TO FIND IF THE NUMBER ENTERED IS POSITIVE, NEGATIVE OR ZERO");
       System.out.println("15.TO FIND IF ENTERED YEAR IS LEAP YEAR OR NOT");
       System.out.println("16.TO FIND FACTORS OF A NUMBER");
       System.out.println("17.TO FIND SQUARE OF A NUMBER");
       System.out.println("18.TO FIND SINE OF AN ANGLE ");
       System.out.println("19.TO FIND COS OF AN ANGLE ");
       System.out.println("20.TO FIND TAN OF AN ANGLE ");
       System.out.println("21.TO FIND IF THE CHARACTER ENTERED IS IN UPPER CASE or LOWER CASE or IS A NUMBER or IS A SPECIAL CHARACTER");
       System.out.println("22.FAHRENHEIT TO CELSIUS");
       System.out.println("23.CELSIUS TO FAHRENHEIT");
       System.out.println("24.TO CHECK IF THE NUMBER ENTERED IS PALLANDROME NUMBER OR NOT");
       System.out.println("25.TO FIND THE FREQUENCY OF A DIGIT IN A LONG NO"+'\n');
       System.out.println("enter choice");
       int ch=Integer.parseInt(ob.readLine());
       
       switch(ch)
       {
           case 1:
           System.out.println("enter two numbers");
           double a=Double.parseDouble(ob.readLine());
       double b=Double.parseDouble(ob.readLine());
           double s=a+b;
           System.out.println(s);
           break;
           case 2:
           System.out.println("enter two numbers");
           double c=Double.parseDouble(ob.readLine());
       double d=Double.parseDouble(ob.readLine());
           s=c-d;
           System.out.println(s);
           break;
           case 3:
           System.out.println("enter two numbers");
           double e=Double.parseDouble(ob.readLine());
       double f=Double.parseDouble(ob.readLine());
           s=e*f;
           System.out.println(s);
           break;
           case 4:
           System.out.println("enter two numbers");
           double g=Double.parseDouble(ob.readLine());
       double h=Double.parseDouble(ob.readLine());
           s=g/h;
           System.out.println(s);
           break;
           case 5:
           System.out.println("enter value of a");
           System.out.println("enter value of b");
           double i=Double.parseDouble(ob.readLine());
       double j=Double.parseDouble(ob.readLine()); 
           double m;
       m=i;
       i=j;
       j=m;
       System.out.println("swapped a="+i);
       System.out.println("swapped b="+j);
       break;
       case 6:
       System.out.println("enter number");
       int k=Integer.parseInt(ob.readLine());
       int a1,i1=0,s1=0;
       int x=k;
       while(k!=0)
       {
           a1=k%10;
           int t=(int)Math.pow(2,i1);
           i1++;
           s1=s1+(a1*t);
           k=k/10;
        }
        System.out.println(s1);
         break;
         case 7:
         System.out.println("enter number");
         int k2=Integer.parseInt(ob.readLine());
       int a2,i2=0,s2=0;
       int x1=k2;
       while(k2!=0)
       {
           a2=k2%2;
           int t1=(int)Math.pow(10,i2);
           i2++;
           s2=s2+(a2*t1);
           k2=k2/2;
        }
        System.out.println(s2);
         break;
         case 8:
         System.out.println("enter two numbers");
         int l3=Integer.parseInt(ob.readLine());
         int l4=Integer.parseInt(ob.readLine());
         int j1,hc=1;
       for(j1=1;j1<=l3;j1++)
       {
        if(l3%j1==0&&l4%j1==0)
        {
        hc=j1;
        }
    }
        System.out.println("hcf="+hc);
    int lc=1;
for(j1=1;j1<=(l3*l4);j1++)
{
if(j1%l3==0&&j1%l4==0)
{
lc=j1;
break;
}
}
System.out.println("lcm="+lc);
break;
case 9:
System.out.println("enter a number");
int n4=Integer.parseInt(ob.readLine());
int r,m3;
        for(r=1;r<=10;r++)
        {
            m3=n4*r;
            System.out.println(n4+"x"+r+"="+m3);
        }
           break;
           case 10:
           System.out.println("enter a number");
           int n5=Integer.parseInt(ob.readLine());
           int s9=0,i8;
       for(i8=1;i8<n5;i8++)
       {
           if(n5%i8==0)
           {
               s9=s9+i8;
            }
        }
        if(s9==n5)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not a perfect number");
        }
        break;
        case 11:
        System.out.println("enter a number");
        double p=Double.parseDouble(ob.readLine());
         double sq=Math.sqrt(p);
           System.out.println(sq);
           break;
           case 12:
           System.out.println("enter a number");
            int p1=Integer.parseInt(ob.readLine());
             while(p1>9)
        {
            int su=0,ae;
            while(p1!=0)
            {
                ae=p1%10;
                su=su+ae;
                p1=p1/10;
            }
            p1=su;
        }
        System.out.println("sum till single digit="+p1);
         break;
         case 13:
         System.out.println("enter number of terms");
         int pq=Integer.parseInt(ob.readLine());
         int x12=0,y=1,z=2,w;
        System.out.print(x12);
        System.out.print(","+y);
        System.out.print(","+z);
        for(w=4;w<=pq;w++)
        {
            int d12=x12+y+z;
            System.out.print(","+d12);
            x12=y;
            y=z;
            z=d12;
        }
           break;
           case 14:
           System.out.println("enter a number");
           int w1=Integer.parseInt(ob.readLine());
           if(w1>0)
         {
             System.out.println("number is positive");
           }
            else if(w1<0)
            {
                System.out.println("number is negative");
                }
                else
                {
                    System.out.println("number is zero");
                }
                break;
                case 15:
                System.out.println("enter year");
          int y12=Integer.parseInt(ob.readLine());
           if(y12%4==0&&y12%100!=0)
        {
            System.out.println("leap year");
        }
        else if(y12%100==0&&y12%400==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
               }
              break; 
              case 16:
              System.out.println("enter a number");
              int o=Integer.parseInt(ob.readLine());
              int o1;
              for(o1=1;o1<=o;o1++)
              {
              if(o%o1==0)
              {
                 System.out.println(o1);               
                }
            }
              break;
              case 17:
              System.out.println("enter a number");
              double p8=Double.parseDouble(ob.readLine());
              double kh=p8*p8;
              System.out.println("square of a number="+kh);
              break;
              case 18:
              System.out.println("enter the angle");
              double g1=Double.parseDouble(ob.readLine());
              double sin=(22*g1)/(7*180);
              double rs=Math.sin(sin);
              System.out.println(rs);
              break;
              case 19:
              System.out.println("enter the angle");
              double g123=Double.parseDouble(ob.readLine());
              double cos=(22*g123)/(7*180);
              double rs1=Math.cos(cos);
              System.out.println(rs1);
              break;
              case 20:
              System.out.println("enter the angle");
              double g123436=Double.parseDouble(ob.readLine());
              double tan=(22*g123436)/(7*180);
              double rs132=Math.tan(tan);
              System.out.println(rs132);
              break;
              case 21:
              System.out.println("enter the character");
              char ch123456=(char)(ob.read());
              if(ch123456>=65&&ch123456<=90)
              {
         System.out.println(" it is in upper case");
        }
         else if(ch123456>=97&&ch123456<=122)
         {
             System.out.println("it is in lower case");
            }
         else if(ch123456>=48&&ch123456<=57)
         {System.out.println("it is a number");
            }
         else
         {System.out.println("it is a special character");
        }
          break;
          case 22:
          System.out.println("enter temperature in fahrenheit");
          double f2222=Double.parseDouble(ob.readLine());
           double c2222=(5*(f2222-32))/9;
           System.out.println("temperature in degree celsius="+c2222);
           break;
           case 23:
           System.out.println("enter temperature in celsius");
           double cnew=Double.parseDouble(ob.readLine());
           double fnew=(1.8*cnew)+32;
           System.out.println("temperature in degree fahrenheit="+fnew);
           break;
           case 24:
           System.out.println("enter a number");
           int pqn=Integer.parseInt(ob.readLine());
           int ab,re=0,x12876=pqn;
           while(pqn!=0)
           {
               ab=pqn%10;
               re=(re*10)+ab;
               pqn=pqn/10;
            }
            if(re==x12876)
            {
                System.out.println("pallandrome number");
            }
            else
            {
                System.out.println("not a pallandrome number");
            }
            break;
            case 25:
            System.out.println("enter a long number");
            long no=Long.parseLong(ob.readLine());
            System.out.println("enter the digit whose frequency you want to find");
            int dig=Integer.parseInt(ob.readLine());
            int feq=0;
            while(no!=0)
            {
                long ko=no%10;
                no=no/10;
                if(ko==dig)
                {
                    feq++;
                }}
                System.out.println("APPEARED"+"  "+feq+"  "+"TIMES");
                break;
           default:
              System.out.println("LALLU LAL WRONG INPUT");
           }
    }
}

           
           
       