class keith
{
void main(int n)
{
  int b[]=new int[20], x, x1, t=0, s=0, s1=0, j, i=0, a, a1;
x1=n;
 while(x1 != 0)
 {
 a1 =  x1 % 10;
 s1 = (s1*10) + a1;
 x1 =  x1/10;
 }
 x = s1;
 while(x != 0)
 {
  a    = x % 10;
  b[i] = a;
  i++;
  s    = s + a;
  x    = x/10;
 }

  b[i] = s;
  t = 1;
  s = 0;

 while( n>s)
 {
 s = 0;
 for(j=t; j<=i; j++)
 {
  s = s + b[j];
 }
  i = i+1;
  b[i] = s;
  t++;
 }

 for(j=0; j<=i; j++)
 {
  System.out.println(b[j]);
}
System.out.println();
 if(n==s)
 System.out.print(" keath number ");

 else
 System.out.print(" not a keath number ");
}}