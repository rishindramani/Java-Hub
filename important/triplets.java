public class triplets
{
 public void fn(int arr[])
 {int t=0;
     int ch=1;
     int n=arr.length;
     int a[]=new int[n];
     int b[]=new int[n];
     int c[]=new int[n];
     int p=0,q=0,r=0;
     for(int i=0;i<n;i++)
     {
         if(arr[i]==1)
         {
             a[p]=1;
             p++;
            }
            else if(arr[i]==2)
             {
              b[q]=2;
            q++;
        }
        else if(arr[i]==3)
        {
         c[r]=3;
         r++;
        }}int i=0,j=0,k=0;
         while(ch==1)
        {
         if(i<p &&j<q&& k<r)
         {
   System.out.print("{"+a[i]+","+b[j]+","+c[k]+"}");
i++;j++;k++;t++;
}
else  if(i<p&&j<q)
         {
System.out.print(a[i]+""+b[j]);
i++;j++;t++;
}
else  if(i<p && k<r)
         {
    System.out.print(a[i]+""+c[k]);
i++;k++;t++;
}
       
    else if(i<p)
         {
 System.out.print(a[i]);
i++;t++;
}
else if(j<q)
         {
System.out.print(b[j]);
j++;t++;
}
else if(k<r)
         {
 System.out.print(c[k]);
k++;t++;
}
else{}
if(i==p &&j==q&& k==r)
         {
             ch=0;
            }
        }System.out.println("no"+t);
        
    }
}
          
            