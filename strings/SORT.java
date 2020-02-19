package strings;

public class SORT
{
  public void main(String s)
  {
     int t=s.length();
      char a[]=new char[t];int i,j,k=0;
      for(i=0;i<t;i++)
        {
            char x=s.charAt(i);
            a[k]=x;
            ++k;
        }
        
        
for(i=0;i<k;i++)
        {
        for(j=0;j<(k-1-i);j++)
             {
                 if(a[j]>a[j+1])
                 {
                     char y=a[j];
                     a[j]=a[j+1];
                     a[j+1]=y;
                    }
             
                }
            }
        for(i=0;i<k;i++)
        {
            System.out.print(a[i]);
        }
    }
}