

import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next(); 
    
        if (player1.equals("Scissors"))
        {
            if (player2.equals("Rock")){
                System.out.println("Player2 wins.");
            }
            if (player2.equals("Paper")){
                System.out.println("Player1 wins.");
            }
            if (player1.equals(player2)){
                System.out.println("Tie.");
            }
        }
    
        if (player1.equals("Paper"))
        {
            if (player2.equals("Rock")){
                System.out.println("Player1 wins.");
            }
            if (player2.equals("Scissors")){
                System.out.println("Player2 wins.");
            }
            if (player1.equals(player2)){
                System.out.println("Tie.");
            }
        }
    
        if (player1.equals("Rock"))
        {
            if (player2.equals("Scissors")){
                System.out.println("Player1 wins.");
            }
            if (player2.equals("Paper")){
                System.out.println("Player2 wins.");
            }
            if (player1.equals(player2)){
                System.out.println("Tie.");
            }
        }
    } 
}