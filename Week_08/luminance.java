import java.awt.Color;

public class luminance
{
	public static double lum(Color c)
	{
		int r = c.getRed();
		int g = c.getGreen();
		int b = c.getBlue();
		return .299*r + .587*g + .144*b;
	}

	public static Color toGray(Color c)
	{
		int y = (int) Math.round(lum(c));
		Color gray = new Color(y,y,y);
		return gray;
	}

	public static void main (String[] args)
	{
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		Color c = new Color(r, g, b);
		StdOut.println(Math.round(lum(c)));
	}
}