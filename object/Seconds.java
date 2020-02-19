package object;


import java.util.Calendar;
 
public class Seconds extends Mytime {

 public static void main(String[] args) {
   
   
    Calendar now = Calendar.getInstance();
   
    System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
                     
    //add seconds to current date using Calendar.add method
    now.add(Calendar.SECOND,100);
 
    System.out.println("New time after adding 100 seconds : "
                      + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
 
    /*
     * Java Calendar class automatically adjust the date,hour or minutesaccordingly
     * if adding seconds to the current time causes current minute,
     * hour or date to be changed.
     */
     
 
    //substract seconds from current time using Calendar.add method
    now = Calendar.getInstance();
    now.add(Calendar.SECOND, -50);
 
    System.out.println("Time before 50 minutes : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
   
  }
}
