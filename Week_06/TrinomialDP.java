public class TrinomialDP
{
    public static long trinomial(int n, int k)
    {
        k = Math.abs(k);

        long[][] tri = new long[n + 2][k + n + 1];

        tri[0][0] = 1;
        tri[1][0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= k + (n - i); j++)
            {
                if (j > i)
                {
                    tri[i][j] = 0;
                    continue;
                }

                tri[i][j] = tri[i - 1][Math.abs(j - 1)] + tri[i - 1][j] + tri[i - 1][j + 1];
            }
        }
        return tri[n][k];
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));
    }
}