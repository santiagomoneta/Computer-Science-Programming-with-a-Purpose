public class ruler
{
    public static String ruler(int n)
    {
        if (n == 0) return " ";
        return ruler(n-1) + n + ruler(n-1);
    }

    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(ruler(n));
    }
}