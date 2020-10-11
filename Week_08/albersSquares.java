import java.awt.Color;

public class albersSquares
{
	public static void main(String[] args)
	{
		// Create first color
		int r1 = Integer.parseInt(args[0]);
		int g1 = Integer.parseInt(args[1]);
		int b1 = Integer.parseInt(args[2]);
		Color c1 = new Color(r1, g1, b1);

		// Create second color
		int r2 = Integer.parseInt(args[3]);
		int g2 = Integer.parseInt(args[4]);
		int b2 = Integer.parseInt(args[5]);
		Color c2 = new Color(r2, g2, b2);

		// First square
		StdDraw.setPenColor(c1);
		StdDraw.filledSquare(.25, .5, .2);
		StdDraw.setPenColor(c2);
		StdDraw.filledSquare(.25, .5, .1);

		// Second square
		StdDraw.setPenColor(c2);
		StdDraw.filledSquare(.75, .5, .2);
		StdDraw.setPenColor(c1);
		StdDraw.filledSquare(.75, .5, .1);
	}
}