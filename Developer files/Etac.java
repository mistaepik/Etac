/* Etac (Estimated Time of Arrival Calculator)
 * An Application which calculates the duration of a trip,
 * Miles/Kilometers traveled, and/or average speed.
 * 
 * @author : Jean C. Barrera
 * @version : R0.P0
 * @since : 1-29-2016
 */

//Import necessary package members
import javax.swing.JOptionPane;

//Class with main method
public class Etac
{
  public static void main (String[] args)
  {
    //User Input Variables (Before parsing)
    String timeInStr;
    String speedInStr;
    String distanceInStr;
    
    //User Input Variables (After parsing)
    float timeIn;
    float speedIn;
    float distanceIn;
    
    //User Selection Variables
    String userSelect;
    
    //User Feedback Variables
    float result;
    
    //Comparison Variables
    final String selectTime = ("time");
    final String selectSpeed = ("speed");
    final String selectDistance = ("distance");
    
    /* Developer's Note:
     * For the time being the User will input the name of their selection
     * into the userSelect variable through a joptionpane input dialog.
     * this will eventually be changed from an input dialog to a single
     * combobox to reduce the ammount of possible user errors and to
     * keep the number of windows to a minimum.
     */
    
    //Get Function Selection from User
    userSelect = JOptionPane.showInputDialog ("Calculate time, speed, or distance");
    
    //Determine the Logic Path (Which selection did the User make)
    
    //Time Calculation Logic Path
    if((userSelect) .equals (selectTime))
    {
      //Get Distance
      distanceInStr = JOptionPane.showInputDialog ("Please enter the total distance traveled.");
      
      //Parse distanceInStr
      distanceIn = Float.parseFloat(distanceInStr);
      
      //Get Speed
      speedInStr = JOptionPane.showInputDialog ("Please enter the average speed traveled.");
      
      //Parse speedInStr
      speedIn = Float.parseFloat(speedInStr);
      
      //Arithmetic
      result = distanceIn / speedIn;
      
        //Feedback results to User
        JOptionPane.showMessageDialog (null, result + " Hours Spent");
    }
    
    //Speed Calculation Logic Path
    else if((userSelect) .equals (selectSpeed))
    {
      //Get Distance
      distanceInStr = JOptionPane.showInputDialog ("Please enter the total distance traveled.");
      
      //Parse distanceInStr
      distanceIn = Float.parseFloat(distanceInStr);
      
      //Get Time
      timeInStr = JOptionPane.showInputDialog ("Please enter the number of hours traveled.");
      
      //Parse timeInStr
      timeIn = Float.parseFloat(timeInStr);
      
      //Arithmetic
      result = distanceIn / timeIn;
        
        //Feedback results to User
        JOptionPane.showMessageDialog (null, result + " Mph/Kph (Average)");
    }
   
    //Distance Calculation Logic Path
    else if ((userSelect) .equals (selectDistance))
    {
      //Get Speed
      speedInStr = JOptionPane.showInputDialog ("Please enter the average speed traveled.");
      
      //Parse speedInStr
      speedIn = Float.parseFloat(speedInStr);
      
      //Get Time
      timeInStr = JOptionPane.showInputDialog ("Please enter the number of hours traveled.");
      
      //Parse timeInStr
      timeIn = Float.parseFloat(timeInStr);
      
      //Arithmetic
      result = speedIn * timeIn;
      
        //Feedback results to User
        JOptionPane.showMessageDialog (null, result + " Miles/Kilometers Traveled");
    }
    
    else
      JOptionPane.showMessageDialog (null, "Please enter a valid command");    
  } 
}

/*Copyright © Jean C. Barrera 2016

Author's Contact Adress:
jeancbarrera@programmer.net

author: Jean C. Barrera
version: 1.0.0
Published: 1-29-2016
 
Author's website:
jeancbarrera.weebly.com
*/