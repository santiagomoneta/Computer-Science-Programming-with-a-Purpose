public class hanoi
{
    public static String hanoi(int n, boolean left)
    {
        if (n == 0) return " ";
        String move;

        if (left)   move = n + " to the Left\n";
        else        move = n + " to the Right\n";

        return hanoi(n - 1, !left) + move + hanoi(n - 1, !left); 
    }

    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        StdOut.println(hanoi(n, false));
    }
}