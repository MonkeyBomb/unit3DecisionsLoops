
import java.util.Scanner;
/**
 * Write a description of class LeapYear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    
    /**
     * Default constructor for objects of class LeapYear
     */
    public static void main(String[] arg)
    {
        // initialise instance variables
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the Year ");
        int year = year.nextInt();
        
        
    }
    
   

}
