package output;
public class string12
{
    public static void print()
    {
        String str=new String("ICSE EXAMINATION 2013");
        System.out.println(Integer.parseInt(str.substring(str.length()-3))+(str.length()));
        System.out.println(str.substring(0,4)+str.lastIndexOf('a'));
    }
}
