public class BinomialCoefficient {
    /**
    @ binomialCoefficient - To find Binomial coefficient
    @ n - the first coefficient of the equation
    @ k - the second coefficient of the equation
    @ return - return the binomial coefficient
     **/
    public static int binomialCoefficient(int n, int k){
        if (k == 0) {
            return 1;
        }
        if (n == k) {
            return 1;
        }
        return binomialCoefficient(n-1,k-1) + binomialCoefficient(n-1, k);
    }
}
