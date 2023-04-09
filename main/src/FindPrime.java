public class FindPrime {
    /**
     @isPrime- To Find a prime number
     @param - integer number (n)
     @return - a prime number object(integer)
     **/
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
