public class forLoop {
	public static void main (String[] args) {

		// This script will take an argument and will print out the power of that number.

		int power = 1;

		int n = Integer.parseInt(args[0]);
		// as long i is less than n (the number we pass).. do "this" and add 1 to i.

		for (int i = 0 ; i <= n ; i++)
		{
			//print current status 
			System.out.println("the power of "+ i + " is " + power);

			//Calculate the power for next loop
			power = 2*power;
		}

	}

}