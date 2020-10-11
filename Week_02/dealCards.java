public class dealCards
{
	public static void main (String[] args)
	{
		// Usage: 1) javac dealCards.java 2) java dealCards 13
		// This program will create a deck of (Poker) cards and randomly print out the number of cards based on the input argument.
		
		// Input arguments
		int N = Integer.parseInt(args[0]); //Number of cards that will be printed out at the end.
		
		// Create Structures
		String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] kind = {" ♣"," ♢"," ♤"," ♥"}; //https://en.wikipedia.org/wiki/Playing_cards_in_Unicode
		
		// Create Deck
		String[] deck = new String[52]; // Create a new, empty array with 52 "spaces" on it.
		for (int i = 0; i < 13; i++) //i is 0, while i is less than 13, increment one to i. This lines is about the amount od cards per kind
			for (int j = 0; j < 4; j++) // j is 0, while j is less than 4, increment one to j. This lines referst the kind.
				deck[i + 13*j] = rank[i] + kind[j]; // Each position of the 52 spaces will be completed by the card number plus the kind.
		
		// Shuffle all 52 cards		
		for (int i = 0; i < 52; i++)
		{
			int r = i + (int) (Math.random() * (52-i)); // 
			String t = deck[r];
			deck[r] = deck[i];
			deck[i] = t;
		}
		// print the number of cards you requested via the argument
		for (int i = 0; i < N; i++)
			System.out.println("Card #" + i + ": " + deck[i]);
		System.out.println();
	}
}