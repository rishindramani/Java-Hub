class tt
{
void main(int n)
{
int x[][]=new int[25][25];
int r,j;
r=(int)Math.pow(2,n);
 for(int i=0;i<r;i++)
{
	for(j=0;j<n;j++)
	{
		x[i][j]=0;
	}
}
int count=0,x1,t;
while(count<r)
{
	j=n-1;
	t=count;
       while(t!=0)
       {
	x1=t%2;
	x[count][j]=x1;
	j--;
	t=t/2;
       }
       count++;
}
for(int i=0;i<r;i++)
{
	for(j=0;j<n;j++)
	{
				System.out.print(x[i][j]);
	}
		System.out.println();
}}}

