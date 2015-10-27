
import java.util.Scanner;
public class PromptUntilatch
{
  public static double promptUntilMatch()
  {
      Scanner scan = new Scanner(System.in);
      boolean valid = false;
      double input = 0;
     
      do 
      {
         System.out.print( "Please enter a positive value < 100; ");
         
         if (input > 0 && input < 100)
         {
             valid = true;
         }
      }
    while( !valid );
    return input;
   }
}