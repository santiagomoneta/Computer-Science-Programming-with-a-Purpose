public class q3
{
    public static void q3(int n)
    {
        if (n <= 0) return;
        StdOut.println(n);
        q3(n-2);
        q3(n-3);
        StdOut.println(n);
    }

    public static void main (String[] args)
    {
        int i = Integer.parseInt(args[0]);
        q3(i);
    }
} 
