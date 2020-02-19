package arrays;
import java.util.*;
class array22__delete_the_inputted_element_from_the_array
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
        int b[]=new int[n];
        int k=0;
         for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             {
                 if(a[j]>a[j+1])
                 {
                     int t=a[j];
                     a[j]=a
                     
             