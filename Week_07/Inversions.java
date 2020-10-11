public class Inversions
{
    public static long count(int[] a)
    {
        long count = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] generate(int n, long k)
    {
        if (k > (long) n * (n - 1) / 2) throw new IllegalArgumentException();
        int[] a = new int[n];
        if (k == 0)
        {
            for (int i = 0; i < n; i++)
            {
                a[i] = i;
            }
            return a;
        }

        if (k == n * (n - 1) / 2)
        {
            for (int i = 0; i < n; i++)
            {
                a[i] = n - 1 - i;
            }
            return a;
        }

        int pos = n - 1;
        int start = 0;
        int end = n - 1;
        while (start != end)
        {
            if (k >= pos)
            {
                a[start] = pos;
                k = k - pos;
                start++;
            }
            else
            {
                a[end] = pos;
                end--;
            }
            pos--;
        }

        return a;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int[] a = generate(n, k);

        for (int i = 0; i < a.length; i++)
        {
            StdOut.print(a[i] + " ");
        }
    }

}