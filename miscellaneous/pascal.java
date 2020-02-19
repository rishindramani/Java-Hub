import java.io.*;
class pascal
{
int x,p,q=0,r,n,bin=1;
public void main()throws IOException
{
BufferedReader dr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE LIMIT");
p=Integer.parseInt(dr.readLine());
while(q<p)
{
for(r=(35-(3*q));r>0;--r)
{
System.out.print(" ");
}
for(x=0;x<=q;++x)
{
if(x==0||q==0)
bin=1;
else
bin=(bin*(q-x+1))/x;
System.out.print("    ");
System.out.print(bin);
}
System.out.println();
++q;
}
}
}



