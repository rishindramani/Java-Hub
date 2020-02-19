public class uplodi
{
private String s;
    uplodi()
    {
    s=" ";
    }
    uplodi(String s1)
    {
    s=s1;
    }
    public void fun()
    {
    char ch;int x,i,a=0,b=0,c=0,d=0,e=0;
    int l= s.length();
    for(i=0;i<l;i++)
    {
    ch=s.charAt(i);
    x=(int)ch;
    if(x>=65 && x<=90)
    {
    a=a+1;
    }
    else if(x>=97 && x<=122)
    {
    b=b+1;
    }
    else if (x>=48 && x<=57)
    {
    c=c+1;
    }
    else if(ch==' ')
    {d=d+1;
    }
    else {
    e=e+1;
    }
    }
    System.out.println("up"+a);
    System.out.println("lo"+b);
    System.out.println("di"+c);
    System.out.println("sp"+d);
    System.out.println("spich"+e);}}