package output;
public class while1
{
     public static void main()
     {
         int i=-10;
         boolean b=true;
         while(b)
         {
             if(i<0)
             {
                 i++;
                 continue;
                }
                else
                break;
            }System.out.println(i);
        }
    }