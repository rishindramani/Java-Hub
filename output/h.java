package output;
public class h
{
     public boolean x(int a,int b)
     {
         boolean c=false;
         while(a>1&&b>1)
         {
             if(a>b)
             a-=b;
             else
             b-=a;
            }
            if(a==1||b==1)
            {
                c=true;
            }
            return c;
        }
    }