import java.io.*;
 class recursion
  {
      public static void main()throws IOException
      {
          BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the limit");
          int a=Integer.parseInt(ob.readLine());
          int array[]=new int[a];
          System.out.println("Enter the no to be searched using recursion technique");
          int ele=Integer.parseInt(ob.readLine());
          System.out.println("Enter the elements");
          int flag=0;
          int mid=0;
          for(int i=0;i<a;i++)
          {
              array[i]=Integer.parseInt(ob.readLine());
            }
            for(int pm=0;pm<(a-1);pm++)
             {
            for(int q=(pm+1);q<a;q++)
        {
         int temp=array[pm];
         array[pm]=array[q];
         array[q]=temp;
        }
    }
    int beg=0;
    int last=(a-1);
 void bsearch(int array[],int beg,int last,int ele)
    {
        if(beg<=last)
        {
            mid=(beg+last)/2;
            if(array[mid]==ele)
            {
                flag=1;
                return;
            }
            else if(array[mid]>ele)
            {
                last=mid-1;
              bsearch(array[];beg,last,ele);
            }
        }
        else
        return;
    }
    if(flag==1)
    {
        System.out.println("Element found   "+ele);
}    
}
}