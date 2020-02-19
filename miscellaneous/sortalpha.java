public class sortalpha
{
void abc(String str)
    {
    str=str+" ";
    int l=str.length();
    String b[]=new String[100];
    int c=0,j=0;
    String s="";
    for(int i=0;i<l;i++)
    {
    char x=str.charAt(i);
    if(x!=' ')
    {
    s=s+x;
    }
    else
    {
    b[j]=s;
    j++;
    s="";
    }
    }
    for(int i=0;i<j-1;i++)
    {
    for(int k=i+1;k<j;k++)
    {
    if(b[i].compareTo(b[k])>0)
    {
    String q=b[i];
    b[i]=b[k];
    b[k]=q;
    }
    }
}
for(int i=0;i<j;i++)
    {
    System.out.print(b[i]+" ");
    }
    }
}
   