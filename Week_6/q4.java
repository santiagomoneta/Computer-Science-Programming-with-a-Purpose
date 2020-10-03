public class q4
{
    public static void q4(int n)
    {
       if (n <= 0) return;
       StdOut.println(n);
       q4(n-2);
       q4(n-3);
       StdOut.println(n);
    }

    public static void main (String[] args)
    {
        int i = Integer.parseInt(args[0]);
        q4(i);
    }
} 
