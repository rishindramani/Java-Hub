
public class pattern2
{
	void xyz()
	{char i,j;
	 int k,sp=4;
	 for(i='A';i<='E';i++)
	 {
	     for(k=1;k<=sp;k++)
	     {
	         System.out.print(" ");
	       }
	       for(j='A';j<=i;j++)
	       {
	            System.out.print(j);
	       }
	       int y=(int)i;
	       char z=(char)(y-1);
	       for(j=z;j>='A';j--)
	       {
	           System.out.print(j);
	       }
	       System.out.println();
	       sp--;
	   }
}
}
