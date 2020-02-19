import java.io.*;
class keath 
{
void check()throws IOException
{
BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
System.out.println("plz enter a no");
int n=Integer.parseInt(buf.readLine()); 
int x=n,s=0,rev=0;
int arr[]=new int[n];
while(x!=0)
{
int a=x%10;
rev=(rev*10)+a;
x=x/10;
}
int k=0;
while(rev!=0)
{
arr[k]=rev%10;
k++;
rev=rev/10;
}
int i=0;
while(s<n)
{
s=0;
for(int j=i;j<k;j++)
{
s=s+arr[j];
}
arr[k]=s;
k++;
i++;
}
if(s==n)
System.out.println(n+"is a keith no");
else
System.out.println(n+"is not a keith no");
}}
