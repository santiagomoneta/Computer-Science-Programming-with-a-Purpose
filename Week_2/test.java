public class test {
 public static void main(String[] args)
    { 
        int a = 3;
        int b = 2;
        int c = 4;
        if (a < b)
        {
            if (b < c)
            {
                if (c < a) System.out.println(a + " " + b + " " + c);
                else System.out.println(c + " " + b + " " + a);
            }
            else System.out.println(a + " " + c + " " + b);
        }
        else System.out.println(b + " " + a + " " + c);
    }

}