public class addTwo
{
	public static void main(String[] args)
	{
		StdOut.print("Give me a number: ");
		int number1 = StdIn.readInt();
		StdOut.print("Now, give me another number: ");
		int number2 = StdIn.readInt();
		int sum = number1 + number2;
		StdOut.print("The sum of those 2 numbers is: " + sum);
	}
}