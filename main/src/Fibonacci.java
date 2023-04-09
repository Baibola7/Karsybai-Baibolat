public class Fibonacci {
    /**
     @fibonacci- To find fibonacci elements of the number.
     @param - integer number (n)
     @return - a fibonacci elements object(integer)
     **/
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
