class patt
{
  public static void main()
  {
      int i,j,k,sp=0;
      for(i=65;i<=69;i++)
      {
          for(k=1;k<=sp;k++)
          {
              System.out.print(" ");
            }
             for (j=69;j>=i;j--)
             {
                 System.out.print((char)j);
                }
                System.out.println();
                sp++;
            }
        }
    }
