package if_program;
public class divisibility
{
    public void main (int n)
    {
        if(n%2==0&&n%5==0)
        {
            System.out.println("no is divisible by both 2 and 5"); 
        }
        else if(n%2==0&&n%5!=0)
        {
            System.out.println("no is divisible by 2 and not by 5");
        }
        else if(n%5==0&&n%2!=0)
        {
            System.out.println("no is divisible by 5 and not by 2");
        }
        else
        {
            System.out.println("no is not divisible by 2 and 5");
        }
    }
}
        
            