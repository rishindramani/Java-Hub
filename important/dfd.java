package important;
import java.io.*;
class dfd
{
   public static void main(String[] args)throws IOException
    {
       BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
       String ss1,ss2;
       int t,ti,d,ll1,ll2,s11,s22,sss11,sss22,min1,min2;
       
   t=Integer.parseInt(ob.readLine());
         
                  while(t>0)
           {
               ti=0;d=0;
                 ss1=ob.readLine();
                 try{
                   if(ss1!=null){
                        ti=Integer.parseInt(ob.readLine());
                   }
               }catch(NumberFormatException e){

               }
                // ti=Integer.parseInt(ob.readLine());
                 ss2=ob.readLine();
                 try{
                   if(ss2!=null){
                        d=Integer.parseInt(ob.readLine());
                   }
               }catch(NumberFormatException e){

               }
                 //d=Integer.parseInt(ob.readLine());
                   s11=0;s22=0;ll1=0;ll2=0;min1=0;min2=0;sss11=0;sss22=0;
                   ll1=ss1.indexOf(':');
                   
                   ll1=ss1.indexOf(':');
                   ll2=ss2.indexOf(':');
                   try{
                   if(ob!=null){
                       s11=Integer.valueOf(ss1.substring(0,ll1));
                   s22=Integer.valueOf(ss1.substring(ll1+1));
                        
                   }
               }catch(NumberFormatException e){

               }
                   try{
                   if(ob!=null){
                       
                      sss11=Integer.valueOf(ss2.substring(0,ll2));
                   sss22=Integer.valueOf(ss2.substring(ll2+1));  
                   }
               }catch(NumberFormatException e){

               }
                   
                   
                   min1=s22+(s11*60);
                   min2=sss22+(sss11*60);
                  if((min1+ti)<=(min2+d))
                   {
                       System.out.println("Yes");
                    }
                    else
                    {
                        System.out.println("No");
                    }
               t--;
                }
            }
        }
                       
                   
                /*for(i=0;i<ss.length();i++)
                  {
                      
                      if(ss.charAt(i)!=':')
                      {
                          s11=s11+ss.charAt(i);
                        }
                    }*/