package if_program;
public class leap
{
    public static void main(int y)
    {
       if(y%100==0)
        {   if(y%400==0)
            {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
    else if(y%4==0)
    {
         System.out.println("leap year");
}
else
{
 System.out.println("not a leap year");
}
}
}
    
        
        
        
        
    