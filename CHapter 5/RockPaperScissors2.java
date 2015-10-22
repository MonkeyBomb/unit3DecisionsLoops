


import java.util.Scanner;
public class RockPaperScissors2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next();
    
        if (player1.equals(player2)){
            System.out.println("Tie.");
        }
        if (player1.equals("Rock") && player2.equals("Scissors") || player1.equals("Paper") && player2.equals("Rock") || player1.equals("Scissors") && player2.equals("Paper")){
            System.out.println("Player1 wins.");
        }
        if (player1.equals("Rock") && player2.equals("Paper") || player1.equals("Paper") && player2.equals("Scissors") || player1.equals("Scissors") && player2.equals("Rock")){
            System.out.println("Player2 wins.");
        }
    }
    }