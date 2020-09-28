public class randomPoints
{
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i < 0; i++)
		{
			double x = StdRandom.gaussian(0.5, 0.2);
			double y = StdRandom.gaussian(0.5, 0.2);
			StdDraw.point(x, y)
		}
	}
}