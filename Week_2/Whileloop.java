public class Whileloop {
	public static void main (String[] args) {
	
		// This simple script will print out a counter from 0 to the one you set in the argument
	
		int number = 0;
		int count = Integer.parseInt(args[0]);

		while (number < count) 
			{
				System.out.println(number);
				number++ ;
			}

	}
	
}