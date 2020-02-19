class Spel
{
   public static void main(String args[])
  {
  Scanner ob=new Scanner(System.in);
    String s1,s2,s3="",s="bob",ss="obb",sss="bbo";
     int i,n;char x,y;n=ob.nextInt();
   while(n>0)
   {             s1=ob.next();
                 s2=ob.next();                  
        for(i=0;i<3;i++)
        {
             x=s1.charAt(i);
            y=s2.charAt(i);
              if(x=='b'||x=='o'||x=='b')
               s3=s3+x;
               else
                 s3=s3+y;
           }   if(s3.equals(s)==true||s3.equals(ss)==true||s3.equals(sss)==true||s2.equals(s)==true||s2.equals(ss)==true||s2.equals(sss)==true)
                      System.out.println("yes");
                        else
                       System.out.println("No");
                    s3="";--n;  }
                                }}    