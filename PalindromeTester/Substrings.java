import java.util.Scanner;

public class Substrings
{
    public static void main( String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENter a Word");
        String word = s.next();
        
        for (int length =1; length <= word.length(); length++)
        {
            
            for (int pos = 0; pos <= word.length() - length; pos++)
            {
                System.out.println(word.substring(pos, pos + length));
            }
        }
    }
}
 