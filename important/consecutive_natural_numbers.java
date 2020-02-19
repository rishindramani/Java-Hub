class consecutive_natural_numbers
{
    public static void main(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {sum=0;
            for(int j=i;j<=n;j++)
            {
                sum=sum+j;
               if(sum==n)
                {
                    int a=j;
                    for(int k=i;k<=a;k++)
                    {
                        System.out.print(k+"+");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}