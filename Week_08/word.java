public class word
{
	public static boolean isPalindrome(String s)
	{
		int N = s.length();
		for (int i = 0; i < N / 2; i++)
			if (s.charAt(i) != s.charAt(N-1-i))
				return false;
			return true;
	}	

	public static void main(String[] args)
	{
		String word = args[0];
		StdOut.println("Palindrome: " + isPalindrome(word));
	}
}