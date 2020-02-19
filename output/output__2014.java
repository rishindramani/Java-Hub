package output;

public class output__2014
{
      void fun1(char s[],int x)
      {
        System.out.println(s);
    char temp;       
    if(x<s.length/2)
    {
        temp=s[x];
        s[x]=s[s.length-x-1];
        s[s.length-x-1]=temp;
        fun1(s,x+1);
    }
          
        }
    void fun2(String n)
    {
        char c[]=new char[n.length()];
        for(int i=0;i<c.length;i++)
        c[i]=n.charAt(i);
         fun1(c,0);
        }
    }

            