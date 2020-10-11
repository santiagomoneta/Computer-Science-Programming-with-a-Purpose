import java.awt.Color;
public class grayscale
{
	public static void main(String[] args)
	{
		Picture pic = new Picture(args[0]); // create new picture variable
		
		for (int col = 0; col < pic.width(); col++)
			for (int row = 0; row < pic.height(); row++)
			{
				Color color = pic.get(col, row);
				Color gray = luminance.toGray(color);
				pic.set(col, row, gray);
			}
		pic.show();
	}	
}