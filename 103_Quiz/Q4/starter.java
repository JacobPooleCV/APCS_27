import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// All global variables should be

		// Part 1
		Movie mA = new Movie();
		Movie mB = new Movie("Forrest Gump", 8.8, 24, 700000000);		// movieName, rating (out of 10), numRatings (how many ratings), revenue
		Movie mC = new Movie("Spirited Away", 8.6, 16, 395800000);
        System.out.println("-----------------------------");

        

		// Part 2	---------------------------------------------

		mA.movieToString();
		mB.movieToString();
		mC.movieToString();
		System.out.println("-----------------------------");

        

		// Part 3	---------------------------------------------

		System.out.println(mA.getMovieName() + " had a total revenue of " + mA.getRevenue());
		System.out.println(mB.getMovieName() + " had a total revenue of " + mB.getRevenue());
        System.out.println();
		System.out.println("-----------------------------");

        

		// Part 4	---------------------------------------------

        mB.addRating(7.8);
        mB.addRating(8.5);
		mB.movieToString();

        mC.addRating(10.0);
        mC.addRating(7.0);
		mC.movieToString();
		System.out.println("-----------------------------");

        

		// Part 5	---------------------------------------------

		if(mA.compareRatings(mB)){                     // Ignore movies of the same ratings
			System.out.println(mA.getMovieName() + " is better than " + mB.getMovieName());
		}
		else{
			System.out.println(mB.getMovieName() + " is better than " + mA.getMovieName());
		}
        System.out.println();
		System.out.println("-----------------------------");

        
        /*
        // Part 6	--------------------------------------------- Extra

		System.out.println("The movie " + mA.getMovieName() + " has a revenue of " + mA.revenueToString());
        System.out.println();
		System.out.println("-----------------------------");

        DID NOT FINISH 6-7        
        
		// Part 7	--------------------------------------------- Extra

		Movie dupC = mC.pirateMovie();			// Populates dupC with a copy of the movie mC
		dupC.movieToString();
		System.out.println("-----------------------------");

        */
        
        

	}
}