import java.util.*;
public class conv
{
public static int [] doubleToInt(double d[])
{
int j; int a[]=new int[d.length];
    for(j=0;j<d.length;j++)
{
a[j]=(int)d[j];
}
    return a;
}

public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
double a[]=new double[4];
int b[]=new int[4];
int i;
for(i=0;i<4;i++)
{
a[i]=ob.nextDouble();
}
b=doubleToInt(a);
for(i=0;i<4;i++)
{
 System.out.println(b[i]);
}
}
}