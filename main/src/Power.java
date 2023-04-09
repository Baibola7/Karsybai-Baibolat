public class Power {
    /**
     @power- To find power of the number in a number
     @a - integer number
     @n - integer power of the number
     @return - the value of the finding power(integer)
     **/
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1/power(a, -n);
        } else {
            double result = 1;
            for (int i = 0; i < n; i++) {
                result *= a;
            }
            return result;
        }
    }

}
