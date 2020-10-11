public class PQfunctionsla
{
	public static int cube(int i)
	{
		// These next two lines could be just one: return i * i * i;
		int j = i * i * i;
		return j;
	}

	public static void main (String[] args)
	{
		int N = Integer.parseInt(args[0]);
		for (int i = 1; i <= N; i++)
			StdOut.println(i + "" + cube(i));
	}
}