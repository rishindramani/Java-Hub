public class abc
{
    
public String rem(String s)
    {
        int t=s.length(),k;String s1="";
        for(k=0;k<t;k++)
        {
            char x=s.charAt(k);
            if(x!='0')
            {
                s1=s1+x;
        }
    }
    return s1;
}
}