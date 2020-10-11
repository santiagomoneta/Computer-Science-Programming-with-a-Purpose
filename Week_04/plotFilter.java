public class plotFilter
{
	public static void main(String[] args)
	{
		// read coodinates
		double xmin = StdIn.readDouble();
		double ymin = StdIn.readDouble();
		double xmax = StdIn.readDouble();
		double ymax = StdIn.readDouble();

		// rescale
		StdDraw.setXscale(xmin, xmax);
		StdDraw.setYscale(ymin, ymax);
		while (!StdIn.isEmpty())
		{
			// read and plot a point
			double x = StdIn.readDouble();
			double y = StdIn.readDouble();
			StdDraw.point(x, y);
		}
	}
}