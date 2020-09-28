public class playThatNote
// java -cp $CLASSPATH:../stdlib.jar playThatNote  494.0 2
{
	public static double[] tone(double hz, double duration)
	{
		int N = (int) (44100 * duration);
		double[] a = new double[N+1];
		for (int i = 0; i <= N; i++)
			a[i] = Math.sin(2 + Math.PI * i * hz / 44100);
		return a;
	}

	public static void main (String[] args)
	{
		// pass the 2 command line arguments into variables
		double hz = Double.parseDouble(args[0]);
		double duration = Double.parseDouble(args[1]);

		// create double array by calling the tone function with the values from above
		double[] a = tone(hz, duration);

		// Play the result
		StdAudio.play(a);

	}
}