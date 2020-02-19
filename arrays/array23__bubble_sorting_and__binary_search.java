package arrays;
import java.util.*;
class array23__bubble_sorting_and__binary_search
{
    public static void sort_search()
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
        System.out.println("enter element to be searched");
        int ele=ob.nextInt();
        int k=0;
         for(i=0;i<n;i++)
        {
             for(j=0;j<(n-1-i);j++)
             {
                 if(a[j]>a[j+1])
                 {
                     int t=a[j];
                     a[j]=a[j+1];
                     a[j+1]=t;
                    }
                }
            }
            for(i=0;i<n;i++)
        {
              System.out.println(a[i]);
            }
         
            for(i=0;i<n;i++)
            {
                b[k]=a[i];
                k++;
            }
            int beg=0;
            int last=n-1,flag=0;
            while(beg<=last)
            {
                int mid=(beg+last)/2;
                if(b[mid]==ele)
                {
                    flag=1;
                    break;
                }
                else if(b[mid]>ele)
                {
                    last=mid-1;
                }
                else
                {
                    beg=mid+1;
                }
            }
            if(flag==1)
            {
                System.out.println("element found");
            }
            else
            {
                System.out.println("element not found");
            }
        }
    }
        

                  
           
            
                     
                     
             