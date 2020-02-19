package object;


class v
{
    void validate(int hh,int mm,int ss)
    {
   mm=mm+ss/60;
   
     ss=ss%60;
    mm=mm+hh/60;
    
    hh=hh+mm/60;
mm=mm%60;
hh=hh%12;
    System.out.println(hh+":"+mm+":"+ss);

}
}