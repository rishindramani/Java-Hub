package strings;
import java.util.*;

class f
{
    int e[]=new int[50];
    
    int cap,f,r;
    f()
    {
        for(int i=0;i<50;i++)
        {
            e[i]=0;
        }
    }
    f(int nx,int nf,int nr)
    {
        cap=nx;
        f=nf;
        r=nr;
    }
    void push1(int num)
    {
        if(r<cap)
        {
            e[++r]=num;
        }
        else
        {
            System.out.println("full");
        }
    }
void main()
{
    Scanner ob=new Scanner(System.in);
    System.out.println("enter");
  
     for(int i=0;i<50;i++)
        {
            e[i]=ob.nextInt();
        }
        f ob1=new f();
        
    }
}