import java.util.Scanner;

public class MaxAndMin
{
    public static double maximum()
    {
        Scanner scan = new Scanner (System.in);
        System.out.println (" Enter a series of number or any Charachter");
        double largest = scan.nextDouble();
        
        while (scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if( input > largest)
            {
                largest = input;
            }
        }
        return largest
    }
}
       