package arrays;
import java.util.*;
class array21__frequency_of_inputted_element_in_the_array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter element whose frequency is to be counted");
        int ele=ob.nextInt();
        int c=0;
         for(i=0;i<n;i++)
        {
                if(a[i]==ele)
                {
                    c++;
                }
            }
            System.out.println("frequency of inputted element="+c);
        }
    }