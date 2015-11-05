import java.util.Scanner;
import java.util.Random;
public class MontyHall
{
    public static void main ( String [] args)
    {
        System.out.print("Pick a door betwwen 1 and 3");
        int choice = new Scanner(System.in).nextInt();
        int car = new Random().nextInt(3)+1;
        if (car == 3 && choice == 3)
        {
            int goat = 1;
            int goat2 = 2;
            int host = new Random().nextInt(2)+1;
        }
        if (car ==2 && choice == 2)
        {
            int goat = 1;
            int goat2 = 3;
            int host = 2;
           while (host == 2)
           {
               host =  new Random().nextInt(3)+1;
            }
        }
        if (car == 1 && choice == 1)
        {
            int goat = 3;
            int goat2 = 2;
            int host = 1;
            while (host == 1)
            {
                host = new Random().nextInt(3)+1;
                
            }
            System.out.println("Behind door number" + host + " is a goat. Would you like to Change your choice?");
            int change = new Scanner(System.in).nextInt();
            
        }
    }
}   
   