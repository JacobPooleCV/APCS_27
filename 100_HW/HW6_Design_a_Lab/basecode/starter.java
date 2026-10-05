/*
 *	Author: Justin Pyo
 *  Date: 10/2/26
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 - 50! You get seven tries! Good luck!");
        System.out.print("Guess #1: ");
        int random = (int)(Math.random()* 50 + 1);
        int round = 1;
        int guess1 = sc.nextInt();

        if(((guess1 - random) == 0) && (round == 1)) {
            System.out.println("Impossible! You actually guessed it on the first try! Suspicious...");
            System.exit(0);
        }
        else {
            System.out.println("Incorrect, please try again.");
            System.out.println("");
        }

            System.out.print("Guess #2 ");
            round = 2;
            int guess2 = sc.nextInt();

        if(((guess2 - random) == 0) && (round == 2)) {
            System.out.println("Wow! You guessed it on the second try! Incredible!");
            System.exit(0);
        }
        else if(Math.abs(guess2 - random) < Math.abs(guess1 - random)) {
            System.out.println("Incorrect, but warmer.");
            System.out.println("");
        }
        else if(Math.abs(guess2 - random) > Math.abs(guess1 - random)) {
            System.out.println("Incorrect, getting colder.");
            System.out.println("");
        }
        else 
            System.out.println("You just wasted a try!?");
            System.out.println("");

            System.out.print("Guess #3 ");
            round = 3;
            int guess3 = sc.nextInt();

        if(((guess3 - random) == 0) && (round == 3)) {
            System.out.println("Crazy! You guessed it on the third try! Impressive!");
            System.exit(0);
        }
        else if(Math.abs(guess3 - random) < Math.abs(guess2 - random)) {
            System.out.println("Incorrect, but warmer.");
            System.out.println("");
        }
        else if(Math.abs(guess3 - random) > Math.abs(guess2 - random)) {
            System.out.println("Incorrect, getting colder.");
            System.out.println("");
        }
        else 
            System.out.println("You just wasted a try!?");
            System.out.println("");

            System.out.print("Guess #4 ");
            round = 4;
            int guess4 = sc.nextInt();

        if(((guess4 - random) == 0) && (round == 4)) {
            System.out.println("Insane! You guessed it on the fourth try! Excellent!");
            System.exit(0);
        }
        else if(Math.abs(guess4 - random) < Math.abs(guess3 - random)) {
            System.out.println("Incorrect, but warmer.");
            System.out.println("");
        }
        else if(Math.abs(guess4 - random) > Math.abs(guess3 - random)) {
            System.out.println("Incorrect, getting colder.");
            System.out.println("");
        }
        else 
            System.out.println("You just wasted a try!?");
            System.out.println("");
        
            System.out.print("Guess #5 ");
            round = 5;
            int guess5 = sc.nextInt();
        
        if(((guess5 - random) == 0) && (round == 5)) {
            System.out.println("Brilliant! You guessed it on the fifth try! Really good job!");
            System.exit(0);
        }
        else if(Math.abs(guess5 - random) < Math.abs(guess4 - random)) {
            System.out.println("Incorrect, but warmer.");
            System.out.println("");
        }
        else if(Math.abs(guess5 - random) > Math.abs(guess4 - random)) {
            System.out.println("Incorrect, getting colder.");
            System.out.println("");
        }
        else 
            System.out.println("You just wasted a try!?");
            System.out.println("");

            System.out.print("Guess #6 ");
            round = 6;
            int guess6 = sc.nextInt();
        
        if(((guess6 - random) == 0) && (round == 6)) {
            System.out.println("Nice! You guessed it on the sixth try! That was good!");
            System.exit(0);
        }
        else if(Math.abs(guess6 - random) < Math.abs(guess5 - random)) {
            System.out.println("Incorrect, but warmer.");
            System.out.println("");
        }
        else if(Math.abs(guess6 - random) > Math.abs(guess5 - random)) {
            System.out.println("Incorrect, getting colder.");
            System.out.println("");
        }
        else 
            System.out.println("You just wasted a try!?");
            System.out.println("");

            System.out.print("Guess #7 ");
            round = 7;
            int guess7 = sc.nextInt();
        
        if(((guess7 - random) == 0) && (round == 7)) {
            System.out.println("Great! You guessed it on the seventh try! That was a close one!");
            System.exit(0);
        }
        else {
            System.out.println("Incorrect, play again!");
            System.out.println("The answer was " + random + "!");
        }
        
        
        


        



    }
}
