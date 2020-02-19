package arrays;
import java.util.*;
class binary_search_index
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i;
        System.out.println("enter limit");
        int n=ob.nextInt();
        int b[]=new int[n];
        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            b[i]=ob.nextInt();
        }
        System.out.println("enter element to be searched");

int ele=ob.nextInt();

int beg=0;
            int last=n-1,flag=0;int mid;int ind=0;
            while(beg<=last)
            {
                 mid=(beg+last)/2;
                if(b[mid]==ele)
                {
                    flag=1;ind=mid;
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
                System.out.println("element found and position is"+(ind+1));
            }
            else
            {
                System.out.println("element not found");
            }
        }
    }
