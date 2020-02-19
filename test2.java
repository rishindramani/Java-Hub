import java.util.*;
class Account {
    public static int id = 0;;
    private double balance = 500.0;
    private static double annualInterestRate = 4.0;
        public Account() 
    {
        ++id;
        
    }

    public Account(int id, double balance) 
    {
        
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterest() 
    {
        return (balance*annualInterestRate)/1200;
    }

    public void withdraw(double amount) 
    {
       this.balance=this.balance-amount;
       System.out.println("current balance=Rs. "+this.balance);
    }

    public void deposit(double amount) 
    {
        this.balance=this.balance+amount;
        System.out.println("current balance=Rs. "+this.balance);
    }
}
public class test2
   {
       
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
       // System.out.println("enter test case");
       // int t=ob.nextInt();
        //System.out.println("enter id");
        //int n=ob.nextInt();
        int ch;
        
      //  while(t>0)
        //{
do
{
        System.out.println("1.MONTHLY INTEREST ");
        System.out.println("2. WITHDRAW ");
        System.out.println("3. DEPOSIT ");
        System.out.println("ENTER CHOICE");
        ch=ob.nextInt();
        Account f=new Account();
        Account e = new Account(f.id,500);
        switch(ch)
        {  

       case 1:
       System.out.println("Monthly interest=Rs. "+e.getMonthlyInterest());
       break;
       case 2:
       System.out.println("enter amount to withdraw");
       double w=ob.nextDouble();
       e.withdraw(w);
       break;
       case 3:
       System.out.println("enter amount to deposit");
       double d=ob.nextDouble();
       e.deposit(d);
       break;
       default:
       System.out.println("Wrong choice");
    }
}while(ch<4);
//t--;
//}
}
}

     
