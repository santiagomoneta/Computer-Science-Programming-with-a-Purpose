public class RightTriangle {
	public static void main(String[] args) {
	// This small program takes 3 arguments as triange side lengh and calculate if it is a right triangle
		int arg0 = Integer.parseInt(args[0]);
		int arg1 = Integer.parseInt(args[1]);
		int arg2 = Integer.parseInt(args[2]);
		System.out.println((arg2*arg2 == arg0*arg0 + arg1*arg1 || arg1*arg1 == arg0*arg0 + arg2*arg2 || arg0*arg0 == arg1*arg1 + arg2*arg2) && (arg2>0 && arg1>0 && arg0>0));
	}
}