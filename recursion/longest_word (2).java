
package recursion;
import java.util.*;
public class longest_word
{  String s1="",s2=""; int max;
    void initials(String s,int t,int i)
    {    
        if(i<t)
        {
char x=s.charAt(i);
if(x!=' ')
{
    s1=s1+x;
}
else
{
    if(s1.length()>max)
    {
        s2=s1;
    }
       s1="";
    }
    initials(s,t,++i);
}
else
{
    return;
}
}

    void main()
    {  Scanner ob=new Scanner(System.in);
        System.out.println("enter");
         String s=ob.nextLine();
         s=s+" ";
       initials(s,s.length(),0);max=0;System.out.println(s2);
    }
}