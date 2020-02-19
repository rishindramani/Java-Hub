package important;

public class abc
{
 public void f1(int a[])
 {
     int sp=0;
     int n=a.length;
     int k=n;
         for(int i=0;i<n;i++)
         {
             for(int l=0;l<sp;l++)
             {
     System.out.print(" ");
                }
     for(int j=0;j<k;j++)
                {
   System.out.print(a[j]+" ");
                }
   for(int j=0;j<(k-1);j++)
                {
       a[j]=a[j+1]-a[j];
                }
                k--;
                sp++;
                System.out.println();
            }
        }
    }