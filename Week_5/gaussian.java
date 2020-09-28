public class gaussian
{
	public static double pdf(double x)
	{
		return Math.exp(- x * x / 2) / Math.sqrt(2 * Math.PI);
	}

	public static double cdf(double z)
	{
		if (z < -8.0) return 0.0;
		if (z >  8.0) return 1.0;
		double sum = 0.0, term = z;
		for (int i = 3; sum + term != sum; i+= 2)
		{
			sum = sum + term;
			term = term * z * z / i;
		}
		return 0.5 + sum * pdf(z);
	}

	public static double cdf(double z, double mu, double sigma)
	{
		return cdf((z - mu) / sigma);
	}

	public static void main (String[] args)
	{
		double z = Double.parseDouble(args[0]);
		double mu = Double.parseDouble(args[1]);
		double sigma = Double.parseDouble(args[2]);
		StdOut.println(cdf(z, mu, sigma));
	}
}