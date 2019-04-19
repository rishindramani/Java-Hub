package object;

import java.util.Calendar;
 
public class Minutes{
 
  public static void main(String[] args) {
   
    //create Calendar instance
    Calendar now = Calendar.getInstance();
   
    System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
                     
    //add minutes to current date using Calendar.add method
    now.add(Calendar.MINUTE,20);
 
    System.out.println("New time after adding 20 minutes : "
                      + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
 
    /*
     * Java Calendar class automatically adjust the date or hour accordingly
if adding minutes to the current time causes current hour or date to be changed.
     */
     
 
    //substract minutes from current date using Calendar.add method
    now = Calendar.getInstance();
    now.add(Calendar.MINUTE, -50);
 
    System.out.println("Time before 50 minutes : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
   
  }
}