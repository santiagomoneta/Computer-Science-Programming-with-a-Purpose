public class Clock
{
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 60;

    private int hour;
    private int min;

    public Clock(int h, int m)
    {
        if (verify(h, m))
        {
            hour = h;
            min = m;
        }
    }

    public Clock(String s)
    {
        if (!s.contains(":"))
        {
            throw new IllegalArgumentException();
        }

        int i = s.indexOf(':');
        String hourStr = s.substring(0, i);
        String minStr = s.substring(i + 1);

        if (hourStr.length() != 2 || minStr.length() != 2) throw new IllegalArgumentException();

        int h = Integer.parseInt(hourStr);
        int m = Integer.parseInt(minStr);
        if (verify(h, m))
        {
            hour = h;
            min = m;
        }
    }

    private boolean verify(int h, int m)
    {
        if (h >= HOURS_PER_DAY || h < 0 || m < 0 || m >= MINUTES_PER_HOUR) throw new IllegalArgumentException("Please check the format of your inputs!");
        return true;
    }

    public String toString()
    {
        String h = hour >= 10 ? "" + hour : "0" + hour;
        String m = min >= 10 ? "" + min : "0" + min;
        return h + ":" + m;
    }

    public boolean isEarlierThan(Clock that)
    {
        if (this.hour > that.hour) return false;
        if (this.hour < that.hour) return true;
        return this.min < that.min;
    }

    public void tic() {
        if (this.hour == HOURS_PER_DAY - 1 && this.min == MINUTES_PER_HOUR - 1)
        {
            this.hour = 0;
            this.min = 0;
            return;
        }

        if (this.min == MINUTES_PER_HOUR - 1)
        {
            this.hour += 1;
            this.min = 0;
            return;
        }

        this.min += 1;
    }

    public void toc(int delta)
    {
        if (delta < 0) throw new IllegalArgumentException("Delta cannot be negative");
        int incH = delta / MINUTES_PER_HOUR;
        int incM = delta % MINUTES_PER_HOUR;

        this.hour = (this.hour + incH) % HOURS_PER_DAY;
        if (this.min + incM >= MINUTES_PER_HOUR)
        {
            this.hour += 1;
            this.hour = this.hour % HOURS_PER_DAY;
        }

        this.min = (this.min + incM) % MINUTES_PER_HOUR;
    }

    public static void main(String[] args)
    {
        Clock a = new Clock(0, 50);
        Clock b = new Clock("12:45");

        StdOut.println("Is " + a + " earlier than " + b + "? " + a.isEarlierThan(b));
        a.tic();
        StdOut.println("a tic: " + a);
        int delta = 61;
        b.toc(delta);
        StdOut.println("b toc + " + delta + " mins: " + b);
    }
}