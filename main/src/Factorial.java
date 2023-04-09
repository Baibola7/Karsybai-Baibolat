public class Factorial {
    /**
     @factorial- To find factorial number
     @param - integer number (n)
     @return - a factorial number object(integer)
     **/
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}

