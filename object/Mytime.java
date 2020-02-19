package object;
public class Mytime
{
    int hh,mm,ss;
    Mytime()
    {
        hh=0;mm=0;ss=0;
    }
    void readTime(int h1,int m1,int s1)
    {
        hh=h1;
        mm=m1;
        ss=s1;
    }
    void showTime()
    {
        System.out.println(hh+":"+mm+":"+ss);
    }
    void addSec(int en)
    {
        ss=ss+en;
    }
    void validate()
    {
        int l1,l2,l3;
    mm=mm+ss/60;
    ss=ss%60;
    l1=ss;
    mm=mm+hh/60;
    hh=hh+mm/60;
mm=mm%60;
l2=mm;
hh=hh%12;
l3=hh;
     System.out.println(l3+":"+l2+":"+l1);
}

void main()
{
    Mytime e=new Mytime();
   e.readTime(12,61,61);
   e.addSec(1);
    e.validate();
   
}
}