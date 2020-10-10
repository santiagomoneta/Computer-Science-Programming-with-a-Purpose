public class MaximumSquareSubmatrix
{
    private static int size3(int[][] a)
    {
        int n = a.length;
        int[][] dp = new int[n + 1][n + 1];
        int maxLen = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                if (a[i - 1][j - 1] == 1)
                {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    maxLen = Math.max(dp[i][j], maxLen);
                }
            }
        }

        printMatrix(dp);
        return maxLen;
    }

    private static int size2(int[][] a)
    {
        int n = a.length;
        int[][] dp = new int[n][n];
        int maxLen = 0;

        for (int i = 0; i < n; i++)
        {
            dp[i][0] = a[i][0];
        }
        
        for (int j = 0; j < n; j++)
        {
            dp[0][j] = a[0][j];
        }
        
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                if (a[i][j] == 1)
                {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }

        printMatrix(dp);
        return maxLen;
    }

    public static int size(int[][] a)
    {
        if (a.length == 0) return 0;

        int n = a.length;
        int[] dp = new int[n + 1];
        int maxLen = 0;
        int prev = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                int temp = dp[j];
                if (a[i - 1][j - 1] == 1)
                {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxLen = Math.max(dp[j], maxLen);
                }
                else dp[j] = 0;
                prev = temp;
            }
        }

        return maxLen;
    }

    private static void printMatrix(int[][] matrix)
    {
        int n = matrix.length;
        for (int j = 0; j < n; j++)
        {
            for (int i = 0; i < n; i++)
            {
                StdOut.print(matrix[i][j] + " ");
            }
            
            StdOut.println();
        }
    }

    public static void main(String[] args)
    {
        int value = StdIn.readInt();
        int[][] a = new int[value][value];

        while (!StdIn.isEmpty())
        {
            for (int j = 0; j < value; j++)
            {
                for (int i = 0; i < value; i++)
                {
                    a[i][j] = StdIn.readInt();
                }
            }
        }

        StdOut.println(size(a));
    }
}