package important;


public class pattern3
{
	void xyz ()
	{int i,j,k,sp=-1,m;
	    for(i=5;i>=1;i--)
	    {
	        for(j=1;j<=i;j++)
	        {
	            System.out.print(j);
	           }
	           for(k=1;k<=sp;k++)
	           {
	               System.out.print(" ");
	           }
	           if(i==5)
	           {
	               m=i-1;
	           }
	               else
	               {
	                   m=i;
	               }
	               for(j=m;j>=1;j--)
	               {
	                   System.out.print(j);
	               }
	               
	               
	               System.out.println();
	               sp=sp+2;
	           }
	       }
	   }
	   
	               
	            