public class sort
{ 
void abc(String str)
    {
    str=str+" ";
    int l=str.length();
    int a[]=new int[100];
    String b[]=new String[100];
    int c=0,j=0;
    String s="";
    for(int i=0;i<l;i++)
    {
    char x=str.charAt(i);
    if(x!=' ')
    {
    c++;
    s=s+x;
    }
    else
    {
    a[j]=c;
    b[j]=s;
    j++;
    c=0;
    s="";
    }
    }
    for(int i=0;i<j-1;i++)
    {
    for(int k=i+1;k<j;k++)
    {
    if(a[i]>a[k])
    {
    int t=a[i];
    a[i]=a[k];
    a[k]=t;
    String q=b[i];
    b[i]=b[k];
    b[k]=q;
    }
    else if(a[i]==a[k])
    {
    int w=b[i].compareTo(b[k]);
    if(w>0)
    {
    String q=b[i];
    b[i]=b[k];
    b[k]=q;
    }
    }
    else
    {}
    }}
    for(int i=0;i<j;i++)
    {
    System.out.print(b[i]+" ");
    }
    }
}
   