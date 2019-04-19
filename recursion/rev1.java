
package recursion;
import java.util.*;
public class rev1
{  String s1=""; int i;
    String rev(String s)
    {    
        if(i<s.length())
        {
char x=s.charAt(i);
s1=x+s1;
i++;
return rev(s);
}
else
{
    return s1;
}
}

void main()
    {  Scanner ob=new Scanner(System.in);
        System.out.println("enter");
         String o=ob.nextLine();
         System.out.println(rev(o));
    }
}
    