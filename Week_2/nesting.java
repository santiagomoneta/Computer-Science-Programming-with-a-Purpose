public class nesting {
	public static void main (String[] args) {

		// This script will perform a for loop while we reach our goal or run out of money
		// 1st we declare the input arguments

		
		int stake  = Integer.parseInt(args[0]);	// Money we enter the casino with
		int goal = Integer.parseInt(args[1]);	// What will be our goal in order to stop and go home
		int trials = Integer.parseInt(args[2]);	// How many tries we will perform

		// Initial wind and bets

		int bets = 0;
		int wins = 0;
		
		// Now we will set the mail loop, what needs to happen in order to stop for good. 
		// In this case once we reach the number of tried we set, the program will stop.

		// The 3 items for loop:
		// 1 - Initial state
		// 2 - Condition keep running
		// 3 - What to do each loop
		for (int t = 0; t < trials; t++) {

			int cash = stake;	// Initial cash is the same as my total, but "cash" will change (for good or worst)
			

			while (cash > 0 && cash < goal) { // As long the money I have is more than zero and less than my desired goal... 

				bets++; // track each time we make a bet

				// if the random number is more than 0.5 (assuminh we are working with 50% changes) add 1 to chash, if it less, take 1 from cash
				if (Math.random() < 0.5) cash++ ;
				else cash --;

			}
			// Once the loop finish (for one result of the other) simply count if we won.
			if (cash == goal) wins++;
		}  

		// Now that the loop is complete, print the results
		System.out.println(wins + " wins out of " + trials + "tries");
		System.out.println("Percent of games won = " + 100.0 * wins / trials + "%"); // note the 100.0 noy 100 to make it double.
		System.out.println("Average amount of bets = " + 1.0 * bets / trials);
	}
}	