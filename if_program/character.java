package if_program;
public class character
{
     public static void main(char ch)
     {   int as=(int)ch;
         if(ch>=65&&ch<=90)
         System.out.println("upper case");
         else if(ch>=97&&ch<=122)
         System.out.println("lower case");
         else if(ch>=48&&ch<=57)
         System.out.println("number");
         else
         System.out.println("special character");
        }
    }