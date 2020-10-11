public class RecursiveSquares
{
    public static void drawSquare(double x, double y, double size)
    {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, size/2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, size/2);
    }

    public static void draw(int n, double x, double y, double size)
    {
        if (n == 0) return;

        drawSquare(x, y, size);
        double ratio = 2.2;

        draw(n-1, x - size/2, y - size/2, size/ratio);  
        draw(n-1, x - size/2, y + size/2, size/ratio);   
        draw(n-1, x + size/2, y - size/2, size/ratio); 
        draw(n-1, x + size/2, y + size/2, size/ratio);
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        double x = 0.5, y = 0.5;
        double size = 0.5;
        draw(n, x, y, size);
    }

}