import java.awt.Color;
public class scale
{
	public static void main (String[] args)
	{
		String filename = args[0];
		int w = Integer.parseInt(args[1]);
		int h = Integer.parseInt(args[2]);
		Picture source_pic = new Picture(filename);
		Picture target_pic = new Picture(w, h);
		for (int tcol = 0; tcol < w; tcol++)
			for (int trow = 0; trow < h; trow++)
			{
				int scol = tcol * source_pic.width() / w;
				int srow = trow * source_pic.height() / h;
				Color color = source_pic.get(scol, srow);
				target_pic.set(tcol, trow, color);
			}
		target_pic.show();
	}
}