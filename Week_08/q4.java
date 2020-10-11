public class q4
{
	public static void main(String[] args)
	{
		String example = "abcdabcdeabcd";
		String s = example.substring(1, 4);
		System.out.println("example= " + example);
		System.out.println("s= "+ s);
		String t = example.substring(5, 8);
		System.out.println("example= " + example);
		System.out.println("t= "+ t);

		System.out.println("s= "+ s);
		System.out.println("");
		System.out.println(s.length() == t.length());
		System.out.println(s == t);
		System.out.println(s.equals(t));
	}
}