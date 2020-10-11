public class HelloGoodbye {

    public static void main(String[] args) {
        // This program take the 2 arguments and form a simple hello/goodby sentense
        String arg1 = (args[0]);
        String arg2 = (args[1]);
        System.out.println("Hello " + arg1 + " and " + arg2);
        System.out.println("Goodbye " + arg2 + " and " + arg1);
    }
}