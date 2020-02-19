
package recursion;
import java.util.*;
public class rev
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
         String s=ob.nextLine();
         s=s+" ";
       initials(s,s.length(),0);max=0;System.out.println(s2);
    }
}

}
    