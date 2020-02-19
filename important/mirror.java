import java.io.*;
class mirror
{
public static void main()throws IOException
{
DataInputStream obj=new DataInputStream(System.in);
int a[][]=new int[4][4];
int b[][]=new int[4][4];
int r,c,x=0;
for(r=0;r<4;r++)
{
for(c=0;c<4;c++)
{
System.out.println("enter the elements");
a[r][c]=Integer.parseInt(obj.readLine());
}
}
for(r=0;r<4;r++)
{
for(c=3;c>=0;c++)
{


x++;
}
x=0;
}
for(r=0;r<4;r++)
{
for(c=0;c<4;c++)
System.out.println(a[r][c]+"\t");
System.out.println();
}
for(r=0;r<4;r++)
{
for(c=0;c<4;c++)
{
System.out.println(b[r][c]+"\t");
System.out.println();
}
}

}
}
