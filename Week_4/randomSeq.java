public class randomSeq
{
	public static void main(String[] args)
	{
		int number = Integer.parseInt(args[0]);
		for (int i = 0; i < number; i++)
			System.out.println(Math.random());
	}
}