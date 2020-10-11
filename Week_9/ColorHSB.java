public class ColorHSB
{
    private static final int ARCH_FULL_CIRCLE = 360;

    private final int hue;
    private final int sat;
    private final int bright;

    public ColorHSB(int h, int s, int b)
    {
        if (0 > h || h >= ARCH_FULL_CIRCLE || 0 > s || s > 100 || 0 > b || b > 100) {
            throw new IllegalArgumentException("Please check the format of input");
        }
        hue = h;
        sat = s;
        bright = b;
    }

    public String toString()
    {
        return "(" + hue + ", " + sat + ", " + bright + ")";
    }

    public boolean isGrayscale()
    {
        return this.bright == 0 || this.sat == 0;
    }

    public int distanceSquaredTo(ColorHSB that)
    {
        if (that == null)
        {
            throw new IllegalArgumentException();
        }

        int h2 = that.hue;
        int s2 = that.sat;
        int b2 = that.bright;

        int h1 = this.hue;
        int s1 = this.sat;
        int b1 = this.bright;

        return Math.min(
                (h1 - h2) * (h1 - h2),
                (ARCH_FULL_CIRCLE - Math.abs(h1 - h2)) * (ARCH_FULL_CIRCLE - Math.abs(h1 - h2))
        ) + (s1 - s2) * (s1 - s2) + (b1 - b2) * (b1 - b2);
    }

    public static void main(String[] args)
    {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        ColorHSB color = new ColorHSB(h, s, b);

        int minDistance = ARCH_FULL_CIRCLE * ARCH_FULL_CIRCLE + 100 * 100 * 2;
        String closetColorName = "";
        ColorHSB closetColor = color;

        while (!StdIn.isEmpty())
        {
            String name = StdIn.readString();
            int h2 = StdIn.readInt();
            int s2 = StdIn.readInt();
            int b2 = StdIn.readInt();
            ColorHSB curColor = new ColorHSB(h2, s2, b2);

            int distance = color.distanceSquaredTo(curColor);
            if (distance < minDistance)
            {
                minDistance = distance;
                closetColorName = name;
                closetColor = curColor;
            }
        }

        StdOut.println(closetColorName + " " + closetColor);
    }
}