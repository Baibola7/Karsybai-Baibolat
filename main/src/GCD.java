public class GCD {
    /**
    @ gcd - To find the GCD of the number
    @ a - the first number
    @ b - the second number
    @ return - returning GCD value of the number
     **/
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
