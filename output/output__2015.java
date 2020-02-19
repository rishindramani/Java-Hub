package output;

public class output__2015
{
      void somefun(int x,int y)
      {
          if(x>1)
          {
              if(x%y==0)
              {
                  System.out.print(y+" ");
                  somefun(x/y,y);
                }
                else
                somefun(x,y+1);
            }
        }
    }